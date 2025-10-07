import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de IMC");
        System.out.println("Qual sua idade?");
        int idade = scanner.nextInt();
        
        System.out.println("Qual seu peso?");
        double peso = scanner.nextDouble();
        
        System.out.println("Qual sua altura?");
        double altura = scanner.nextDouble();
        
        double IMC = peso/(altura * altura);
        System.out.printf("Seu IMC é: %.1f\n", IMC);
        
        if(IMC <= 18.5){
            System.out.print("Você está abaixo do peso! Pratique atividades para ganhar massa!");
        }else if(IMC <= 24.9){
            System.out.print("Você está no peso ideal! Pratique atividades e mantenha seu peso!");
        }else if(IMC <= 29.9){
            System.out.print("Excesso de peso! Você está acima do peso, o idel é praticaf atividadades e diminuir seu peso!");
        }else if(IMC <= 34.9){
            System.out.print("Obesidade I! Atenção, você deve diminuir seu peso com atividades!");
        }else if(IMC <= 39.9){
            System.out.print("Obesidade II! Alerta, você precisa emagrecer, pratique atividades e diminua seu peso!");
        }else if(IMC > 39.9){
            System.out.print("Obesidade III! ATENÇÃO, Você está muito acima do peso, pratique atividades e consulte um especialista!");
        }
            scanner.close();
    }
    
}