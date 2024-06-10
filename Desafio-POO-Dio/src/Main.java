import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Java do básico ao avançado");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao("Python do básico ao avançado");
        curso2.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();

        Conteudo conteudo = new Curso();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Ensinando passo a passo");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Oportunidade para entrar no Santander 2024");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev fernando = new Dev();
        fernando.setNome("Fernando");
        fernando.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + fernando.getConteudosInscritos());
        fernando.progredir();
        System.out.println("XP" + fernando.calcularXp());
        System.out.println("Conteudos Concluidos fernando" + fernando.getConteudosConcluidos());

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + joao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos joão" + joao.getConteudosConcluidos());



    }
}