package com.example.viewandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this,"fasilitas ini belom tersedia. ", Toast.LENGTH_LONG);
        toast.show();
    }
}