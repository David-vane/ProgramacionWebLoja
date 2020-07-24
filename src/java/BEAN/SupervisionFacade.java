/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import MODELO.Supervision;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Robin
 */
@Stateless
public class SupervisionFacade extends AbstractFacade<Supervision> {

    @PersistenceContext(unitName = "APPNewPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SupervisionFacade() {
        super(Supervision.class);
    }
    
}
