/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_8;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_5 {
    public static void main(String[] args) {
           //CRIA O VETOR DE TAMANHO 6
        int n[] = new int[6];

        //PARA SAÍDA:
        String saida = "";

        //FAZ A LEITURA
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite algum número"));
        }
        
    }
}
