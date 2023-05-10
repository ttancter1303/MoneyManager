package com.example.savemoney.view.viewpager;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savemoney.R;
import com.example.savemoney.databinding.FragmentColumChartAllBottleMoneyBinding;
import com.example.savemoney.databinding.FragmentIncomeBinding;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class ColumChartAllBottleMoneyFragment extends Fragment {
    FragmentColumChartAllBottleMoneyBinding binding;
    ArrayList barArrayList;
    BarChart barChart;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentColumChartAllBottleMoneyBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        barChart = binding.barChart;
//        BarDataSet barDataSet = new BarDataSet(barArrayList,"Test chart");
//        BarData barData = new BarData(barDataSet);
//        barChart.setData(barData);
//        barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);

    }
}