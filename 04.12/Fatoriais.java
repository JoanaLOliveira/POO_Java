/* 
Escreva um programa que receba um número n e calcule e exiba o 
fatorial de cada número de zero a n.
 */

import java.util.Scanner;

public class Fatoriais {
    public static void main(String[] args) {
        int n, fat;
        Scanner ent = new Scanner (System.in);

        System.out.println("Insira n: ");
        n = ent.nextInt();

        for (int cont = 0; cont <= n; cont++) {
            fat = 1;
            for(int i=cont; i>1; i--){
                fat*=i;
            }
            System.out.println("Fatorial de " +cont + " = " + fat);
        }

        ent.close();
    }
}
