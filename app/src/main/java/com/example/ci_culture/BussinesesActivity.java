package com.example.ci_culture;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class BussinesesActivity extends AppCompatActivity {

    final String BusinessesCollection = "Businesses";
    ListView lstBussines ;
     private ArrayList<Bussines> bussinesArrayList = new ArrayList<>();
     BussinesAdapter bussinesAdapter;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bussineses);
        lstBussines=findViewById(R.id.lstBussines);
        loadBusinesses();

    }
    private void loadBusinesses(){
        db.collection(BusinessesCollection).get().addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
            @Override
            public void onComplete(@NonNull Task<QuerySnapshot> task) {
                if (task.isSuccessful()){
                    for(QueryDocumentSnapshot doc:task.getResult()){
                        Bussines bussines = doc.toObject(Bussines.class);
                        Log.d("loadBusinesses",bussines.toString());
                        bussinesArrayList.add(bussines);
                    }
                    bussinesAdapter = new BussinesAdapter(BussinesesActivity.this,bussinesArrayList);
                    lstBussines.setAdapter(bussinesAdapter);
                }
                else {
                    Log.w("loadBusinesses","Error getting documents:",task.getException());
                }
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("loadBusinesses","Error getting documents:",e);
            }
        });
    }
}