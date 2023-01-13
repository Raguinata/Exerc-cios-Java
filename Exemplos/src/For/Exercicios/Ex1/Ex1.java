package For.Exercicios.Ex1;

public class Ex1 {
    public static void main(String[] args) {
        int geracao = 1;
        int ano = 1528;

        while(ano < 2023) {
            System.out.println(geracao + "° foi em " + ano);
            geracao++;
            ano += 28;
        }
    }
}
