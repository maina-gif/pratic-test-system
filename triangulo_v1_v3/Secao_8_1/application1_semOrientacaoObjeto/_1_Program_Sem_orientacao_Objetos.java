package Secao_8_1.application1_semOrientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class _1_Program_Sem_orientacao_Objetos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;

        System.out.println("Enter the measures of triangle X: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();

        double p = (xa + xb + xc) / 2.0;
        double areaX = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));

        p = (ya + yb + yc) / 2.0;
        double areaY = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}
