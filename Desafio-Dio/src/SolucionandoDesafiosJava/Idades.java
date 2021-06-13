package SolucionandoDesafiosJava;
import java.util.Scanner;
public class Idades {

        public static void main(String[] args) {
            int cont = 0;
            double soma = 0;
            double num;
            Scanner leitor = new Scanner(System.in);

            do{
                num = leitor.nextDouble();

                if(num >= 0){
                    soma = num + soma;
                    cont++;
                }
            } while(num >= 0);

            double media = soma / cont;
            System.out.println(String.format("%.2f", media));
        }
}
