package slovvik.pl.zad3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] strings = {"Pozycja 1", "Pozycja 2", "Pozycja 3"};
    String[] positions = {"1", "2", "3"};
    public static String[] ltxt1 = {"Pozycja 1", "Pozycja 2", "Pozycja 3", "Pozycja 4", "Pozycja 5", "Pozycja 6", "Pozycja 7", "Pozycja 8", "Pozycja 9", "Pozycja 10"};
    public static String[] ltxt2 = {"Tekst 1", "Tekst 2", "Tekst 3", "Tekst 4", "Tekst 5", "Tekst 6", "Tekst 7", "Tekst 8", "Tekst 9", "Tekst 10"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = ((Spinner) findViewById(R.id.spinner));
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                strings);
        stringArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(stringArrayAdapter);
    }

    public void basicList(View view) {
        Intent intent  = new Intent(this, BasicList.class);
        startActivity(intent);
    }

    public void multichoiceList(View view) {
        Intent intent  = new Intent(this, MultichoiceList.class);
        startActivity(intent);
    }

    public void grid(View view) {
        Intent intent  = new Intent(this, Grid.class);
        startActivity(intent);
    }

    public void customList(View view) {
        Intent intent  = new Intent(this, Lista3.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),
                "Wybrałeś: " + positions[position],
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
