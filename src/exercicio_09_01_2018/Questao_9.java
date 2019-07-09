/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_09_01_2018;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_9 {

    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro."));

            for (int i = 1; i <= n; i++) {
                if ((i % 2) == 1) {
                    System.out.println(i);
                }
            }
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
        }

    }
}
