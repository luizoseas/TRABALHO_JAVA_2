/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Interfaces.FalhaException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;

/**
 *
 * @author oseas
 */
abstract public class DAO {
    
    private static EntityManagerFactory factory;
    private static EntityManager manager;
   
    public static EntityManager getInstance() {
        if (manager == null)
        {
            synchronized(DAO.class) {
                if (manager == null)
                {
                    try {
                        factory = Persistence.createEntityManagerFactory("automecanica");
                        manager = factory.createEntityManager();
                    } catch(HibernateException he) {
                        System.err.println(he.getMessage());
                    }
                }
            }
        }
        return manager;
    }
    
    
    public boolean salvar() throws FalhaException{
        try{
            manager.getTransaction().begin();
            manager.persist(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            if(manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            throw new FalhaException(erro.getMessage());
        }
    }
    
    public boolean excluir() throws FalhaException{
        try{
            manager.getTransaction().begin();
            manager.remove(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            if(manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            throw new FalhaException(erro.getMessage());
        }
    }
    
    public boolean atualizar(){
        try{
            manager.getTransaction().begin();
            manager.persist(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            if(manager.getTransaction().isActive()){
                manager.getTransaction().rollback();
            }
            System.out.println(erro.getMessage());
            return false;
        }
    }
    
    public static boolean close() throws FalhaException{
        try{
            manager.close();
            factory.close();
            return true;
        }catch(Exception erro){
            throw new FalhaException(erro.getMessage());
        }
    }
    
}
