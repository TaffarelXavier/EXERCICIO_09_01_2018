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
public class Questao_6 {

    public static void main(String[] args) {
        //CRIA O VETOR DE TAMANHO 6
        double n[] = new double[15];
        //
        int soma = 0;
        //PARA SAÍDA:

        //FAZ A LEITURA
        for (int i = 0; i < n.length; i++) {
            n[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Digite a nota para o aluno número: "
                            + (i + 1)));
        }

        for (int i = 0; i < n.length; i++) {
            soma += n[i];

        }
        JOptionPane.showMessageDialog(null,
                "A média é: " + (soma / 15), "Atenção", 1);

    }
}
