package org.example;

import java.util.ArrayList;

public abstract class Medico {

    protected ArrayList listaDocumentos = new ArrayList();
    private Medico medicoSuperior;

    public Medico getMedicoSuperior() {
        return medicoSuperior;
    }

    public void setMedicoSuperior(Medico medicoSuperior) {
        this.medicoSuperior = medicoSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarLaudo(Laudo laudo) {
        if (listaDocumentos.contains(laudo.getTipoLaudo())) {
            return getDescricaoCargo();
        }
        else {
            if (medicoSuperior != null) {
                return medicoSuperior.assinarLaudo(laudo);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}