/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itschapala.sistemas.biblioteca.Bl;

import java.util.List;
import javax.ejb.Local;
import mx.edu.itschapala.sistemas.biblioteca.modelo.Empleado;

/**
 *
 * @author Admin
 */
@Local
public interface empleadoBlLocal {

    boolean registrar(Empleado empleado);

    

    boolean eliminar(Empleado empleado);

    boolean modificar(Empleado empleado);

    List<Empleado> getLista();

    Empleado buscarPorId(int id);
    
}
