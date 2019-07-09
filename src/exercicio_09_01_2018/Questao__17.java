/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_09_01_2018;

import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao__17 {

    public static void main(String[] args) {
        //Declaração das variáveis
        int soma = 0,
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número par e positivo"));
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
