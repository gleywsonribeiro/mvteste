/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mapeamento.model.SolicitacaoOs;

/**
 *
 * @author gleywson
 */
@Stateless
public class SolicitacaoOsFacade extends AbstractFacade<SolicitacaoOs> {

    @PersistenceContext(unitName = "testePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SolicitacaoOsFacade() {
        super(SolicitacaoOs.class);
    }
    
    public Long getMaxcode() {
        //return getEntityManager().createQuery("SELECT MAX(CD_OS) + 1 FROM SOLICITACAO_OS", SolicitacaoOs).getResultList();
        return (Long)getEntityManager().createNativeQuery("SELECT MAX(CD_OS) + 1 FROM SOLICITACAO_OS").getSingleResult();
    }
    
}
