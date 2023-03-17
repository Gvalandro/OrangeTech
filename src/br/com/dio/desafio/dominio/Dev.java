package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosMatriculados = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();


    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosMatriculados.addAll(bootcamp.getConteudos());
        bootcamp.getDevMatriculados().add(this);
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosMatriculados.stream().findFirst();
        if(conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosMatriculados.remove(conteudo.get());
        }
    }

    public double calcularXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::cacularXp).sum();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosMatriculados() {
        return conteudosMatriculados;
    }

    public void setConteudosMatriculados(Set<Conteudo> conteudosMatriculados) {
        this.conteudosMatriculados = conteudosMatriculados;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
}
