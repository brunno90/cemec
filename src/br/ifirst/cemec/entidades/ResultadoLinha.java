package br.ifirst.cemec.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iagho
 */
public class ResultadoLinha {

    private List<Object> data = new ArrayList<Object>();

    public void add(Object value) {
        data.add(value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(int index) {
        return (T) data.get(index);
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public int size() {
        return data.size();
    }
}
