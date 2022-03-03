import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        //curso1.setCurso("Curso java");
        curso1.setDescricao("descrição curso");
        curso1.setCargaHoraria(9);

        Curso curso2 = new Curso();

        //curso2.setCurso("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descição mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Felipe:" + devFelipe.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println(devFelipe.calcularTotalXp());

        System.out.println("---------------");

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda:" + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Amanda:" + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Conluídos Amanda:" + devAmanda.getConteudosConcluidos());
        System.out.println(devAmanda.calcularTotalXp());


    }
}
