
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
public class Restaurante extends Lugar{
    private String categoria;

    public Restaurante(String categoria, String nombre, String direccion, int security) {
        super(nombre, direccion, security);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

   
   

   

    @Override
    public String toString() {
        return super.getNombre();
    }

    
    
    
}
