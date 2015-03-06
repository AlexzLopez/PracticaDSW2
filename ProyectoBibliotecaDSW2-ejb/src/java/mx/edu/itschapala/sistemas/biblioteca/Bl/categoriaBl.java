/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import mx.edu.itschapala.sistemas.biblioteca.dao.CategoriaDaoLocal;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Stateless
public class categoriaBl implements categoriaBlLocal {
    @EJB
    private CategoriaDaoLocal categoriaDao;
    

    @Override
    public boolean registrar(Categoria categoria) {
        categoriaDao.crear(null);
        return false;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public boolean eliminar(Categoria categoria) {
        categoriaDao.remover(categoria);
        return false;
    }

    @Override
    public boolean modificar(Categoria categoria) {
        categoriaDao.editar(categoria);
        return false;
    }

    @Override
    public List<Categoria> getLista() {
        return categoriaDao.buscarTodos();
    }

    @Override
    public Categoria buscarPorId(int id) {
        categoriaDao.buscarporId(id);
        return null;
    }
    
}
