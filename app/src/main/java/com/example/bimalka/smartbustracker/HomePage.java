package com.example.bimalka.smartbustracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class HomePage extends AppCompatActivity {

    private EditText startingLocation;
    private EditText destination;
    private Button save;

    DatabaseReference databaseReference;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        startingLocation =(EditText) findViewById(R.id.txtFrom);
        destination =(EditText) findViewById(R.id.txtTo);
        save =(Button) findViewById(R.id.btnSave);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("SavedSearch");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              addData();
            }
        });
    }



    public void addData(){
        String StartingLocation = startingLocation.getText().toString().trim();
        String Destination = destination.getText().toString().trim();

        SaveFavRoutes saveFavRoutes = new SaveFavRoutes(StartingLocation,Destination);
        databaseReference.push().setValue(saveFavRoutes);
        Toast.makeText(getApplication(),"Saved Successfully",Toast.LENGTH_LONG).show();
    }

    public void viewMap1(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewMap2(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewMap3(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewMap4(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewMap5(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewMap6(View view){
        Intent intent=new Intent(getApplicationContext(),SingleMapDetailPage.class);
        startActivity(intent);
    }
    public void viewCommonMap(View view){
        Intent intent=new Intent(getApplicationContext(),CommonMapDetailPage.class);
        startActivity(intent);
    }
    public void viewFavouriteTrackings(View view){
        Intent intent=new Intent(getApplicationContext(),FavouriteTrackingsPage.class);
        startActivity(intent);
    }
}
