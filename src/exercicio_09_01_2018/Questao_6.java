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
public class Questao_6 {

    public static void main(String[] args) {
        try {
            int soma = 0, i;
            for (i = 0; i <= 10; i++) {
                soma += Integer.parseInt(JOptionPane.showInputDialog(i));
            }
            System.out.println("MÉDIA: "+(soma / i));
        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
        }

    }
}
