package org.example;

public class TipoLaudosExamesOftalmologicos implements TipoLaudo {

    private static TipoLaudosExamesOftalmologicos tipoLaudosExamesOftalmologicos = new TipoLaudosExamesOftalmologicos();

    private TipoLaudosExamesOftalmologicos() {};

    public static TipoLaudosExamesOftalmologicos getTipoLaudosExamesOftalmologicos() {
        return tipoLaudosExamesOftalmologicos;
    }

}