package com.example.savemoney.view.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MenuFragmentAdapter extends FragmentStateAdapter {
    public MenuFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public MenuFragmentAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public MenuFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new ColumChartAllBottleMoneyFragment();
            case 2:
                return new ColumChartIOFragment();
            case 0:
            default:
                return new BottleMoneyFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
