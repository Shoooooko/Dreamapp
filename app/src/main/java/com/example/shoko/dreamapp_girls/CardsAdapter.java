package com.example.shoko.dreamapp_girls;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
public class CardsAdapter extends BaseAdapter {
    ArrayList<Person> persons;
    Context context;
    public CardsAdapter(ArrayList<Person> persons, Context context) {
        this.persons = persons;
        this.context = context;
    }
    @Override
    public int getCount() {
        return persons.size();
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
        Person person = persons.get(position);
        View view = convertView;
        viewHolder holder = new viewHolder();
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.swipe_item, parent, false);
            holder.nameView = view.findViewById(R.id.name);
            holder.nameView.setText(person.getName());
            holder.summaryView = view.findViewById(R.id.summary);
            holder.mottoView = view.findViewById(R.id.motto);
            holder.imageView = view.findViewById(R.id.image);
            holder.tp_ageView = view.findViewById(R.id.tp_age);
            holder.tp_descView = view.findViewById(R.id.tp_desc);
            holder.cr_age1View = view.findViewById(R.id.cr_age1);
            holder.cr_desc1View = view.findViewById(R.id.cr_desc1);
            holder.cr_age2View = view.findViewById(R.id.cr_age2);
            holder.cr_desc2View = view.findViewById(R.id.cr_desc2);
            holder.cr_age3View = view.findViewById(R.id.cr_age3);
            holder.cr_desc3View = view.findViewById(R.id.cr_desc3);
            holder.cr_age4View = view.findViewById(R.id.cr_age4);
            holder.cr_desc4View = view.findViewById(R.id.cr_desc4);
            holder.cr_age5View = view.findViewById(R.id.cr_age5);
            holder.cr_desc5View = view.findViewById(R.id.cr_desc5);
            initview(person, holder);
            }
        return view;
    }

    public void updatePersonList(Person person) {
        persons.clear();
//        persons.addAll(new_data);
        persons.add(person);
        this.notifyDataSetChanged();
    }

    public void initview(Person person, viewHolder holder){
        holder.nameView.setText(person.getName());
        holder.summaryView.setText(person.getSummary());
        holder.mottoView.setText(person.getMotto());
        try {
            InputStream istream = context.getResources().getAssets().open(person.getImage());
            Bitmap bitmap = BitmapFactory.decodeStream(istream);
            holder.imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }


        CareerPass tp = person.getCareerPass()[person.getTurningPointIndex()];
        holder.tp_ageView.setText(String.valueOf(tp.getAge()));
        holder.tp_ageView.setText(""+tp.getAge());
        holder.tp_descView.setText(tp.getText());
        holder.cr_age1View.setText(""+person.getCareerPass()[0].getAge());
        holder.cr_desc1View.setText(person.getCareerPass()[0].getText());
        holder.cr_age2View.setText(""+person.getCareerPass()[1].getAge());
        holder.cr_desc2View.setText(person.getCareerPass()[1].getText());
        holder.cr_age3View.setText(""+person.getCareerPass()[2].getAge());
        holder.cr_desc3View.setText(person.getCareerPass()[2].getText());
        holder.cr_age4View.setText(""+person.getCareerPass()[3].getAge());
        holder.cr_desc4View.setText(person.getCareerPass()[3].getText());
        holder.cr_age5View.setText(""+person.getCareerPass()[4].getAge());
        holder.cr_desc5View.setText(person.getCareerPass()[4].getText());
    }


    static class viewHolder {
        TextView nameView;
        TextView summaryView;
        ImageView imageView;
        TextView mottoView;
        TextView tp_ageView;
        TextView tp_descView;
        TextView cr_age1View;
        TextView cr_desc1View;
        TextView cr_age2View;
        TextView cr_desc2View;
        TextView cr_age3View;
        TextView cr_desc3View;
        TextView cr_age4View;
        TextView cr_desc4View;
        TextView cr_age5View;
        TextView cr_desc5View;
    }
}