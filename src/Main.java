import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Analise de dados");
        curso1.setDescricao("Desenvolvendo a analise ");
        curso1.setCargaHoraria(88);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Desenvolvimento com Java ");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Usando a IDE InteliJ");
        mentoria.setdescricao("Aprenda a utilizar a IDE de forma mais eficiente");
        mentoria.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria );

    }
}