package org.example;
public class TipoLaudosExamesDermatologicos implements TipoLaudo {

    private static TipoLaudosExamesDermatologicos tipoLaudosExamesDermatologicos = new TipoLaudosExamesDermatologicos();

    private TipoLaudosExamesDermatologicos() {};

    public static TipoLaudosExamesDermatologicos getTipoLaudosExamesDermatologicos() {
        return tipoLaudosExamesDermatologicos;
    }

}