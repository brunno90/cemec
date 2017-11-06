package br.ifirst.cemec.util;

import br.ifirst.cemec.entidades.Frequentador;

/**
 * @author Iagho
 */
public class MediumStatic {

    private static Frequentador frequentador = null;

    public static Frequentador getFrequentador() {
        if (frequentador == null) {
            frequentador = new Frequentador();
        }

        return frequentador;
    }

    public static Frequentador setFrequentador(Frequentador frequentador) {
        MediumStatic.frequentador = frequentador;

        return MediumStatic.frequentador;
    }
}
