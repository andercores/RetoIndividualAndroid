package com.example.retoindividualandroid.ui.galeria;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retoindividualandroid.R;


public class ViewPagerFragment extends Fragment {

    String[] names= {"Secretaría", "Aula 1", "Aula 2", "Aula 3", "Aula 5", "Aula 6", "Aula 7", "Aula 8", "Pasillo principal", "Sala de Reuniones", "Aula de Castigo", "Aula de Programación", "Aula A", "Selfie :)"};
    String[] pics= {"https://almi.eus/wp-content/uploads/2016/09/03-Entrada-Almi-1024x576.jpg", "https://almi.eus/wp-content/uploads/2018/12/Kontsumobide-IMG-20181217-WA0000-1024x768.jpg",
    "https://www.ituna.eus/wp-content/uploads/2019/02/photo-2019-02-22-12-12-24-1024x619.jpg", "https://almi.eus/wp-content/uploads/2018/05/IMG_20180516_180441.jpg", "https://almi.eus/wp-content/uploads/2016/09/08-Aula-de-ordenadores-1024x576.jpg",
    "https://almi.eus/wp-content/uploads/2016/05/historia2-1.png", "https://almi.eus/wp-content/uploads/2017/11/IMG_20171122_085727.jpg", "https://almi.eus/wp-content/uploads/2016/09/06-Aula-Ordenadores-1024x576.jpg", "https://almi.eus/wp-content/uploads/2016/09/04-Entrada-Almi-1024x576.jpg",
    "https://almi.eus/wp-content/uploads/2016/12/IMG-20161220-WA0023.jpg", "https://1.bp.blogspot.com/-3Cu99npB-ik/V06Zvu7NjDI/AAAAAAAAABU/c_TZg8YWnJc1F3Ls2rVbfs-D8RIR5sutgCKgB/s1600/almiiiiii.PNG", "https://static2.elcorreo.com/www/pre2017/multimedia/vizcaya/prensa/noticias/200809/14/fotos/917881.jpg",
    "https://almi.eus/wp-content/uploads/2016/05/historia2-1.png", "https://almi.eus/wp-content/uploads/2017/03/20170301_154354_HDR.jpg"};

    private RecyclerView recyclerView;


    public ViewPagerFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_view_pager, container, false);
        // Inflate the layout for this fragment

        recyclerView = view.findViewById(R.id.recyclerInterior);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 2, GridLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new RecyclerAdapter(names, pics, getContext()));


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}