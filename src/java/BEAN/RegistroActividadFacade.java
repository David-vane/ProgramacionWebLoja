/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import MODELO.RegistroActividad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Robin
 */
@Stateless
public class RegistroActividadFacade extends AbstractFacade<RegistroActividad> {

    @PersistenceContext(unitName = "APPNewPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroActividadFacade() {
        super(RegistroActividad.class);
    }
    
}
