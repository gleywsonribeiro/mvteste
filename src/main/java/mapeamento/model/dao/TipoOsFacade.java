/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mapeamento.model.TipoOs;

/**
 *
 * @author gleywson
 */
@Stateless
public class TipoOsFacade extends AbstractFacade<TipoOs> {

    @PersistenceContext(unitName = "testePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoOsFacade() {
        super(TipoOs.class);
    }
    
}
