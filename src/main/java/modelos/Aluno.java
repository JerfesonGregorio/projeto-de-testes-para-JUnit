package modelos;

import java.lang.reflect.Constructor;
import java.util.*;
public class Aluno extends Pessoa{
     private Date dataNascimento;

     private Turma turma;

     public Aluno(String nome, int matricula, Date dataNascimento, Turma turma) {
          super(nome, matricula);
          this.dataNascimento = dataNascimento;
          this.turma = turma;
     }

     void Constructor(Date dataNascimento, Turma turma) {
          this.dataNascimento = dataNascimento;
          this.turma = turma;
     }

     public Date getDataNascimento() {
          return dataNascimento;
     }

     public void setDataNascimento(Date dataNascimento) {
          this.dataNascimento = dataNascimento;
     }

     public Turma getTurma() {
          return turma;
     }

     public void setTurma(Turma turma) {
          this.turma = turma;
     }
}
