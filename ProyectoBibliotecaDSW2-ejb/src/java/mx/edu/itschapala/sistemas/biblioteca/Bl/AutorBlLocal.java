/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Autor;

/**
 *
 * @author Admin
 */
@Local
public interface AutorBlLocal {

    boolean registrar(Autor autor);

    boolean eliminar(Autor autor);

    boolean modificar(Autor autor);

    

    List<Autor> getlista();

    Autor getPorId(int id);
    
}
