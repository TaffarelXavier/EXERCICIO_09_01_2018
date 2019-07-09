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
public class Questao__12 {

    public static void main(String[] args) {

        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        for (int i = n; i >= 0; i -= 1) {
            System.out.println(i);
        }
    }
}
