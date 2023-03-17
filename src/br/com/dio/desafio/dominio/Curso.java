package br.com.dio.desafio.dominio;
public class Curso extends Conteudo{

    private int cargaHorária;


    private int getCargaHorária() {
        return cargaHorária;
    }

    public void setCargaHorária(int cargaHorária) {
        this.cargaHorária = cargaHorária;
    }

    @Override
    public double cacularXp() {
        return XP_PADRAO * cargaHorária;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescrição() + '\'' +
                "cargaHorária=" + cargaHorária +
                '}';
    }

}
