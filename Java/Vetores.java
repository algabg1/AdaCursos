import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        // índices [0] [1] [2] [3] [4]

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //System.out.println(numeros); endereço de memoria
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        System.out.println("=============================");

        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";

        String[] letras2 = {"F", "G", "H", "I", "J"};

        for(int i=0;i<letras.length;i++){
            System.out.println(letras[i]);
        }

        System.out.println("=============================");

        for(int i=0;i<letras2.length;i++){
            System.out.println(letras2[i]);
        }

        System.out.println("=============================");

        System.out.println(Arrays.toString(letras)); //import java.util.Arrays;

        /*
         * qual o maior elemento na array
         */

        int maior = numeros[0], menor = numeros[0], media = 0;

        for (int i=0; i<numeros.length;i++){
            if(numeros[i] > maior){maior = numeros[i];}
            if(numeros[i] < menor){menor = numeros[i];}
            media += numeros[i];
        }

        System.out.printf("maior: %d %nmenor: %d %nmedia: %d", maior, menor, media/numeros.length);
 
    }
}
