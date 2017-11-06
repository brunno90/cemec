package br.ifirst.cemec.entidades;

/**
 *
 * @author Iagho
 */
public class TratamentoStatic {

    private static Tratamento tratamento;

    public static Tratamento getTratamento() {
        if (tratamento == null) {
            tratamento = new Tratamento();
        }
        return tratamento;
    }

    public static Tratamento setTratamento(Tratamento t) {
        TratamentoStatic.tratamento = t;

        return TratamentoStatic.tratamento;
    }
}