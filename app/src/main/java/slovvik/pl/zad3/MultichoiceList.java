package slovvik.pl.zad3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static slovvik.pl.zad3.BasicList.STRINGS;

public class MultichoiceList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multichoice_list);

        listView = (ListView) findViewById(R.id.multuchoiceList);
        listView.setOnItemClickListener(this);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this
                , android.R.layout.simple_list_item_multiple_choice
                , STRINGS);
        listView.setAdapter(stringArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        StringBuilder stringBuilder = new StringBuilder();
        SparseBooleanArray sparseBooleanArray = listView.getCheckedItemPositions();

        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            if (sparseBooleanArray.valueAt(i)) {
                int index = sparseBooleanArray.keyAt(i);
                stringBuilder.append(" ").append(String.valueOf(index + 1));
            }
        }

        Toast.makeText(getApplicationContext()
                , "Wybrałeś:" + stringBuilder.toString()
                , Toast.LENGTH_SHORT).show();
    }
}
