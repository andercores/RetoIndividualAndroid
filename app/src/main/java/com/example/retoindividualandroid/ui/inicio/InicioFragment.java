package com.example.retoindividualandroid.ui.inicio;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.retoindividualandroid.Cursos;
import com.example.retoindividualandroid.CursosAdapter;
import com.example.retoindividualandroid.MainActivity;
import com.example.retoindividualandroid.R;

import java.util.ArrayList;

public class InicioFragment extends Fragment
{
    private ArrayList<Cursos> cursos = new ArrayList<>();

    private InicioViewModel mViewModel;

    public static InicioFragment newInstance()
    {
        return new InicioFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {

        return inflater.inflate(R.layout.inicio_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InicioViewModel.class);
        // TODO: Use the ViewModel
    }

}