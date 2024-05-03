import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gerador gerar = new Gerador();
        System.out.println("1 - Gerar senha ");
        System.out.println("2 - Sair");
        System.out.println("Escolha a opção: ");
        int escolha = scanner.nextInt();
        if (escolha == 1){
            while (true) {
                System.out.println("1- Apenas numeros");
                System.out.println("2- Numero+Letras");
                System.out.println("3- Numeros+Letras+Caracteres especiais");
                escolha = scanner.nextInt();
                System.out.println("Digite o tamanho da senha: ");
                int tam = scanner.nextInt();
                if (escolha == 1){
                    System.out.println("Sua senha: "+gerar.gerar(tam));
                    break;
                }else if(escolha == 2){
                    System.out.println("Sua senha : "+gerar.gerarLetras(tam));
                    break;
                }else if (escolha == 3){
                    System.out.println("Sua senha : "+gerar.gerarespeciais(tam));
                    break;
                }
            }

        }
        scanner.close();
    }
}