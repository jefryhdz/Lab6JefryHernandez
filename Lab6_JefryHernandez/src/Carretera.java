
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
public class Carretera {

    private int codigo;
    private double distancia;
    private Lugar inicio;
    private Lugar finali;

    public Carretera(int codigo, double distancia, Lugar inicio, Lugar finali) {
        this.codigo = codigo;
        this.distancia = distancia;
        this.inicio = inicio;
        this.finali = finali;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugar getInicio() {
        return inicio;
    }

    public void setInicio(Lugar inicio) {
        this.inicio = inicio;
    }

    public Lugar getFinali() {
        return finali;
    }

    public void setFinali(Lugar finali) {
        this.finali = finali;
    }

    @Override
    public String toString() {
        return codigo+"";
    }
   

   

}
