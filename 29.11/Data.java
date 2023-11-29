import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int dia, mes, ano;
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
            saidaFormatada += "janeiro";
        } else if (mes == 3 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 4 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 5 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 6 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 7 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 8 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 9 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 10 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 11 ) {
            saidaFormatada += "janeiro";
        } else if (mes == 12 ) {
            saidaFormatada += "janeiro";
        } 

        saidaFormatada += ("de" + mes);

        ent.close();
    }
}
