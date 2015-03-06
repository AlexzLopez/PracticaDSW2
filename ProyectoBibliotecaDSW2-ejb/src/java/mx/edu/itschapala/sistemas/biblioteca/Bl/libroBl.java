/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.LibroDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Libro;

/**
 *
 * @author Admin
 */
@Stateless
public class libroBl implements libroBlLocal {
    @EJB
    private LibroDaoLocal libroDao;
    

    @Override
    public boolean resgistrar(Libro libro) {
        libroDao.crear(libro);
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean eliminar(Libro libro) {
        libroDao.remover(libro);
        return false;
    }

    @Override
    public boolean modificar(Libro libro) {
        libroDao.editar(libro);
        return false;
    }

    @Override
    public List<Libro> getLista() {
        return libroDao.buscarTodos();
    }

    @Override
    public Libro buscarPorId(int id) {
        libroDao.buscarporId(id);
        return null;
    }
    
}
