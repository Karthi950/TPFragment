package com.example.karthi.tpfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Karthi on 30/03/2016.
 */
public class MainFragment extends Fragment {

    private static final String TAG="MainFragment";

    @Override
    public

    @Nullable
    @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        return  inflater.inflate(R.layout.fragment_main,container,false);

    }


    @Override
    public void onAttach(Context context){

        Log.i(TAG, Util.getMethodName());
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
                                                            
        Log.i(TAG, Util.getMethodName());
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState){


        Log.i(TAG, Util.getMethodName());
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onStart(){

        Log.i(TAG, Util.getMethodName());
        super.onStart();

    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i(TAG,Util.getMethodName());
    }

}
