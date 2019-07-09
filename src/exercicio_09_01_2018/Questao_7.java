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
public class Questao_7 {

    public static void main(String[] args) {
        try {
            int valores = 0;

            for (int i = 0; i <= 10; i++) {
                while (valores < 0) {
                    valores += Integer.parseInt(JOptionPane.showInputDialog(i));
                }
            }

            System.out.println(valores / 10);

        } catch (HeadlessException | NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", 1);
        }

    }
}
