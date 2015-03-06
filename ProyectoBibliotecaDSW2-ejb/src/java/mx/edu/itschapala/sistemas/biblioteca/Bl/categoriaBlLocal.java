/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Categoria;

/**
 *
 * @author Admin
 */
@Local
public interface categoriaBlLocal {

    boolean registrar(Categoria categoria);

    boolean eliminar(Categoria categoria);

    boolean modificar(Categoria categoria);

    List<Categoria> getLista();

    Categoria buscarPorId(int id);
    
}
