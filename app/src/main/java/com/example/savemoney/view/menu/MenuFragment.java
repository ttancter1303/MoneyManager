package com.example.savemoney.view.menu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.savemoney.databinding.FragmentMenuBinding;
import com.example.savemoney.view.viewpager.MenuFragmentAdapter;


public class MenuFragment extends Fragment {
    FragmentMenuBinding binding;
    ViewPager2 viewPager2;
    TableLayout tabLayout;
    MenuFragmentAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager2 = binding.viewPager2;
        tabLayout = binding.tabLayout;
        adapter = new MenuFragmentAdapter(this);
        viewPager2.setAdapter(adapter);



    }
}