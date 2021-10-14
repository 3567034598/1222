package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import AdapPackage.ComeAdapt;


public class BlankFragment3 extends Fragment {
    ListView listView;
    List<xiaoxi> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank3, container, false);

        listView=view.findViewById(R.id.list_item3);
        list=new ArrayList<>();
        list.add(new xiaoxi("新的朋友",R.drawable.ic_launcher_foreground));
        list.add(new xiaoxi("仅聊天的朋友",R.drawable.ic_launcher_foreground));
        list.add(new xiaoxi("群聊",R.drawable.ic_launcher_foreground));
        list.add(new xiaoxi("标签",R.drawable.ic_launcher_foreground));
        list.add(new xiaoxi("公众号",R.drawable.ic_launcher_foreground));
        listView.setAdapter(new ComeAdapt(list,getActivity()));
        return view;

    }
}