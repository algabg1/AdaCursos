public class Funcoes {
    public static void main(String[] args) {
        String nome = "Ana";
        saudacao(nome);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    public static void saudacao(String nome){
        System.out.printf("Olá, %s.%n", nome);
    }

    public static int soma(int a, int b){
        return a+b;
    }
}
