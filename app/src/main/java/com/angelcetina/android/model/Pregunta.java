package com.angelcetina.android.model;

/**
 * Created by cetina on 18/05/2016.
 * Angel Daniel Cetina Romero - MS4 - 14470217
 */
public class Pregunta {
    private Integer mIdResTexto;
    private boolean MRespuestaVerdadera;

    public Pregunta(Integer mIdResTexto, boolean MRespuestaVerdadera) {
        this.mIdResTexto = mIdResTexto;
        this.MRespuestaVerdadera = MRespuestaVerdadera;
    }

    public Integer getmIdResTexto() {
        return mIdResTexto;
    }

    public void setmIdResTexto(Integer mIdResTexto) {
        this.mIdResTexto = mIdResTexto;
    }

    public boolean isMRespuestaVerdadera() {
        return MRespuestaVerdadera;
    }

    public void setMRespuestaVerdadera(boolean MRespuestaVerdadera) {
        this.MRespuestaVerdadera = MRespuestaVerdadera;
    }
}
