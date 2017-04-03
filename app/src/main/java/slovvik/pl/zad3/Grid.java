package slovvik.pl.zad3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class Grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView gridView = ((GridView) findViewById(R.id.grid));
        gridView.setAdapter(new myAdapter(this));
    }
}
