/*  Escreva a classe RegistroAcademico com os atributos nome, matricula, codigoCurso e  percentualDeCobranca, além dos métodos 
    inicializaRegistroAcademico e calculaMensalidade
    A mensalidade é igual a 100 x codigoCurso x percentualDeCobranca
    Crie a classe executável DemoRegistroAcademico onde o objeto michael, do tipo RegistroAcademico, é criado e seus atributos são 
    inicializados com o método inicializaRegistroAcademico. Por fim, calcule e informe o valor da mensalidade de michael.
 */
package classes.faculdade;
public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualDeCobranca;

    public void inicializaRegistroAcademico(String n, String m, int c, double p){
        nome = n;
        matricula = m;
        codigoCurso = c;
        percentualDeCobranca = p;
    }

    public double calculaMensalidade(){
        return 100*codigoCurso*percentualDeCobranca;
    }
}
