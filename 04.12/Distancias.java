/* 
Escreva um programa em Java que imprima a velocidade em metros por
segundo, milhas por horas e pés por segundo correspondentes às
velocidades em quilômetros por hora, de zero a cinquenta, de meio em
meio quilômetro por hora.
A conversão das unidades de velocidade segue a lista abaixo.
    1 quilômetro por hora = 0.2778 metros por segundo
    1 quilômetro por hora = 0.6214 milhas por hora
    1 quilômetro por hora = 0.9113 pés por segundo
 
 */

import java.text.DecimalFormat;

public class Distancias {
    public static void main(String[] args) {
        double kmph = 0.0, mps, mph,fps;

        System.out.println("km/h\tm/s\tfps");
        while (kmph <= 50.0) {
            mps = kmph * 0.2778;
            mph = kmph * 0.6214;
            fps = kmph * 0.9113;
            System.out.println(new DecimalFormat("00.00").format(kmph) + "\t" + new DecimalFormat("00.00").format(mps) + "\t" + new DecimalFormat("00.00").format(mph) + "\t" + new DecimalFormat("00.00").format(fps)) ;
            kmph += 0.5;
        }
    }
}
