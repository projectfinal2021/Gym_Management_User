package com.example.gymmanagementuser.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gymmanagementuser.KEYS;
import com.example.gymmanagementuser.R;
import com.example.gymmanagementuser.Tools;
import com.example.gymmanagementuser.databinding.FragmentDietChartBinding;
import com.example.gymmanagementuser.databinding.FragmentRoutineBinding;

public class RoutineFragment extends Fragment {
    private static final String TAG = "RoutineFragment";
    private FragmentRoutineBinding fragmentRoutineBinding;

    public RoutineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        fragmentRoutineBinding = FragmentRoutineBinding.inflate(inflater, container, false);
        View view = fragmentRoutineBinding.getRoot();

        fragmentRoutineBinding.textviewRoutineFragHeader.setText("Routine: " + Tools.getPref(KEYS.BODY_TYPE, null));

        return view;
    }
}