/* 
Crie um programa para receber do usuário os dados de um cartão e verificar se os dados são válidos.
    Os dados que o programa deve receber são nome, número, código e validade (mês e ano).
    A validação consiste em verificar se a validade é maior que a data atual.
    Caso não seja, deve-se solicitar novamente ao usuário a inserção da validade até que sejam informados dados válidos.
    O programa deve exibir uma mensagem quando os dados forem validados.
*/

import java.util.Scanner;
import java.util.Calendar;
public class ValidaCartao {
    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano, mesAtual, anoAtual;
        Scanner ent = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance(); 
        boolean cartaoInvalido;
        
        anoAtual = calendar.get(Calendar.YEAR);
        mesAtual = 1+calendar.get(Calendar.MONTH);

        System.out.println("Nome: ");
        nome = ent.nextLine();
        System.out.println("Numero: ");
        numero = ent.nextLine();
        System.out.println("Codigo: ");
        codigo = ent.nextLine();

        do {
            System.out.println("Mes: ");
            mes = ent.nextInt();
            System.out.println("Ano: ");
            ano = ent.nextInt();
            cartaoInvalido = ano <= anoAtual ||(ano==anoAtual && mes<=mesAtual);
            if (cartaoInvalido) {
                System.out.println("Cartao Invalido");
            }
        } while (cartaoInvalido);

        System.out.println("cartao validado :)");
        ent.close();
    }
}
