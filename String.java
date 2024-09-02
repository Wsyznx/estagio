#2 - "String"


import java.util.Scanner;

public class ContarLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para verificar a letra 'a': ");
        String input = scanner.nextLine();

        int contagem = contarLetraA(input);
        boolean existe = contagem > 0;

        if (existe) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contagem + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' (maiúscula ou minúscula) não ocorre na string.");
        }
    }

    public static int contarLetraA(String str) {
        int contagem = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }
        return contagem;
    }
}



  
