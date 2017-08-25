
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
public class Lugar {
    private String nombre;
    private String direccion;
    private int security;
      private ArrayList <Carretera> entradas =new ArrayList();
    private ArrayList<Carretera> Salidas = new ArrayList() ;

    public Lugar(String nombre, String direccion, int security) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.security = security;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public ArrayList<Carretera> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Carretera> entradas) {
        this.entradas = entradas;
    }

    public ArrayList<Carretera> getSalidas() {
        return Salidas;
    }

    public void setSalidas(ArrayList<Carretera> Salidas) {
        this.Salidas = Salidas;
    }


  
    
    
}
