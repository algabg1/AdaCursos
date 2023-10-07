import java.time.LocalDate;
import java.util.Locale;
import java.time.format.TextStyle;
import java.time.LocalDateTime;

public class Manipulacao {
    public static void main(String[] args) {
        //olá, {nome}. hoje é {dia da semana}, BOM DIA.

        String nome = "Ana";
        //System.out.println(nome.toUpperCase(null));
        //System.out.println(nome.toLowerCase(null));
        //System.out.println(nome.length());
        System.out.println(nome);

        String outroNome = "Ana";
        System.out.println(nome.equals(outroNome)); //true ou false
        //System.out.println(nome.equalsIgnoreCase(outroNome)); //ignora maiusculas e minusculas

        // data ISO 8601
        LocalDate hoje = LocalDate.now(); //import java.time.localDate
        System.out.println(hoje);

        Locale brasil = new Locale("pt", "BR"); //import java.util.Locale
        String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil); //import java.time.format.TextStyle

        String saudacao;
        
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora. getHour() < 18){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora. getHour() < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "olá.";
        }

        System.out.printf("Olá, %s, hoje é %s, %s.%n", nome, diaDaSemana, saudacao.toUpperCase());

    }
}
