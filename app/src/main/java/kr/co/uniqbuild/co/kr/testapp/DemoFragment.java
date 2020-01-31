package kr.co.uniqbuild.co.kr.testapp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class DemoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        View v = inflater.inflate(android.R.layout.list_content, parent, false);
        v.setBackgroundColor(getArguments().getInt("color"));
        return v;
    }

    public static DemoFragment newInstance(int color) {
        DemoFragment f = new DemoFragment();
        Bundle args = new Bundle();
        args.putInt("color", color);
        f.setArguments(args);
        return f;
    }
}