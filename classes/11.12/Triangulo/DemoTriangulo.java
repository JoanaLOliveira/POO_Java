package Triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulo t1, t2, t3;
        t1 = new Triangulo(); // objeto
        t1.inicializaTriangulo(2.5, 2.5, 2.5, "isosceles");
        t2 = new Triangulo(); // objeto
        t2.inicializaTriangulo(2.5, 2.5, 2.5, "isosceles");
        t3 = t1;
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
