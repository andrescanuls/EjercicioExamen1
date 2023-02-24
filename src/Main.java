import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        numero1 = sc.nextInt();

        System.out.print("Número 2: ");
        numero2 = sc.nextInt();

        numeros numeros = new numeros(numero1,numero2);

        if (numeros.operaciones1() != numeros.operacion01() || numeros.operaciones2() > numeros.operacion02()) {
            System.out.println(numeros.resta() + " no divide exatamente a  " + numero1 + " y " + numero2);
            System.out.println("Número 1 : " + numeros.operaciones1());
            System.out.println("Número 2 : " + numeros.operaciones2());
        }
        else {
            System.out.println(numeros.resta() + " divide exatamente a  " + numero1 + " y " + numero2);
            System.out.println("Número 1 : " + numeros.operaciones1());
            System.out.println("Número 2 : " + numeros.operaciones2());
        }
    }//Fin clase main

    static class numeros{
        int num1;
        int num2;
        protected numeros(int num01, int num02){
            this.num1 = num01;
            this.num2 = num02;
        }

        public double operaciones1(){
            int resta = this.num1 - this.num2;

            double division1 = num1 / (1.0 * resta) ;

            return division1;
        }
        public int operacion01(){
            int resta = this.num1 - this.num2;

            int division1 = num1 / resta ;

            return division1;
        }

        public double operaciones2(){
            int resta = this.num1 - this.num2;

            double division2 = num2 / (1.0 * resta);

            return division2;
        }
        public int operacion02(){
            int resta = this.num1 - this.num2;

            int division2 = num1 / resta ;

            return division2;
        }

        public int resta(){
            int resta = this.num1 - this.num2;

            return resta;
        }
    }//Fin class numero
}//Final del programa