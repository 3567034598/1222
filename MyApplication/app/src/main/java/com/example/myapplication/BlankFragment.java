package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlankFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        ListView listView=view.findViewById(R.id.list_view);
        List<xiaoxi> list=new ArrayList<>();
        listView.setAdapter(new SimpleAdapter(getActivity(),getData(),R.layout.layout4,
                new String[]{"title","image"},new int[]{R.id.name1,R.id.image2}));
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                View view1=getLayoutInflater().inflate(R.layout.layout6,null);
                PopupWindow popupWindow=new PopupWindow(view1,ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);
                popupWindow.showAsDropDown(view);
                return true;
            }
        });
        return view;
    }

    private List<Map<String,Object>> getData() {
        List<Map<String,Object>> list=new ArrayList<>();
        String[] titles={"某","某某","某某某","某","某某","某某某","某","某某","某某某"};
        int[] images={R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,
                R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground};
        for(int i=0;i<titles.length;i++){
            Map map=new HashMap();
            map.put("title",titles[i]);
            map.put("image",images[i]);
            list.add(map);
        }
        return list;
    }
}