package classes.faculdade;
public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico michael = new RegistroAcademico();
        michael.inicializaRegistroAcademico("Michael","cs0981",3,0.75);
        System.out.println("mensalidade de Michal: " + michael.calculaMensalidade());
        //System.out.println("Matricula: " + michael.matricula);

        RegistroAcademico roberto = new RegistroAcademico();
        System.out.println("mensalidade de Roberto: " + roberto.calculaMensalidade());
    }
}