// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Introducao {
    public static void main(String[] args) {
        /*
         * relembrando operadores lógicos 
        AND &&
        true && true = true
        true && false = false
        false && true = false
        false && false = false

        OR ||
        true || true = true
        true || false = true
        false || true = true
        false || false = false
         */

        boolean finalDeSemana = true;
        boolean estaSol = true;
        boolean vamosAPraia = finalDeSemana && estaSol;

        System.out.println(vamosAPraia);

        System.out.println("=============================");

        String mensagem = finalDeSemana ? "É final de semnana" : "Não é final de semana";
        System.out.println(mensagem);

        System.out.println("=============================");

        /*
         * relembrando valores lógicos
         * usando if-else
         */

         int nota = 70;
         String graduacao = "";

         if (nota >= 70) {
            //System.out.println("Aluno aprovado");
         } else {
            //System.out.println("Aluno não aprovado");
         }

         if (nota >= 80) {
            graduacao = "A";
         } else if (nota < 80 && nota >= 70){
            graduacao = "B";
         } else if (nota < 70 && nota >= 60){
            graduacao = "C";
         } else if (nota < 60 && nota >= 0){
            graduacao = "D";
         } else{
            graduacao = null;
         }
         
         System.out.println("Graduação " + graduacao);

         switch (graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno não aprovado");
                break;
            default:
                System.out.println("Inválido");
         }
    }
}
