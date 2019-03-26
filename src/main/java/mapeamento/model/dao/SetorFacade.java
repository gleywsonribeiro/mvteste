/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamento.model.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mapeamento.model.Setor;

/**
 *
 * @author gleywson
 */
@Stateless
public class SetorFacade extends AbstractFacade<Setor> {

    @PersistenceContext(unitName = "testePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SetorFacade() {
        super(Setor.class);
    }
    
}
