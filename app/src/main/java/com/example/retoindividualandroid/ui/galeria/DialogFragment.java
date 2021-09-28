package com.example.retoindividualandroid.ui.galeria;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.retoindividualandroid.R;

import java.util.zip.Inflater;

public class DialogFragment extends androidx.fragment.app.DialogFragment
{
    String[] list;
    String[] img;
    Context context;
    RecyclerAdapter recyclerAdapter;
    private ImageView imageView;


    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        return  inflater.inflate(R.layout.dialog_fragment, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.ivDialogFragment);

        String name = getArguments().getString("pos");

        Glide.with(context).load(name).into(imageView);

           view.setOnClickListener(new View.OnClickListener()
           {
               @Override
               public void onClick(View view)
               {
                    dismiss();
               }
           });

    }


}
