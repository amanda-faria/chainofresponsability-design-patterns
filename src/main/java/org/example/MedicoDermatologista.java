package org.example;

public class MedicoDermatologista extends Medico {

    public MedicoDermatologista(Medico superior) {
        listaDocumentos.add(TipoLaudosExamesDermatologicos.getTipoLaudosExamesDermatologicos());
        setMedicoSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Dermatologista";
    }
}