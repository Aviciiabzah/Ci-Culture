package com.example.ci_culture;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.google.firebase.firestore.GeoPoint;

import java.util.ArrayList;

public class BussinesAdapter extends BaseAdapter {
    private ArrayList <Bussines> bussinesArrayList;
    private Context context ;
    public BussinesAdapter (Context context,ArrayList <Bussines> bussinesArrayList){
       this.context = context;
       this.bussinesArrayList = bussinesArrayList;
    }
   @Override
   public int getCount() {
      return bussinesArrayList.size();
   }

   @Override
   public Object getItem(int i) {
      return bussinesArrayList.get(i);
   }

   @Override
   public long getItemId(int i) {
      return i;
   }

   @Override
   public View getView(int i, View view, ViewGroup viewGroup) {
      BussinesViewHolder bussinesViewHolder;
       if(view == null){
          view = LayoutInflater.from(context).inflate(R.layout.list_view_bussines,viewGroup,false);
          bussinesViewHolder = new BussinesViewHolder(view);
          view.setTag(bussinesViewHolder);
       }
       else {
          bussinesViewHolder = (BussinesViewHolder)view.getTag();
       }
       Bussines bussines =(Bussines) getItem(i);
       bussinesViewHolder.getTxtTitle().setText(bussines.getTitle());
       bussinesViewHolder.getTxtDescription().setText(bussines.getDescription());
       bussinesViewHolder.getTxtOpeningHours().setText(bussines.getOpeningHours());
       bussinesViewHolder.getBtnMap().setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               GeoPoint location = bussines.getLocation();
               if(location == null)
               {
                   Log.e("BussinesAdapter","location is null for bussines id "+bussines.getTitle());
                   Toast.makeText(context, "location unkhown", Toast.LENGTH_SHORT).show();
               }
               else{
                   openMapActivity(bussines.getLocation().getLatitude(),bussines.getLocation().getLongitude(),bussines.getTitle());
               }
           }
       });
       return view;
   }
    private  void openMapActivity(double lat,double lng,String title){
        Intent intent = new Intent(context, MapsActivity.class);
        intent.putExtra("lat",lat);
        intent.putExtra("lng",lng);
        intent.putExtra("title",title);
        context.startActivity(intent);
    }
}
