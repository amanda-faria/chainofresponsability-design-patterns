package org.example;


public class TipoLaudosExamesOrtopedicos implements TipoLaudo {

    private static TipoLaudosExamesOrtopedicos tipoLaudosExamesOrtopedicos = new TipoLaudosExamesOrtopedicos();

    private TipoLaudosExamesOrtopedicos() {};

    public static TipoLaudosExamesOrtopedicos getTipoLaudosExamesOrtopedicos() {
        return tipoLaudosExamesOrtopedicos;
    }

}