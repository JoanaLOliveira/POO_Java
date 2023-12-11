import java.util.Scanner;

public class DistanciaPonto {
    public static void main(String[] args) {
        double x1,y1,x2,y2,dist;
        Scanner ent = new Scanner(System.in);
        
        System.out.print("x1: ");
        x1 = ent.nextDouble();
        System.out.print("y1: ");
        y1 = ent.nextDouble();
        System.out.print("x2: ");
        x2 = ent.nextDouble();
        System.out.print("y2: ");
        y2 = ent.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1, 2.0));

        System.out.println("Distancia = " + dist);

        ent.close();
    }    
}
