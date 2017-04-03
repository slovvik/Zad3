package slovvik.pl.zad3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Lista3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista3);

        myAdapter2 myAdapter2 = new myAdapter2(this);
        ListView listView = (ListView) findViewById(R.id.customList);
        listView.setAdapter(myAdapter2);
    }
}
