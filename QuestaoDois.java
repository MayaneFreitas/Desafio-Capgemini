import java.util.List;
import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {

        int countMaiusculo = 0;
        int countMinusculo = 0;
        int countDigito = 0;
        int countCaractereEspecial = 0;

        System.out.print("Por favor, insira a sua senha: ");
        Scanner entrada = new Scanner(System.in);
        String senha = entrada.next();

        if(senha.length() < 6) {
            System.out.printf("Sua senha ainda não é segura. ela possui menos de 6 dígitos.");
        }

        for(int i = 0; i < senha.length(); i++) {

            char c = senha.charAt(i);

            if(Character.isUpperCase(c)) {
                countMaiusculo += 1;
            }
            else if(Character.isLowerCase(c)) {
                countMinusculo += 1;
            }
            else if(Character.isDigit(c)) {
                countDigito += 1;
            }

            else if(senha.contains("!") || senha.contains("@") || senha.contains("#") || senha.contains("$") || senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*") || senha.contains("(") || senha.contains(")") || senha.contains("-") || senha.contains("+")) {
                countCaractereEspecial +=1;
            }

        }

        if(countMaiusculo == 0) {
            System.out.println("Sua senha ainda não é segura. ela não possui letra maiúscula");
        }
        else if(countMinusculo == 0) {
            System.out.println("Sua senha ainda não é segura. ela não possui letra miúscula");
        }
        else if(countDigito == 0) {
            System.out.println("Sua senha ainda não é segura. ela não possui dígito");
        }
        else if(countCaractereEspecial == 0) {
            System.out.println("Sua senha ainda não é segura. ela não possui caractere especial");
        }
        else {
            System.out.println("Sua senha está segura!");
        }

    }

}