package com.example.retoindividualandroid;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CursosAdapter extends BaseAdapter
{
    private Context contexto;
    private ArrayList<Cursos> cursos;

    public CursosAdapter(Context contexto, ArrayList<Cursos> cursos)
    {
        this.contexto = contexto;
        this.cursos = cursos;
    }

    @Override
    public int getCount()
    {
        return cursos.size();
    }

    @Override
    public Object getItem(int i)
    {
        return cursos.get(i -1);
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = ((Activity) contexto).getLayoutInflater();
        View fila;

        fila = inflater.inflate(R.layout.fila_cursos, null);
        TextView tvCursos = fila.findViewById(R.id.tvCursos);
        tvCursos.setText(cursos.get(i-1).getCurso());
        return fila;
    }
}
