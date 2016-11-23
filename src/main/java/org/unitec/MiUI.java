/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.vaadin.annotations.Theme;
import com.vaadin.server.ClassResource;
import com.vaadin.server.FileResource;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.Position;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import java.io.File;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author T-107
 */
@SpringUI
@Theme("valo")
public class MiUI extends UI{
    @Autowired AplicacionServicios bebidas;
    @Autowired RepositorioMensajes repo;
    
    @Autowired RepositorioEmpleado repoEmp;
    @Autowired RepositorioDepartamento repoDepto;
    
    @Autowired RepositorioCliente repoCli;
    @Autowired RepositorioEstacionamiento repoEsta;
    
    @Autowired RepositorioPersona repoPer;
    @Autowired RepositorioDireccion repoDir;
    
    @Autowired RepositorioClientes repoClien;
    @Autowired RepositorioTarjeta repoTar;
    
    @Override
    protected void init(VaadinRequest request) {   
        //Creamos un Layout
        VerticalLayout layout=new VerticalLayout();
        //Geramos una etiqueta
        Label etiqueta=new Label("Mi primera etiqueta KAREN");
        layout.addComponent(etiqueta);
        //Creamos un boton
        Button boton=new Button("Mi primer boton");
        //Cambiamos el estilo del boton
        boton.addStyleName(ValoTheme.BUTTON_DANGER);
        boton.addClickListener(cliqueo -> {
            
            //Invocamos un insert 
            //repo.save(new Mensaje("segundo mensajito","Mi segundo mensajito"));
            
            //Vamos a buscar por id
            //Mensaje mensa= repo.findOne(1L);
            
            //List<Mensaje> mensaje=(List<Mensaje>) repo.findAll();
            
            //Update
            //Un update incorrecto no exite porque ya no se puede hacer esto repo.update
            //Mensaje m=new Mensaje();
            
            //Update correcto
            //Mensaje mensa2=repo.findOne(1L);
            //mensa2.setCuerpo("El nuevo cuerpo del primero");
            //repo.save(mensa2);
            
            //Delete
            //repo.delete(1L);
            
            
            //EJERCICIO DEPARTAMENTO Y EMPLEADO
          //  repoDepto.save(new Departamento("Sistemas"));
          /*  Departamento dep=new Departamento(2l);
            repoEmp.save(new Empleado(dep, "Karen", 450000));
          */
          /*Estacionamiento esta=new Estacionamiento(new Date());
          repoEsta.save(esta);
          */
          
          
          
          /*----------Ejercicio Cliente/Direccion*/
          //1.Guardar direccion
        /* Direccion dir=new Direccion(1L,12L,55963L,"ecatepec");
           repoDir.save(dir); */
          //2.Actualizar
          /*Direccion dir2=repoDir.findOne(1L);
          dir2.setColonia("Del valle");
          repoDir.save(dir2);*/
          //3.Buscar por Id
         // Direccion dir= repoDir.findOne(1L);
         
         //Para persona.....
          //1. Guardar
          /*Persona per=new Persona();
          repoPer.save(per);*/
          //2. Actualizar 
        /*  Persona per2=repoPer.findOne(1L);
          per2.setNombre("Karen");
          repoPer.save(per2);
          */
          
        //Insertar una tarjeta
        //Clientes clien=new Clientes(1L,"Karen");
        //repoClien.save(clien);
        //repoTar.save(new Tarjeta(1L,clien,"debito",5000,new Date()));
        
        //Buscar todas las tarjetas
        //List<Tarjeta> tar=(List<Tarjeta>) repoTar.findAll();
     
        //Actualizar
       /* Tarjeta tar2=repoTar.findOne(1L);
        tar2.setTipo("credito");
        repoTar.save(tar2);
        
      */
          /*Estacionamiento esta=new Estacionamiento(1L,new Date());
            repoEsta.save(esta);
            repoCli.save(new Cliente(esta));
          */
         // repoCli.save(new Cliente(new Estacionamiento(2L, new Date())));
                       
            //El siguiente es el constructor de la clase Notification:
            Notification notif = new Notification(
                    "PELIGRO",
                    //"Este registro es "+mensa.getTitulo()+" cuerpo "+mensa.getCuerpo(),
                   // "Registros encontrados "+mensaje.size(),
                    "Registros encontrados ",
                    Type.TRAY_NOTIFICATION);
            
            //Algunas propiedades de la clase notificacion
            notif.setDelayMsec(20000);
            notif.setPosition(Position.TOP_RIGHT);
            notif.setStyleName(ValoTheme.NOTIFICATION_SUCCESS);
            notif.setIcon(new FileResource(new File("src/main/resources/spellcheck.png")));
         // notif.setIcon(new ClassResource("spellcheck.png")); 

// Mostrar el mensaje de notificacion en la pagina actual
            notif.show(Page.getCurrent());
        });
        layout.addComponent(boton);
        Label etiquetaRecomendacion=new Label();
     
        //Agregamos    
        etiquetaRecomendacion.setValue(bebidas.obtenerBebida().obtenerRecomendacion());
        layout.addComponent(etiquetaRecomendacion);
                //El setContener siempre va al final
        setContent(layout);
        
    }
    
}
