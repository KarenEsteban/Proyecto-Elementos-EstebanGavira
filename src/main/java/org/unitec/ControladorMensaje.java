/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-107
 */
@RestController
public class ControladorMensaje {
    @Autowired RepositorioMensajes repoMensa;
    @CrossOrigin
    @RequestMapping(value="/mensaje/{titulo}/{cuerpo}",method=RequestMethod.POST, headers={"Accept=text/html"})
    //Variables de ruta @PathVariable
    public String guardar(@PathVariable String titulo,@PathVariable String cuerpo){
        
        repoMensa.save(new Mensaje(titulo, cuerpo));
        return "Mensaje guardado con exito";
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje",method = RequestMethod.GET, headers = {"Accept=application/json"})
    //GET es para busquedas
    public String buscarTodod() throws Exception{
        ArrayList<Mensaje> mensajes=(ArrayList<Mensaje>) repoMensa.findAll();
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(mensajes);
        
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}",method = RequestMethod.GET, headers = {"Accept=application/json"})
    public String buscarPorId(@PathVariable Long id) throws Exception{
        Mensaje mensa= repoMensa.findOne(id);
        ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(mensa);
    }
    
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}/{titulo}/{cuerpo}",method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public String actualizar(@PathVariable Long id,@PathVariable String titulo, @PathVariable String cuerpo){
        Mensaje mensa=new Mensaje(id,titulo, cuerpo);
        repoMensa.save(mensa);   
        return "Mensaje actualizado con exito";
}   
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}",method = RequestMethod.DELETE, headers = {"Accept=text/html"})
    public String borrarPorId(@PathVariable Long id) throws Exception{
        repoMensa.delete(id);
        return "Mensaje borrado";
    }
}
