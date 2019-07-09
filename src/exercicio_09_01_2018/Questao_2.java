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
public class Questao_2 {


    public static void main(String[] args) {

        for (int i = 1; i <= 100 + 1; i++) {
            System.out.println(i);
        }

        int i = 0,
                i2 = 0;

        while (i < 100) {
            i++;
            System.out.println(i);
        }

        do {
            i2++;
            System.out.println(i2);
        } while (i2 < 100);
    }
}
