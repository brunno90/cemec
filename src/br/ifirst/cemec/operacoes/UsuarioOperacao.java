package br.ifirst.cemec.operacoes;

import br.ifirst.cemec.connections.Conexao;
import br.ifirst.cemec.daos.PermissaoDao;
import br.ifirst.cemec.daos.UsuarioDao;
import br.ifirst.cemec.entidades.Permissao;
import br.ifirst.cemec.entidades.Usuario;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Iagho
 */
public class UsuarioOperacao {

    public static boolean validaLogin(Usuario usuario) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();
            UsuarioDao ud = new UsuarioDao(c);

            r = ud.isUsuarioLogin(usuario);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return r;
    }

    public static Usuario getUsuario(int usuario) {
        Usuario u = null;
        try {
            Connection c = Conexao.getConnection();
            UsuarioDao ud = new UsuarioDao(c);

            u = ud.getUsurioById(usuario);
            PermissaoDao dao = new PermissaoDao(c);
            List<Permissao> perm = new ArrayList<Permissao>(dao.buscPermi(usuario));
            if (perm != null && perm.size() > 0) {
                u.setPermissao(perm);
            }
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return u;
    }

    public static int Salvar(Usuario usuario) {
        int cod = 0;
        try {
            Connection c = Conexao.getConnection();

            UsuarioDao usuarioDao = new UsuarioDao(c);

            cod = usuarioDao.Salvar(usuario);
            PermissaoDao perDao = new PermissaoDao(c);

            if (cod > 0) {
                for (Permissao per : usuario.getPermissao()) {
                    per.setCdUsu(cod);
                    perDao.Salvar(per);
                }
            }
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return cod;
    }

    public static List<Usuario> PesquisaUsuarios(int campo, Object valor) {

        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            Connection c = Conexao.getConnection();

            UsuarioDao usuariosdao = new UsuarioDao(c);

            usuarios = usuariosdao.PesquisarUsuarios(campo, valor);

            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        return usuarios;
    }

    public static boolean AtualUsu(Usuario u) {
        boolean r = false;
        try {
            Connection c = Conexao.getConnection();

            UsuarioDao usuarioDao = new UsuarioDao(c);

            r = usuarioDao.UpdateUsu(u);

            PermissaoDao dao = new PermissaoDao(c);
            dao.excluirPermissoes(u.getCodigoUsu());

            if (u.getPermissao() != null && u.getPermissao().size() > 0) {
                for (Permissao tel : u.getPermissao()) {
                    tel.setCdUsu(u.getCodigoUsu());
                    dao.Salvar(tel);
                }
            }
            Conexao.setCommitTran();

        } catch (Exception ex) {
            Conexao.setRollbackTran();
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return r;
    }
//
//    public static List<Usuario> buscasUsuarios() {
//        List<Usuario> usu = new ArrayList<Usuario>();
//        try {
//            Connection c = Conexao.getConnection();
//
//            UsuarioDao ud = new UsuarioDao(c);
//
//            usu = ud.buscaUsu();
//
//            Conexao.setCommitTran();
//
//        } catch (Exception ex) {
//            Conexao.setRollbackTran();
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//
//        }
//
//        return usu;
//    }
}