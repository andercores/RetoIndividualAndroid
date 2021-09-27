package com.example.retoindividualandroid.ui.galeria;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.retoindividualandroid.R;


public class ViewPagerFragment2 extends Fragment
{
    String[] names= {"Fachada", "Fachada Lateral", "Entrada", "Portal", "Old School", "Metro", "Puerta Principal", "Recreo", "Torre Vigilancia 1", "Seguridad", "Torre 2"};
    String[] pics= {"https://almi.eus/wp-content/uploads/2019/11/IMG_20191125_084551.jpg", "https://pbs.twimg.com/media/DBTdveuW0AAF2Mq.jpg:large",
    "https://www.britishcouncil.es/sites/default/files/bilbao-centre-entrance-03.jpg", "https://static.pacelma.es/wp-content/uploads/2013/04/BIZ.002.001.png", "https://i.pinimg.com/originals/26/85/0d/26850d219311b90bea6faec98cfae29f.jpg",
    "https://fastly.4sqi.net/img/general/600x600/25523274_TISWaXVkTVV0Uy8RvUJKSQnAZ_V5WXZZs-cQDpnGbUA.jpg", "https://estaticos.efe.com/efecom/recursos2/imagen.aspx?lVW2oAh2vjMriYEh7dqlXlsv6LHn373gQ4TncnkXVSTX-P-2bAoG0sxzXPZPAk5l-P-2fU5UgDJwV29nLFdATc7dlMusNQ-P-3d-P-3d",
    "https://lavereda.cl/wp-content/uploads/2020/04/carcel-puente-alto.jpg", "https://cnnespanol.cnn.com/wp-content/uploads/2018/05/gettyimages-893727132.jpg?quality=100&strip=info", "https://media.primicias.ec/2021/02/30040025/carcel-guayaquil-2.jpeg",
    "https://i2.wp.com/www.periodismo.com/wp-content/subid/img_djuarez_20200708-092643_imagenes_lv_otras_fuentes_carcel-k4LI-U4821884463168J-992x558@LaVanguardia-Web.jpg?resize=696%2C392&ssl=1"};
    private RecyclerView  recyclerView;


    public ViewPagerFragment2()
    {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
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