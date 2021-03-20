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
public class Dron implements AeroBuilder {

    Aeronave aeronave;
    String nombre;
    String comprador;
    
    Dron (String comprador){
        this.comprador = comprador;
        this.nombre = "MQ-9 Reaper";
    }
    
    @Override
    public void construirAlas() {
        aeronave.setAlas(20.7f);
    }

    @Override
    public void construirMotores() {
        aeronave.setMotores("turboprop");
    }

    @Override
    public void construirAvionica() {
        aeronave.setAvionica("Militar - Tecnologica");
    }

    @Override
    public void construirAsientos() { } 

    @Override
    public Aeronave getAeronave() {
        return aeronave;
    }

    @Override
    public void crearNuevoAeronave() {
        aeronave = new Aeronave(comprador, nombre);
    }
    
}
