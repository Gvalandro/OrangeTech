import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Mentoria m1 = new Mentoria();
        Curso c2 = new Curso();

        m1.setDescrição("Mentoria de Inferno");
        m1.setTitulo("Mentoria CS");
        m1.setData(LocalDate.now());

        c2.setTitulo("Granadas CS");
        c2.setDescrição("Grandas Mirage");
        c2.setCargaHorária(3);

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Orange Tech");
        b1.setDescrição("Bootcamp de Java com Spring");
        b1.getConteudos().add(m1);
        b1.getConteudos().add(c2);

        Dev d1 =  new Dev();
        d1.setNome("Gustavo");
        d1.inscreverBootcamp(b1);
        d1.progredir();
        System.out.println("Conteudos Gustavo Concluido: " + d1.getConteudosConcluidos());



        Dev d2 = new Dev();
        d2.setNome("Nicolle");
        d2.inscreverBootcamp(b1);
        d2.progredir();
        d2.progredir();
        System.out.println("Conteudos Nicolle Concluido: " + d2.getConteudosConcluidos());



        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(d1.calcularXp());
        System.out.println(d2.calcularXp());


    }
}