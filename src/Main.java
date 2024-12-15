import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =  new Curso();
        curso1.setTitulo("Analise de dados");
        curso1.setDescricao("Desenvolvendo a analise ");
        curso1.setCargaHoraria(88);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Desenvolvimento com Java ");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Usando a IDE InteliJ");
        mentoria.setDescricao("Aprenda a utilizar a IDE de forma mais eficiente");
        mentoria.setData(LocalDate.now());
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria );

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getconteudo().add(curso1);
        bootcamp.getconteudo().add(curso2);
        bootcamp.getconteudo().add(mentoria);

        Dev devJean = new Dev();
        devJean.setNome("Jean");
        devJean.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos Jean: " + devJean.getConteudoInscrito());
        devJean.progredir();
        System.out.println("Conteudos inscritos Jean: " + devJean.getConteudoInscrito());
        System.out.println("Conteudos concluidos Jean: " + devJean.getConteudoConcluido());
        System.out.println("Xp: " + devJean.calcularTotalXp());

        Dev devAdrieli = new Dev();
        devAdrieli.setNome("Adrieli");
        devAdrieli.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Adrieli: " + devAdrieli.getConteudoInscrito());
        devAdrieli.progredir();
        System.out.println("Conteudos inscritos Adrieli: " + devAdrieli.getConteudoInscrito());
        System.out.println("Conteudos concluidos Adrieli: " + devAdrieli.getConteudoConcluido());
        System.out.println("Xp: " + devAdrieli.calcularTotalXp());
    }
}