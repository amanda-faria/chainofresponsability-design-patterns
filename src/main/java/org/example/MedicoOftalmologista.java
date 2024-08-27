package org.example;


public class MedicoOftalmologista extends Medico {

    public MedicoOftalmologista(Medico superior) {
        listaDocumentos.add(TipoLaudosExamesOftalmologicos.getTipoLaudosExamesOftalmologicos());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Oftalmologista";
    }
}