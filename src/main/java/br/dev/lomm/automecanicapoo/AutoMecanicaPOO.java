/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.dev.lomm.automecanicapoo;

import Views.Painel;
import br.dev.lomm.automecanicapoo.database.Cidade;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
/**
 *
 * @author oseas
 */
public class AutoMecanicaPOO {

    public static void main(String[] args) {
        Painel painel = new Painel();
        painel.show();
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("automecanica");
//        EntityManager manager = factory.createEntityManager();
//        Cidade cidade = new Cidade();
//        cidade.setCidDescricao("cidade");
//        manager.getTransaction().begin();
//        manager.persist(cidade);
//        manager.getTransaction().commit();
    }
}
