package org.example;

public class MedicoNeurologista extends Medico {

    public MedicoNeurologista(Medico superior) {
        listaDocumentos.add(TipoLaudosExamesNeurologicos.getTipoLaudosExamesNeurologicos());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Neurologista";
    }
}