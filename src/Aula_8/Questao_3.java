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
public class Questao_3 {

    public static void main(String[] args) {
        int n[] = new int[10];
        
        int maior = 0, menor = Integer.MAX_VALUE;

        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(
                    JOptionPane.
                            showInputDialog("Digite algum número para posição: "
                                    + (i + 1)));
            if (n[i] >= maior) {
                maior = n[i];
            }
            if (n[i] <= menor) {
                menor = n[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Número Maior:" + maior
                + "\nNúmero Menor" + menor, "Atenção", 1);
    }
}
