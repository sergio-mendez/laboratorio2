/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author Sergio
 */
public class MuebleOferta {
/*
    Parametros:
    idOferta
    loginUsuarioOfertante
    referenciaMueble
    oferta
*/    
    
    private int idOferta;
    private String loginUsuarioOfertante;
    private long referenciaMueble;
    private int oferta;
    
    public MuebleOferta()
    {}    

    /**
     * Constructor de la clase con argumentos
     * @param idOferta identificador
     * @param loginUsuarioOfertante usuario
     * @param referenciaMueble referencia del Mueble
     * @param oferta Oferta del mueble
     */    
    public MuebleOferta(int idOferta, String loginUsuarioOfertante, long referenciaMueble, int oferta)
    {
        this.idOferta = idOferta;
        this.loginUsuarioOfertante = loginUsuarioOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
    }    

    /**
     * Devuelve el id
     * @return idOferta identificador
     */    
    public int getIdOferta() {
        return idOferta;
    }
    /**
     * Modifica la identificador
     * @param idOferta identificador
     */
    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    /**
     * Devuelve el usuario
     * @return loginUsuarioOfertante usuario
     */     
    public String getLoginUsuarioOfertante() {
        return loginUsuarioOfertante;
    }

    /**
     * Modifica la identificador
     * @param loginUsuarioOfertante usuario
     */    
    public void setLoginUsuarioOfertante(String loginUsuarioOfertante) {
        this.loginUsuarioOfertante = loginUsuarioOfertante;
    }

    /**
     * Devuelve el usuario
     * @return referenciaMueble referencia del Mueble
     */     
    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    /**
     * Modifica la identificador
     * @param referenciaMueble referencia del Mueble
     */    
    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    /**
     * Devuelve el usuario
     * @return oferta Oferta del Mueble
     */    
    public int getOferta() {
        return oferta;
    }

    /**
     * Modifica la identificador
     * @param oferta Oferta del Mueble
     */    
    public void setOferta(int oferta) {
        this.oferta = oferta;
    }
    
}
