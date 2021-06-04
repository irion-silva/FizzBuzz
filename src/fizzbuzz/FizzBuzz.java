/*"Escreva um programa que imprima os números de 1 a 100. Mas para múltiplos de três imprima
'Fizz' em vez do número e para os múltiplos de cinco imprima 'Buzz'. Para números que são múltiplos
de três e cinco imprimir 'FizzBuzz'"*/

package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        int num = 100;
        for (int i = 1; i <= num; i++) {
            if (((i%3) == 0) && ((i%5) == 0 )){
                System.out.println("FizzBuzz");
            } else if ((i%3) == 0){
                System.out.println("Fizz");
            } else if ((i%5) == 0){
                System.out.println("Buzz");
            } else System.out.println(i); {
                
            }
            
        }
    }
}
