public class ExemploString {
    public static void main(String[] args) {
        String palavra = "Teste de String feito no ano de "; // String normal, que digita a informação gravada na variálvel
        System.out.println(palavra);

        palavra = palavra + 2022;
        System.out.println(palavra); // Contatena a variável "palavra", com o número 2022

        String frase1 = "Oque os olhos não";
        System.out.println(frase1);

        String frase2 = "Vêem o coração não sente";
        System.out.println(frase2);

        System.out.println(frase1 + frase2); // Concatena as frases sem espaço entre elas
        System.out.println(frase1 + ' ' + frase2); // Concatena as frases com espaço entre elas
    }
}
