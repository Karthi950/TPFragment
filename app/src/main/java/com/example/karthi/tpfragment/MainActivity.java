package com.example.karthi.tpfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, Util.getMethodName());

        MainFragment mainFragment= new MainFragment();

        if(findViewById(R.id.fragment_container)!=null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.fragment_container, mainFragment);
            transaction.commit();
//
        }
    }

    @Override
    public void onStart(){

        Log.i(TAG, Util.getMethodName());
        super.onStart();

    }

    @Override
    protected void onResume(){
        super.onResume();
    }

}
