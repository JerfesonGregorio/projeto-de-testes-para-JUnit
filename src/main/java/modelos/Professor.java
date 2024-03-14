package modelos;

import java.math.BigDecimal;
import java.util.*;
public class Professor extends Pessoa{

    private String formacaoAcademica;
    private BigDecimal salario;

    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplinas;

    public Professor(String nome, int matricula, String formacaoAcademica, BigDecimal salario) {
        super(nome, matricula);
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
        disciplinas = new ArrayList<Disciplina>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void excluirDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplinas() {
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao) {
        return disciplinas.get(posicao);
    }

    public String getForcamacaoAcademica() {
        return formacaoAcademica;
    }

    public void setForcamacaoAcademica(String forcamacaoAcademica) {
        this.formacaoAcademica = forcamacaoAcademica;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public void aplicarAvaliacao() {

    }
}
