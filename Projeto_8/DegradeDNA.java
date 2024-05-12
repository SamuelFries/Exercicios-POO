package Projeto_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class DegradeDNA {

    public static String degradeDNA(String dna) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char base : dna.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() != base) {
                char base1 = stack.pop();
                char base2 = base;
                switch (base1) {
                    case 'D':
                        if (base2 == 'N') {
                            stack.push('A');
                        } else {
                            stack.push('D');
                            stack.push('D');
                        }
                        break;
                    case 'N':
                        if (base2 == 'D') {
                            stack.push('A');
                        } else {
                            stack.push('N');
                            stack.push('N');
                        }
                        break;
                    case 'A':
                        if (base2 == 'D') {
                            stack.push('N');
                        } else {
                            stack.push('A');
                            stack.push('A');
                        }
                        break;
                }
            } else {
                stack.push(base);
            }
        }
        
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pollLast());
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
        // Lê o arquivo de entrada contendo a sequência de DNA
        String filename = "caso2.txt"; // nome do arquivo
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String dnaSequence = reader.readLine();
            
            // Degrada o DNA
            String degradedDNA = degradeDNA(dnaSequence);
            
            // Imprime a cadeia resultante
            System.out.println("Cadeia resultante: " + degradedDNA);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // tempo em milissegundos
        System.out.println("Tempo de processamento: " + duration + " ms");
    }
}
