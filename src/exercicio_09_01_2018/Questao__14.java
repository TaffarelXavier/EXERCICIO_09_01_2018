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
public class Questao__14 {

    public static void main(String[] args) {
        //Declaração das variáveis
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número par e positivo"));

        //Verifica se o número inserido é par ou ímpar.
        while (n % 2 == 1) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número par."));
        }

        for (int i = n; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
