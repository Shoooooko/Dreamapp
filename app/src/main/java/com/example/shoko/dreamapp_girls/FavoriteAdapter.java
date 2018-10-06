package com.example.shoko.dreamapp_girls;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shoko.dreamapp_girls.Person;
import com.example.shoko.dreamapp_girls.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FavoriteAdapter extends ArrayAdapter<Person>{
    private int mResource;
    private List<Person> mItems;
    private LayoutInflater mInflater;

    /**
     * コンストラクタ
     * @param context コンテキスト
     * @param resource リソースID
     * @param items リストビューの要素
     */
    public FavoriteAdapter(Context context, int resource, List<Person> persons) {
        super(context, resource, persons);
        mResource = resource;
        mItems = persons;
        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView != null) {
            view = convertView;
        }
        else {
            view = mInflater.inflate(mResource, null);
        }

        // リストビューに表示する要素を取得
        Person person = mItems.get(position);

        TextView nameView = view.findViewById(R.id.name);
        TextView summaryView = view.findViewById(R.id.summary);
        ImageView imageView = view.findViewById(R.id.image);

        nameView.setText(person.getName());
        summaryView.setText(person.getSummary());
        try {
            InputStream istream = getContext().getResources().getAssets().open(person.getImage());
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return view;
    }
}

