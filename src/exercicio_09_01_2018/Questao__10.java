/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_09_01_2018;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Questao__10 {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i < 100; i++) {
            if ((i % 2) == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}
