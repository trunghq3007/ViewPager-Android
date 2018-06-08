package com.example.admin.viewpager_android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 6/7/2018
 * @updated 6/7/2018
 * @modified by
 * @updated on 6/7/2018
 * @since 1.0
 */
public class IOSFragment extends Fragment {
    public IOSFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ios, container, false);
    }
}
