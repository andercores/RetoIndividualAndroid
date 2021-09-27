package com.example.retoindividualandroid.ui.galeria;

import androidx.fragment.app.FragmentManager;
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

        FragmentManager fm = getActivity().getSupportFragmentManager();

        vpAdapter = new ViewPagerAdapter(fm, getLifecycle());
        viewPager2 = view.findViewById(R.id.vpGaleria);
        viewPager2.setAdapter(vpAdapter);

        tabLayout = view.findViewById(R.id.tab_layout);

        //new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> tab.setText("Interior ")).attach();
        tabLayout.addTab(tabLayout.newTab().setText("Interior"));
        tabLayout.addTab(tabLayout.newTab().setText("Exterior"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab)
            {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback()
        {
            @Override
            public void onPageSelected(int position)
            {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(GaleriaViewModel.class);
        // TODO: Use the ViewModel
    }

}