package org.example;

public class TipoDeclaracaoDeComparecimento implements TipoLaudo {

    private static TipoDeclaracaoDeComparecimento tipoDeclaracaoDeComparecimento = new TipoDeclaracaoDeComparecimento();

    private TipoDeclaracaoDeComparecimento() {};

    public static TipoDeclaracaoDeComparecimento getTipoDeclaracaoDeComparecimento() {
        return tipoDeclaracaoDeComparecimento;
    }
}