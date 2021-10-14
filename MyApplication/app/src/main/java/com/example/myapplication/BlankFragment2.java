package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import AdapPackage.ComeAdapt;

public class BlankFragment2 extends Fragment {
    ListView listView;
    private List<xiaoxi> list;
    SimpleAdapter simpleAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        listView = view.findViewById(R.id.list_item1);
        list=new ArrayList<>();
        list.add(new xiaoxi("支付",R.drawable.zhifu));
        list.add(new xiaoxi("收藏",R.drawable.shouc));
        list.add(new xiaoxi("朋友圈",R.drawable.zhaop));
        list.add(new xiaoxi("卡包",R.drawable.kabao));
        list.add(new xiaoxi("表情",R.drawable.biaoq));
        list.add(new xiaoxi("设置",R.drawable.shez));
        listView.setAdapter(new ComeAdapt(list,getActivity()));
        return view;
    }

}