import java.util.Scanner;

public class Questao5{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;
        String dias[] = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        System.out.println("Informe um número de 1 a 7: ");
        num = ler.nextInt();
        switch(num){
            case 1: System.out.println(dias[0]);
            break;
            case 2: System.out.println(dias[1]);
            break;
            case 3: System.out.println(dias[2]);
            break;
            case 4: System.out.println(dias[3]);
            break;
            case 5: System.out.println(dias[4]);
            break;
            case 6: System.out.println(dias[5]);
            break;
            case 7: System.out.println(dias[6]);
            break;
            default: System.out.println("Número inválido.");
        }
    }
}