/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Views.FormErro;

/**
 *
 * @author oseas
 */
public class FalhaException extends Exception {

    private static final FormErro formErro = new FormErro();
    
    public FalhaException(String mensagem) {
        super(mensagem);
        System.out.println(mensagem);
        formErro.setVisible(true, mensagem);
    }
    
    
}
