
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificaçãoSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String senha;
        System.out.println("Validação De Senha!");
        boolean senhaValida;
        
        do{
            System.out.println("Crie sua senha:");
            senha = scanner.nextLine();
            
            senhaValida = validacaoSenha(senha);
            
            if (validacaoSenha(senha)) {
            System.out.print("Senha valida");
             }else {
                validarCriterios(senha);
             }
        } while(!senhaValida);
        scanner.close();
    }
    
    public static boolean validacaoSenha(String senha){
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$_&()/?!;:*%]).{9,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
    }
    
    public static void validarCriterios(String senha){
        if (senha.length() <= 8){
            System.out.println("Sua senha deve ter mais caracteres!");
        } if (!senha.matches(".*[A-Z]*.")){
            System.out.println("Sua senha precisa de letras maiusculas!");
        } if (!senha.matches(".*[a-z]*.")){
            System.out.println("Sua senha precisa de letras minusculas!");
        } if (!senha.matches(".*\\d*.")){
            System.out.println("Sua senha deve conter digitos!");
        } if (!senha.matches(".*[@#$_&()/?!;:*%]*.")){
            System.out.println("Sua senha deve ter simbolos!");
        }
    }
}