import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        Curso c1 = new Curso();
        Curso c2 = new Curso();

        c2.setTitulo("Granadas CS");
        c2.setDescrição("Grandas Mirage");
        c2.setCargaHorária(3);

        System.out.println(c2.toString());
    }
}