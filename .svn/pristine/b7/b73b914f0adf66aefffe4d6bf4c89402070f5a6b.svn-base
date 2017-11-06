package br.ifirst.cemec.util;

import br.ifirst.cemec.entidades.Usuario;

/**
 * @author Iagho
 */
public class UsuarioLogado {

    private static Usuario usuario = null;

    public static Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }

        return usuario;
    }

    public static Usuario setUsuario(Usuario usuario) {
        UsuarioLogado.usuario = usuario;

        return UsuarioLogado.usuario;
    }
}
