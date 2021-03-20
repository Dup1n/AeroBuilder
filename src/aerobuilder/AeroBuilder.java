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
public interface AeroBuilder {
    public Aeronave getAeronave();
    public abstract void crearNuevoAeronave();
    public abstract void construirAlas();
    public abstract void construirMotores();
    public abstract void construirAvionica();
    public abstract void construirAsientos();
}
