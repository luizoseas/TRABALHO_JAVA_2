/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author oseas
 */
public class ObjetoSelecionavel {
    private String value;
    private String text;

    public ObjetoSelecionavel(String value, String text) {
        this.value = value;
        this.text = text;
    }

    @Override
    public String toString() {
        return value;
    }
}
