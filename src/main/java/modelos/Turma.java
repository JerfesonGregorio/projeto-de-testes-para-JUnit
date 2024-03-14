package modelos;

import java.util.*;
public class Turma {

    private String sigla;
    private int ano;

    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<String> listaDeAlunos;

    public Turma(String sigla, int ano) {
        this.sigla = sigla;
        this.ano = ano;
        disciplinas = new ArrayList<Disciplina>();
        professores = new ArrayList<Professor>();
        alunos = new ArrayList<Aluno>();
        listaDeAlunos = new ArrayList<String>();
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Aluno getAluno(int posicao) {
    return alunos.get(posicao);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public void removerProfessor(Professor professor) {
        professores.remove(professor);
    }

    public Professor getProfessor(int posicao) {
        return professores.get(posicao);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public int quantidadeDisciplinas() {
        return disciplinas.size();
    }

    public void removerDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public ArrayList<String> getListaDeAlunos() {

        for (Aluno aluno : alunos) {
            this.listaDeAlunos.add(aluno.getNome());
        }

        return listaDeAlunos;
    }

}
