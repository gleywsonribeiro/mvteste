/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.controller;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import mapeamento.model.SolicitacaoOs;
import mapeamento.model.TipoOs;
import mapeamento.model.dao.SolicitacaoOsFacade;
import mapeamento.model.dao.TipoOsFacade;
import mapeamento.util.jsf.JsfUtil;

/**
 *
 * @author gleywson
 */
@Named(value = "osController")
@ViewScoped
public class OsController implements Serializable{

    private SolicitacaoOs os;

    @Inject
    private SolicitacaoOsFacade osFacade;
  
    public OsController() {
        os = new SolicitacaoOs();
        os.setDtPedido(new Date());
        os.setNmSolicitante("DBAMV");
        os.setNmUsuario("DBAMV");
        os.setDtUltimaAtualizacao(new Date());
        os.setSnOrdemServicoPrincipal("S");
        os.setDtEntrega(new Date());
        
    }
    
    public void gerar() {
        try{
            os.setCdOs(osFacade.getMaxcode());
            osFacade.create(os);
        } catch(Exception e) {
            JsfUtil.addErrorMessage("Erro ao salvar!");
        }
    }

    public SolicitacaoOs getOs() {
        return os;
    }

    public void setOs(SolicitacaoOs os) {
        this.os = os;
    }

    
    
}
