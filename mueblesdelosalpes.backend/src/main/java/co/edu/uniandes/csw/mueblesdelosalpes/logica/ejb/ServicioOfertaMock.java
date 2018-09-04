/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.MuebleOferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockRemote;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockRemote,IServicioOfertaMockLocal
{
    private IServicioPersistenciaMockLocal persistencia;
    
    public ServicioOfertaMock()
    {
        persistencia=new ServicioPersistenciaMock(); 
    }

    public void agregarMuebleOferta(MuebleOferta muebleOferta)
    {
        try
        {
            persistencia.create(muebleOferta);
        }
        catch (OperacionInvalidaException ex)
        {
            Logger.getLogger(ServicioOfertaMock.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }    
    public List<MuebleOferta> darMueblesOferta()
    {
        return persistencia.findAll(MuebleOferta.class);
    }
}
