import java.util.Scanner;
public class avaliacao {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        double N1, N2, N3, N4, N5, N6, N7, N8;

        System.out.println("primeira nota");
        N1 = sc.nextDouble();

        System.out.println("segunda nota");
        N2 = sc.nextDouble();

        System.out.println("terceira nota");
        N3 = sc.nextDouble();

        System.out.println("quarta nota");
        N4 = sc.nextDouble();

        System.out.println("quinta nota");
        N5 = sc.nextDouble();

        System.out.println("sexta nota");
        N6 = sc.nextDouble();

        System.out.println("setima nota");
        N7 = sc.nextDouble();
        
        System.out.println("oitava nota");
        N8 = sc.nextDouble();


        double B1 = (N1 + N2) / 2;
        double B2 = (N3 + N4) / 2;
        double B3 = (N5 + N6) / 2;
        double B4 = (N7 + N8) / 2;


        double S1 = (B1 + B2) / 2;
        double S2 = (B3 + B4) / 2;


        double media = (S1 + S2) / 2;

        boolean resultado = (media >=7);

        System.out.println("media do primeiro bimestre " + B1);
        System.out.println("media do segundo bimestre " + B2);
        System.out.println("media do terceiro bimestre " + B3);
        System.out.println("media do quarto bimestre " + B4);

        System.out.println("media do primeiro semestre " + S1);
        System.out.println("media do segundo semestre " + S2);

        System.out.println("media total foi " + media);
        System.out.println("aprovação"+ resultado);


        sc.close();

    }
}