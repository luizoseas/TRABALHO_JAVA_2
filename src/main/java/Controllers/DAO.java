/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

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
    
    
    public boolean salvar(){
        try{
            manager.getTransaction().begin();
            manager.persist(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            manager.getTransaction().rollback();
            System.out.println(erro.getMessage());
            return false;
        }
    }
    
    public boolean excluir(){
        try{
            manager.getTransaction().begin();
            manager.remove(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            manager.getTransaction().rollback();
            System.out.println(erro.getMessage());
            return false;
        }
    }
    
    public boolean atualizar(){
        try{
            manager.getTransaction().begin();
            manager.persist(this);
            manager.getTransaction().commit();
            return true;
        }catch(Exception erro){
            manager.getTransaction().rollback();
            System.out.println(erro.getMessage());
            return false;
        }
    }
    
    public static boolean close(){
        try{
            manager.close();
            factory.close();
            return true;
        }catch(Exception erro){
            System.out.println(erro.getMessage());
            return false;
        }
    }
    
}
