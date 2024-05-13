package Projeto_8;

import java.io.BufferedReader; //ler linhas de texto
import java.io.FileReader;
import java.io.IOException; //lidar com exceções de entrada e saída
import java.util.Scanner;

public class DegradadorDNA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o caso desejado (caso001, caso100, caso200, caso500, caso1000, caso2000):");
        String casoEscolhido = scanner.nextLine().trim();
        scanner.close();

        String fileName = getFilePath(casoEscolhido);
        if (fileName == null) {
            System.out.println("Caso inválido.");
            return;
        }

        long startTime = System.currentTimeMillis(); //tempo de início do processamento
        try {
            String dnaSequence = readDNASequenceFromFile(fileName);
            String mutatedDNA = processDNA(dnaSequence);
            long endTime = System.currentTimeMillis();
            long processingTime = endTime - startTime; //tempo no fim do processamento em ms
            System.out.println("Tempo de processamento: " + processingTime + " milissegundos");
            System.out.println("Cadeia resultante: " + mutatedDNA);
      
        } catch (IOException e) { //tratamento de exceção de entrada e saída
            e.printStackTrace();
        }
    }

    private static String getFilePath(String caso) {
        switch (caso) {
            case "caso001":
                return "caso001.txt";
            case "caso100":
                return "caso100.txt";
            case "caso200":
                return "caso200.txt";
            case "caso500":
                return "caso500.txt";
            case "caso1000":
                return "caso1000.txt";
            case "caso2000":
                return "caso2000.txt";
            default:
                return null;
        }
    }

    private static String readDNASequenceFromFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }
        return sb.toString();
    }

    private static String processDNA(String dnaSequence) {
        StringBuilder mutatedDNA = new StringBuilder();
        while (dnaSequence.length() >= 2) {
            if (dnaSequence.charAt(0) != dnaSequence.charAt(1)) {
                mutatedDNA.append(getThirdBase(dnaSequence.charAt(0), dnaSequence.charAt(1)));
                dnaSequence = dnaSequence.substring(2);
            } else {
                mutatedDNA.append(dnaSequence.charAt(0));
                dnaSequence = dnaSequence.substring(1);
            }
        }
        mutatedDNA.append(dnaSequence); // Adiciona qualquer base restante, se houver
        return mutatedDNA.toString();
    }

    private static char getThirdBase(char firstBase, char secondBase) {
        if ((firstBase == 'D' && secondBase == 'N') || (firstBase == 'N' && secondBase == 'D')) {
            return 'A';
        } else if ((firstBase == 'D' && secondBase == 'A') || (firstBase == 'A' && secondBase == 'D')) {
            return 'N';
        } else { // (firstBase == 'N' && secondBase == 'A') || (firstBase == 'A' && secondBase == 'N')
            return 'D';
        }
    }
}