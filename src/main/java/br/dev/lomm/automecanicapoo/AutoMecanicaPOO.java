/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.dev.lomm.automecanicapoo;

import Controllers.ControllerPessoa;
import Interfaces.FalhaException;
import Views.Painel;
import br.dev.lomm.automecanicapoo.database.Cidade;
import br.dev.lomm.automecanicapoo.database.Cliente;
import br.dev.lomm.automecanicapoo.database.Pessoa;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
/**
 *
 * @author oseas
 */
public class AutoMecanicaPOO {

    public static void main(String[] args) {
//        Painel painel = new Painel();
//        painel.show();
        

//        Pessoa pessoa = new Pessoa();
//        pessoa.setPesCpf("05525587297");
//        pessoa.setPesNome("ASD2");
//        pessoa.setPesDatanasc(new Date(2002,11,1));
//        pessoa.setPesEmail("EMAIL@com.COM");
//        Cliente cliente1 = new Cliente();
//        cliente1.setCliIdpessoa(pessoa);
//        ControllerPessoa controllerCliente= new ControllerPessoa();
    //    controllerCliente.setCliente(cliente1);
        try{
            throw new FalhaException("asd");
          //  controllerCliente.validarDados();
            //System.out.println("Suceeso");
        }catch(FalhaException erro){
            System.out.println("Erro: "+erro.getMessage());
        }
        
        
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("automecanica");
//        EntityManager manager = factory.createEntityManager();
//        Cidade cidade = new Cidade();
//        cidade.setCidDescricao("cidade");
//        manager.getTransaction().begin();
//        manager.persist(cidade);
//        manager.getTransaction().commit();
    }
}
