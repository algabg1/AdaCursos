public class Lacos {
    public static void main(String[] args) {
        /*
         *  1 2 3 4 5 6 7 8 9 10
         * para uma variavel que inicia em 1 vai até 10 mudando 1 por 1
         */

         for (int i =1; i<=10; i++){
            System.out.println(i); //println imprime um abaixo do outro | printf na mesma linha
         }

         System.out.println("=============================");

         for(int j=1; j<=10; j+=2){
            System.out.println(j);
         }

         System.out.println("=============================");

         for (int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(j + "x" + i + " = " + j*i);
            }
         }

    }
}
