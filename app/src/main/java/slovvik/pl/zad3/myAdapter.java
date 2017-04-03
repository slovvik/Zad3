package slovvik.pl.zad3;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Bartek on 03.04.2017.
 */

public class myAdapter extends BaseAdapter {

    private Context context;

    public Integer[] idImages = {
            R.drawable.img1, R.drawable.img2, R.drawable.img3,
            R.drawable.img2, R.drawable.img3, R.drawable.img1,
            R.drawable.img3, R.drawable.img1, R.drawable.img2
    };

    public myAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return idImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(idImages[position]);
        return imageView;
    }
}
