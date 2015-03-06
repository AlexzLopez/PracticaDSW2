/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Usuarios;

/**
 *
 * @author Admin
 */
@Local
public interface usuarioBlLocal {

    boolean registrar(Usuarios usuario);

    boolean eliminar(Usuarios usuario);

    boolean modificar(Usuarios usuarios);

    List<Usuarios> getLista();

    Usuarios buscarPorId(int id);

   
    
}
