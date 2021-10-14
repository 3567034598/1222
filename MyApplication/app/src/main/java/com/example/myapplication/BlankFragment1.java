package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AdapPackage.ComeAdapt;


public class BlankFragment1 extends Fragment implements View.OnClickListener {
    SimpleAdapter simpleAdapter;
    List<xiaoxi> list;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank1, container, false);
        ListView listView=view.findViewById(R.id.list_item2);
        list=new ArrayList<>();
        list.add(new xiaoxi("朋友圈",R.drawable.pyq));
        list.add(new xiaoxi("扫一扫",R.drawable.saoyisao));
        list.add(new xiaoxi("摇一摇",R.drawable.yaoyiyao));
        list.add(new xiaoxi("看一看",R.drawable.kanyikan));
        list.add(new xiaoxi("搜一搜",R.drawable.saoyisao));
        list.add(new xiaoxi("直播和附近",R.drawable.zhibo));
        list.add(new xiaoxi("购物",R.drawable.gouwu));
        list.add(new xiaoxi("游戏",R.drawable.youxi));
        list.add(new xiaoxi("小程序",R.drawable.xiaocyu));
        listView.setAdapter(new ComeAdapt(list,getActivity()));
        Button button=view.findViewById(R.id.jiahao);
        button.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.jiahao:
               View view1=getLayoutInflater().inflate(R.layout.layout5,null);
               PopupWindow popupWindow=new PopupWindow(view1,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);
               popupWindow.showAsDropDown(v.findViewById(R.id.jiahao));
               break;
       }
    }
}