package TratamentodeExcecoes;
import java.lang.Exception;
import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e ) {
            System.out.println("Primeiro valor maior que o segundo");
        }

    }
    static void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroUm > parametroDois) {
            throw new Exception();
        }else {
            int contagem = parametroDois - parametroUm;
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Numero:" + i);

            }
        }
    }
}