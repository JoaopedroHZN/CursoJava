package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Progam {
    public static void main(String[] args){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatoPersonalizado = agora.format(formatter);
        // Resultado: "08/05/2026"
        //Especifica como o dia o mes e ano devem ser interpretados


        LocalDate d01 = LocalDate.now(); //Data e hora Atual
        LocalDateTime d02 = LocalDateTime.now();// Data e hora minutos e com fracao de segundos
        Instant d03 = Instant.now(); //Data e hora Global 3 horas a frente

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:40:24");
        Instant d06 = Instant.parse("2022-07-20T01:40:24Z");
        Instant d07 = Instant.parse("2022-07-20T01:40:24-03:00");


        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.print(formatoPersonalizado);







    }
}
