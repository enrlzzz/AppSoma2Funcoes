package Main;

import java.util.Scanner;

public class AppSomaFuncao {
    public static void main(String[] args) {
        
        soma(0, 0);
        enviaemail(args);
        
                
        
        
    }
    
    public static void soma (double num1, double num2) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("bem vindo(a) ao AppSomaFuncao");
        System.out.println("Digite dois n�meros para serem somados.");
        
        System.out.println("Digite o primeiro n�mero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo n�mero: ");
        num2 = scanner.nextInt();
        
        double soma = num1 + num2;
        
        System.out.println("A soma dos dois n�meros �: " + soma);
    }
    
    public static void enviaemail(String [] args) {
                
        System.out.println("Voc� deseja somar denovo?");
        
        
       
        
    }
    
}
