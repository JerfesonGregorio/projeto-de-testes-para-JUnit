package modelos;

import java.util.*;

public class Disciplina {

    private String nome;

    private int cargaHoraria;

    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        professores = new ArrayList<Professor>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void excluirProfessor(Professor professor) {
        professores.remove(professor);
    }

    public int quantidadeProfessor() {
        return professores.size();
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int setCargaHoraria(int cargaHoraria) {
        if(cargaHoraria > 33 && cargaHoraria < 160) {
            this.cargaHoraria = cargaHoraria;
        }

            return cargaHoraria;
    }
}
