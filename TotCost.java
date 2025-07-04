
//calc total painting cost for a property
//interior wall=$18 per sq.ft
//exterior wall=$12 per sq.ft
import java.util.Scanner;

public class TotCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter number of interior walls:");
        int interior = sc.nextInt();
        System.err.println("enter number of exterior walls:");
        int exterior = sc.nextInt();
        float insum = 0;
        float[] insurface = new float[interior];
        System.err.println("enter surface of all interior walls:");
        for (int i = 0; i < interior; i++) {
            insurface[i] = sc.nextFloat();
            insum += insurface[i] * 18;// interior wall cost->18
        }
        float exsum = 0;
        float[] exsurface = new float[exterior];
        System.err.println("enter surface of all exterior walls:");
        for (int i = 0; i < exterior; i++) {
            exsurface[i] = sc.nextFloat();
            exsum += exsurface[i] * 12;// exterior wall cost->12
        }
        float tot = insum + exsum;
        System.out.println("Total cost of painting: " + tot);
    }
}
