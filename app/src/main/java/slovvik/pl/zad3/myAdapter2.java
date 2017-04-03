package slovvik.pl.zad3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import static slovvik.pl.zad3.MainActivity.ltxt1;
import static slovvik.pl.zad3.MainActivity.ltxt2;

/**
 * Created by Bartek on 03.04.2017.
 */

public class myAdapter2 extends BaseAdapter {

    private LayoutInflater layoutInflater = null;
    Context context;

    public myAdapter2(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return ltxt1.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.list_row, null);
        }
        view = convertView;
        TextView tv1 = (TextView) view.findViewById(R.id.row_tv1);
        tv1.setText(ltxt1[position]);

        TextView tv2 = (TextView) view.findViewById(R.id.row_tv2);
        tv2.setText(ltxt2[position]);
        return view;
    }
}
