import java.util.Scanner;

public class Questao1 {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
        if(idade < 16){
            System.out.print("Não votante");
        } else if(idade == 16 || idade == 17 || idade > 65){
            System.out.print("Votante facultativo");
        } else if(idade >= 18 && idade <= 65){
            System.out.print("Votante obrigatório");
        }
        
    }
}