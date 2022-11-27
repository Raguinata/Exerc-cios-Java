package Ex2;

import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.JOptionPane;

public class Ex2 {
    public static void main(String[] args) {

        int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe quantos números você deseja converter para bínario"));
        boolean validacao = false;
        String binario;

        Deque<Integer> pilha = new ArrayDeque<Integer>();

        for (int j = 0; j < qtdNumeros; j++) {
            do {
                validacao = false;
                pilha.push(Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Informe o " + (j + 1) + "º número para ser convertido, o número deve ser POSITIVO")));

                if (pilha.element() < 0) {
                    validacao = true;
                    JOptionPane.showMessageDialog(null, "ERRO! Não pode inserir um número NEGATIVO", null,
                            JOptionPane.ERROR_MESSAGE);
                    pilha.pop();
                }

            } while (validacao == true);
        }

        System.out.println("Essa são os números escolhidos para a conversão: \n" + pilha);

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print(pilha.element() + " = ");
            binario = Integer.toBinaryString(pilha.element());
            System.out.println(binario);
            pilha.pop();
        }
    }
}