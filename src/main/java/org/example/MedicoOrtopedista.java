package org.example;

public class MedicoOrtopedista extends Medico {

    public MedicoOrtopedista(Medico superior) {
        listaDocumentos.add(TipoLaudosExamesOrtopedicos.getTipoLaudosExamesOrtopedicos());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Ortopedista";
    }
}