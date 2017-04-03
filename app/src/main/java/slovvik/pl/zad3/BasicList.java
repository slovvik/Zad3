package slovvik.pl.zad3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BasicList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public static String [] STRINGS = {"Telefon"
            , "TV"
            , "Kot"
            , "Pies"
            , "Lampa"
            , "Kubek"
            , "Woda"
            , "Miód"
            , "Łyżka"
            , "Klawiatura"
            , "Myszka"
            , "Słoik"
            , "Monitor"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista1);

        ListView listView = (ListView) findViewById(R.id.basicList);
        listView.setOnItemClickListener(this);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this
                , android.R.layout.simple_list_item_1
                , STRINGS);
        listView.setAdapter(stringArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext()
                , (String) parent.getItemAtPosition(position)
                , Toast.LENGTH_SHORT).show();
    }
}
