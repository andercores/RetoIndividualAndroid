package com.example.retoindividualandroid;

import java.io.Serializable;

public class Cursos implements Serializable
{
    private String curso;

    public Cursos(String curso)
    {
        this.curso = curso;
    }

    public String getCurso()
    {
        return curso;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
}
