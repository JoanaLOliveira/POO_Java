package classes.banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Arthur");
        System.out.println(conta1);

        ContaBancaria conta2 = new ContaBancaria("Aline",1.688,true);
        System.out.println(conta2);
    }    
}
