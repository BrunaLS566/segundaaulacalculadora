import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Calculadora {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
menu();

    }
public static void menu (){

    System.out.println("seja bem vindo");

    System.out.println("------------");
    System.out.println("1- SOMAR");
    System.out.println("2- SUBTRAIR");
    System.out.println("3- MULTIPLICAR");
    System.out.println("4- DIVIDIR");
    System.out.println("5- SAIR");
    System.out.println("------------");
    int opcao = entrada.nextInt();

    switch (opcao) {

        case 1:
            somar();
            menu ();
            break;
        case 2:
            substrair();
            menu ();
            break;
        case 3:
            multiplicar();
            menu ();
            break;
        case 4:
            dividir();
            menu ();
            break;
        case 5:
            entrada.close();
            break;
        default:
        System.out.println("Digite uma opção valida");


    }

}

    private static void dividir() {
        System.out.println("Digite");
        int valorA = escreva();
        int valorB = escreva();
        if (valorB ==0)
        int resultado = valorA/valorB;
        System.out.println("Resultado %d \n", resultado );

    }

    private static void multiplicar() {
        System.out.println("Digite");
        int valorA = escreva();
        int valorB = escreva();
        int resultado = valorA*valorB;
        System.out.printf("Resultado %d \n", resultado );

    }
    private static void somar() {
        System.out.println("Digite");
        int valorA = escreva();
        int valorB = escreva();
        int resultado = valorA+valorB;
        System.out.printf("Resultado %d \n", resultado );

    }

    private static void substrair() {
        System.out.println("Digite");
        int valorA = escreva();
        int valorB = escreva();
        int resultado = valorA-valorB;
        System.out.printf("Resultado %d \n", resultado );

    }
    public static int escreva(){
        System.out.println("Digite um valor");
        int valor = entrada.nextInt();
        return valor;
    }
}



