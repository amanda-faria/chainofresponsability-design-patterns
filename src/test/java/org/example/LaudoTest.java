package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LaudoTest {

    MedicoDermatologista dermatologista;
    MedicoNeurologista neurologista;
    MedicoOftalmologista oftalmologista;
    MedicoOrtopedista ortopedista;

    @BeforeEach
    void setUp() {
        dermatologista = new MedicoDermatologista(null);
        neurologista = new MedicoNeurologista(dermatologista);
        oftalmologista = new MedicoOftalmologista(neurologista);
        ortopedista = new MedicoOrtopedista(oftalmologista);
    }

    @Test
    void deveRetornarOrtopedistaParaAssinaturaLaudoOrtopedico() {
        assertEquals("Ortopedista", ortopedista.assinarLaudo(new Laudo(TipoLaudosExamesOrtopedicos.getTipoLaudosExamesOrtopedicos())));
    }

    @Test
    void deveRetornarOftalmologistaParaAssinaturaLaudoOftalmologico() {
        assertEquals("Oftalmologista", ortopedista.assinarLaudo(new Laudo(TipoLaudosExamesOftalmologicos.getTipoLaudosExamesOftalmologicos())));
    }

    @Test
    void deveRetornarNeurologistaParaAssinaturaLaudoNeurologico() {
        assertEquals("Neurologista", ortopedista.assinarLaudo(new Laudo(TipoLaudosExamesNeurologicos.getTipoLaudosExamesNeurologicos())));
    }

    @Test
    void deveRetornarDermatologistaParaAssinaturaLaudoDermatologico() {
        assertEquals("Dermatologista", ortopedista.assinarLaudo(new Laudo(TipoLaudosExamesDermatologicos.getTipoLaudosExamesDermatologicos())));
    }

    @Test
    void deveRetornarSemAssinaturaParaAssinaturaDeclaracaoDeComparecimento() {
        assertEquals("Sem assinatura", ortopedista.assinarLaudo(new Laudo(TipoDeclaracaoDeComparecimento.getTipoDeclaracaoDeComparecimento())));
    }

}