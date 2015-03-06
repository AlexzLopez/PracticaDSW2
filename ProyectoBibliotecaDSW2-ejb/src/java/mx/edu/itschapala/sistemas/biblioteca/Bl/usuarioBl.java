/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.UsuariosDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuarios;

/**
 *
 * @author Admin
 */
@Stateless
public class usuarioBl implements usuarioBlLocal {
    @EJB
    private UsuariosDaoLocal usuariosDao;
    

    @Override
    public boolean registrar(Usuarios usuario) {
        usuariosDao.crear(usuario);
        return false;
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean eliminar(Usuarios usuario) {
        usuariosDao.remover(usuario);
        return false;
    }

    @Override
    public boolean modificar(Usuarios usuarios) {
        usuariosDao.editar(usuarios);
        return false;
    }

    @Override
    public List<Usuarios> getLista() {
        return usuariosDao.buscarTodos();
    }

    @Override
    public Usuarios buscarPorId(int id) {
        usuariosDao.buscarporId(id);
        return null;
    }

  
    
}
