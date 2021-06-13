package DesafiosMatemáticosJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class AnaliseDeNumeros {
        public static void main(String[] args) throws IOException {
            String linha;
            int pos, neg, par, impar, num;

            pos = neg = par = impar = 0;
            BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 5; i++) {
                linha = leitor.readLine();
                num = Integer.parseInt(linha);

                if (num % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                if (num > 0) pos++;
                if (num < 0) neg++;
            }

            System.out.println("" + par +" valor(es) par(es)");
            System.out.println("" + impar + " valor(es) impar(es)");
            System.out.println("" + pos + " valor(es) positivo(s)");
            System.out.println("" + neg + " valor(es) negativo(s)");
        }
    }

