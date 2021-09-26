package com.example.retoindividualandroid.ui.galeria;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.retoindividualandroid.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class GaleriaFragment extends Fragment
{
    TabLayoutMediator tabLayoutMediator;
    TabLayout tabLayout;
    private GaleriaViewModel mViewModel;
    ViewPagerAdapter vpAdapter;
    ViewPager2 viewPager2;

    public static GaleriaFragment newInstance()
    {
        return new GaleriaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.galeria_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        vpAdapter = new ViewPagerAdapter(this);
        viewPager2 = view.findViewById(R.id.vpGaleria);
        viewPager2.setAdapter(vpAdapter);

        tabLayout = view.findViewById(R.id.tab_layout);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText("OBJECT " + (position + 1))).attach();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GaleriaViewModel.class);
        // TODO: Use the ViewModel
    }

}