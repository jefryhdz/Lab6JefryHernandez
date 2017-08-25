
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jefry Hernandez
 */
public class Casa extends Lugar{

    public Casa(String nombre, String direccion, int security) {
        super(nombre, direccion, security);
    }


  

    @Override
    public String toString() {
        return super.getNombre();
    }

    
    
}
