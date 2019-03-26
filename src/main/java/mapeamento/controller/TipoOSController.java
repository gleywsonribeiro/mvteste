/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.controller;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Init;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import mapeamento.model.TipoOs;
import mapeamento.model.dao.TipoOsFacade;

/**
 *
 * @author gleywson
 */
@Named(value = "tipoOSController")
@ViewScoped
public class TipoOSController implements Serializable {

    private List<TipoOs> lista;
    @Inject
    private TipoOsFacade dao;

    public TipoOSController() {
    }
    
    @PostConstruct
    public void init() {
        lista = dao.findAll();
    }

    public List<TipoOs> getLista() {
        return lista;
    }

    public void ok() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sucesso!"));
    }
    
}
