/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_09_01_2018;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao_8 {

    public static void main(String[] args) {
        int maior = 0,
                menor = Integer.MAX_VALUE,
                numero;

        for (int i = 0; i < 10; i++) {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a posição " + i));

            if (numero >= maior) {
                maior = numero;
            }
            if (numero <= menor) {
                menor = numero;
            }
        }
        
        System.out.println("MAIOR: " + maior + "\nMENOR: " + menor);
    }
}
