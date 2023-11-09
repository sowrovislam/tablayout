package com.example.testfremlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

TabLayout tablayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablayout=findViewById(R.id.tablayout);




        FragmentManager fragmentManager=getSupportFragmentManager();

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment,new BlankFragment());
        fragmentTransaction.commit();


        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                String tabtex= tab.getText().toString();

                Toast.makeText(MainActivity.this,tabtex,  Toast.LENGTH_SHORT).show();

                int tabposition=tab.getPosition();


                if (tabposition==0){

                    FragmentManager fragmentManager=getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.fragment,new BlankFragment());
                    fragmentTransaction.commit();

                } else if (tabposition==1) {


                    FragmentManager fragmentManager=getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                    fragmentTransaction.add(R.id.fragment,new BlankFragment2());
                    fragmentTransaction.commit();

                }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });













    }
}