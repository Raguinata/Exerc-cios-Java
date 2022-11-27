package Ex1;
import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) throws Exception {

        String reversa;
        int tamanhoPilha = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe quantas palavras ou frases você deseja colocar na pilha"));

        Deque<String> pilha = new ArrayDeque<String>();

        for (int i = 0; i < tamanhoPilha; i++) {
            pilha.push(JOptionPane.showInputDialog(null, "Insira a " + (i + 1) + " frase ou palavra"));
        }

        System.out.println(pilha);
        System.out.println();

        for (int i = 0; i < tamanhoPilha; i++) {
            System.out.print(pilha.element() + " = ");
            reversa = new StringBuffer(pilha.pop()).reverse().toString();
            System.out.println(reversa);
        }
    }
}
