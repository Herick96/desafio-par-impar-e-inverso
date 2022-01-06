package herick;

import java.util.Locale;
import java.util.Scanner;

public class vetor {

    private Integer controle = null;
    private controlar controlar = new controlar();

    public static void main(String[] args) {
        vetor vetor = new vetor();
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.ENGLISH);

        int impar[] = new int[10];
        int par[] = new int[10];
        int v2 = 0;
        int v1 = 0;

        int v[] = new int[10];

        for (int c = 0; c < v.length; c++) {
            System.out.println("Digite um numero: ");
            v[c] = input.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                par[v2] = v[i];
                v2++;
            } else {
                impar[v1] = v[i];
                v1++;
            }
        }

        while (vetor.controle == null || vetor.controle != 0) {
            vetor.inputControle(input);
            int i = 0;

            if (vetor.controle == 1) {

                System.out.println("Esse é o V1: ");
                for (i = 0; i < v1; i++) {
                    System.out.println(impar[i]);
                }
                System.out.println("Esse é o V2: ");
                for (i = 0; i < v2; i++) {
                    System.out.println(par[i]);
                }

            } else if (vetor.controle == 2) {

                System.out.println("Esse é o V1: ");
                for (i = v1 - 1; i >= 0; i--) {
                    System.out.println(impar[i]);
                }
                System.out.println("Esse é o V2: ");
                for (i = v2 - 1; i >= 0; i--) {
                    System.out.println(par[i]);
                }
            }
        }
    }

    public void inputControle(Scanner input) {
        do {
            try {
                System.out.print("Informe o tipo de controle: ");
                controle = input.nextInt();
                controlar.setControle(controle);

                if (controle < 0 || controle > 2) {
                    System.out.println("O controle tem que ser 0, 1 ou 2 digite novamente: ");
                }

            } catch (Exception ex) {
                System.out.println("Você digitou um tipo de controle errado, digite novamente.");
                controle = null;
                input.next();
            }
        } while (controle == null);

        if (controle == 0) {
            input.close();
        }
    }
}

