import java.util.Random;

public class Gerador{
    private final String especial = "!@#$%¨&*()_-";
    private final String numeros = "0123456789";
    private final String letras = "abcdefghijklmnopqrstuvwxyz";

    public String getEspecial() {
        return especial;
    }

    public String getNumeros() {
        return numeros;
    }

    public String getLetras() {
        return letras;
    }

    public String gerar(int tamanho){
        Random random = new Random();
        String senha ="";
        for(int i = 0;i<= tamanho;i++){
            int a = random.nextInt(this.numeros.length());
            senha += this.numeros.charAt(a);
        }
        return senha;
    }
    public String gerarLetras() {
        return "";
    }
    public String gerarespeciais(){
        return "";
    }
}