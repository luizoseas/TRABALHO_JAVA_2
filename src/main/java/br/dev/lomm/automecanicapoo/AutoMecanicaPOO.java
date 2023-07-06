/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.dev.lomm.automecanicapoo;

import Controllers.ControllerPessoa;
import Interfaces.FalhaException;
import Views.Painel;
import Models.Cidade;
import Models.Cliente;
import Models.Pessoa;
import Views.Login;
import Views.ViewCarregando;
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
        ViewCarregando carregando = new ViewCarregando();
        carregando.setVisible(true);
        Login login = new Login();
        login.carregarFuncionarios();
        carregando.setVisible(false);
        login.show();
       
    }
}
