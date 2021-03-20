/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aerobuilder;

/**
 *
 * @author elian
 */
public class Planeador implements AeroBuilder {

    Aeronave aeronave;
    String nombre;
    String comprador;
    
    Planeador (String comprador){
        this.comprador = comprador;
        this.nombre = "Glider v9.0";
    }
    
    @Override
    public void construirAlas() {
        aeronave.setAlas(35.1f);
    }

    @Override
    public void construirMotores() {}

    @Override
    public void construirAvionica() {}

    @Override
    public void construirAsientos() {
        aeronave.setNumeroAsientos(1, 0);
    }

    @Override
    public Aeronave getAeronave() {
        return aeronave;
    }

    @Override
    public void crearNuevoAeronave() {
        aeronave = new Aeronave(comprador, nombre);
    }
    
}
