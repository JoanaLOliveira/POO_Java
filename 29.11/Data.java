/* 
Escreva um programa que leia uma data com dia, mês e ano como
números inteiros e retorne a data no formato a seguir:
    “[dia] de [mês] de [ano]”
    “9 de agosto de 2021”
    Utilize a estrutura if…else
Informe também quantos dias tem o mês da data informada
    Para simplificar, considere que fevereiro sempre tem 28 dias
    Utilize a estrutura switch
*/

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia, mes, ano, qtdDias;
        String saidaFormatada= "";
        System.out.println("Dia: ");
        dia = ent.nextInt();
        System.out.println("Mes: ");
        mes = ent.nextInt();
        System.out.println("Ano: ");
        ano = ent.nextInt();

        saidaFormatada += dia + " de ";

        if (mes == 1 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 2 ) {
            saidaFormatada += "fevereiro";
        } else if (mes == 3 ) {
            saidaFormatada += "marco";
        } else if (mes == 4 ) {
            saidaFormatada += "abril";
        } else if (mes == 5 ) {
            saidaFormatada += "maio";
        } else if (mes == 6 ) {
            saidaFormatada += "junho";
        } else if (mes == 7 ) {
            saidaFormatada += "julho";
        } else if (mes == 8 ) {
            saidaFormatada += "agosto";
        } else if (mes == 9 ) {
            saidaFormatada += "setembro";
        } else if (mes == 10 ) {
            saidaFormatada += "outubro";
        } else if (mes == 11 ) {
            saidaFormatada += "novembro";
        } else if (mes == 12 ) {
            saidaFormatada += "dezembro";
        } 

        saidaFormatada += (" de " + ano);

        System.out.println(saidaFormatada);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 9:
            case 12:
                qtdDias = 31;
                break;
            case 2:
                qtdDias = 28;
            default: 
                qtdDias = 30;
        }

        System.out.println("Dias do mes: " + qtdDias);
        ent.close();
    }
}
