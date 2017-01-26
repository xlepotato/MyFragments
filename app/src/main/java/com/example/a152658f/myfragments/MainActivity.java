package com.example.a152658f.myfragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentInput.OnFragmentAListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.fragment_container) !=null){
            FragmentInput firstFragment = new FragmentInput();
            firstFragment.setArguments(getIntent().getExtras());

           getFragmentManager().beginTransaction().add(R.id.fragment_container,firstFragment).commit();
        }
    }

    @Override
    public void onButtonPressed(String userInput) {

        Toast.makeText(this,userInput,Toast.LENGTH_LONG).show();

        FragmentDisplay newFragment = new FragmentDisplay();

        Bundle args = new Bundle();
        args.putString(FragmentDisplay.ARG_USERINPUT, userInput);
        newFragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragment_container,newFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
