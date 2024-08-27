package org.example;

public class TipoLaudosExamesNeurologicos implements TipoLaudo {

    private static TipoLaudosExamesNeurologicos tipoLaudosExamesNeurologicos = new TipoLaudosExamesNeurologicos();

    private TipoLaudosExamesNeurologicos() {};

    public static TipoLaudosExamesNeurologicos getTipoLaudosExamesNeurologicos() {
        return tipoLaudosExamesNeurologicos;
    }

}