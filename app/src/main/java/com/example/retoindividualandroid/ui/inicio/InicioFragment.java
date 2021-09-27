package com.example.retoindividualandroid.ui.inicio;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.retoindividualandroid.Cursos;
import com.example.retoindividualandroid.CursosAdapter;
import com.example.retoindividualandroid.MainActivity;
import com.example.retoindividualandroid.R;

import java.util.ArrayList;

public class InicioFragment extends Fragment
{
    private ListView listView;

    private ArrayList<Cursos> cursos = new ArrayList<>();

    private String[] cursos2= {"DAM1", "DAM2","ASIR1","ASIR2","GA1","GA2","SMR1","SMR2"};

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
        cursos();
        View view = inflater.inflate(R.layout.inicio_fragment, container, false);
        listView = view.findViewById(R.id.lvCursos);
        CursosAdapter adapter = new CursosAdapter(view.getContext(), cursos);
        ListView lista =view.findViewById(R.id.lvCursos);
        lista.setAdapter(adapter);


        return view;
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(InicioViewModel.class);
        // TODO: Use the ViewModel
    }

    public void cursos()
    {
        cursos = new ArrayList<>();
        cursos.add(new Cursos("DAM1"));
        cursos.add(new Cursos("DAM2"));
        cursos.add(new Cursos("ASIR1"));
        cursos.add(new Cursos("ASIR2"));
        cursos.add(new Cursos("SMR1"));
        cursos.add(new Cursos("SMR2"));
        cursos.add(new Cursos("GA1"));
        cursos.add(new Cursos("GA2"));

    }

}