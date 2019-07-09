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
public class Questao_2 {

    public static void main(String[] args) {
        while (true) {
            int n[] = new int[6], n1[] = new int[6];

            String saida = "";

            for (int i = 0; i < n.length; i++) {

                n[i] = Integer.parseInt(
                        JOptionPane.
                                showInputDialog("Digite algum número para posição: "
                                        + (i + 1)));
            }

            int quantPar = 0;

            for (int i = 0; i < n.length; i++) {

                if (n[i] % 2 == 0) {
                    quantPar++;
                    n1[i] = n[i];
                }

            }

            for (int i = 0; i < quantPar; i++) {
                saida += n1[i] + "\n";
            }

            //JOptionPane.showMessageDialog(null,, "Atenção", 2);
            if (quantPar == 0) {
                JOptionPane.showMessageDialog(null, "Não há nenhum número par.", "Atenção", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade de números pares:"
                        + quantPar + "\nNúmeros:\n" + saida, "Atenção", 1);
            }
        }
    }
}
