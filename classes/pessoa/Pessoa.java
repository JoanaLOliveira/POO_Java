package classes.pessoa;

public class Pessoa {
    private String nome;
    private double altura;
    /* contrutor */
    Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }
    
    /* metodo de acesso*/
    public String getNome(){
        return "Nome: "+this.nome;
    }

    public void setNome(String novoNome){
        if (!novoNome.equals("")) {
            nome = novoNome;
        } else{
            System.out.println("Novo nome invalido");
        }
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double novoAltura){
        if (novoAltura > 0) {
            altura = novoAltura;
        }
    }

    public String toString(){
        String res = "";
        res += "Nome: "+ nome + "\n";
        res += "Altura: "+ altura + "\n";
        return res;
    }
}
