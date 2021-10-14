package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.List;

import AdapPackage.PagerAdapt;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PagerAdapt adapt;
    private BlankFragment blankFragment;
    private BlankFragment3 blankFragment3;
    private BlankFragment1 blankFragment1;
    private BlankFragment2 blankFragment2;
    private List<Fragment> fragmentList;
    private ViewPager  pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button)findViewById(R.id.btn_1);
        Button button3=findViewById(R.id.btn_3);
        Button button4=(Button)findViewById(R.id.btn_4);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button.setOnClickListener(this);
        Button button2=(Button)findViewById(R.id.btn_2);
        button2.setOnClickListener(this);
        fragmentList=new ArrayList<>();
        blankFragment=new BlankFragment();
        blankFragment3=new BlankFragment3();
        blankFragment1=new BlankFragment1();
        blankFragment2=new BlankFragment2();
        fragmentList.add(blankFragment);
        fragmentList.add(blankFragment3);
        fragmentList.add(blankFragment1);
        fragmentList.add(blankFragment2);
        FragmentManager fragmentManager=getSupportFragmentManager();
        adapt=new PagerAdapt(fragmentManager,fragmentList);
        pager=findViewById(R.id.pager);
        pager.setAdapter(adapt);
        pager.setCurrentItem(0);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                pager.setCurrentItem(0);
                break;
            case R.id.btn_2:
               pager.setCurrentItem(1);
                break;
            case R.id.btn_3:
                pager.setCurrentItem(2);
                break;
            case R.id.btn_4:
                pager.setCurrentItem(3);
                break;
        }
    }
}