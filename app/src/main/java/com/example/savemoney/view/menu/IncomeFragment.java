package com.example.savemoney.view.menu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.savemoney.R;
import com.example.savemoney.databinding.FragmentIncomeBinding;

public class IncomeFragment extends Fragment {
    FragmentIncomeBinding binding;
    NavController controller;
    Button btnToHistoryIOFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        controller = Navigation.findNavController(requireActivity(),R.id.nav_host_fragment_container);
        binding = FragmentIncomeBinding.inflate(inflater,container,false);
        return binding.getRoot();    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnToHistoryIOFragment = binding.btnDetail;
        btnToHistoryIOFragment.setOnClickListener(v->{
            controller.navigate(R.id.historyIOFragment);
        });
    }
}