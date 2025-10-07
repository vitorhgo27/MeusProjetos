
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ordenação {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> nomes = new ArrayList<>();
        
        int qtd;
        
        System.out.println("Listagem de Alunos!");
        System.out.println("Insira a quantidade de alunos: ");
        qtd = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i < qtd; i++){
            System.out.println("Digite o " + (i+1) + "° nome: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        
        Collections.sort(nomes);
        
        System.out.println("\nAlunos Inseridos: ");
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        scanner.close();
    }
}