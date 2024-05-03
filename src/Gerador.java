import java.util.Random;

public class Gerador{
    private final String especial = "!@#$%¨&*()_-";
    private final String numeros = "0123456789";
    private final String letras = "abcdefghijklmnopqrstuvwxyz";
    private final Random random = new Random();
    public String getEspecial() {
        return especial;
    }

    public String getNumeros() {
        return numeros;
    }

    public String getLetras() {
        return letras;
    }

    public String gerar(int tam) {
        return this.criaSenha(this.numeros,tam);
    }
    public String gerarLetras(int tam) {
        String juncao = this.numeros+ this.letras;
        return this.criaSenha(juncao,tam);
    }
    public String gerarespeciais(int tam) {
        String juncao = this.especial + this.numeros +this.letras ;
        return this.criaSenha(juncao,tam);
    }
    private String criaSenha(String corpo,int tam) {
        StringBuilder senha = new StringBuilder();
        for(int i = 0;i <=tam;i++) {
            int a = this.random.nextInt(corpo.length());
             senha.append(corpo.charAt(a));
        }
        return senha.toString();
    }
}