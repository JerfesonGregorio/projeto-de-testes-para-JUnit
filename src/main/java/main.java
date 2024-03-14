import modelos.*;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class main {

    public static void main(String[] args) {

        Turma turma1 = new Turma("1A", 1);
        Professor professor1 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        Aluno aluno1 = new Aluno("João", 12345, new Date(), turma1);
        Disciplina disciplina1 = new Disciplina("Matemática", 60);

        turma1.adicionarProfessor(professor1);
        turma1.adicionarAluno(aluno1);
        disciplina1.adicionarProfessor(professor1);

        ArrayList<String> alunos = turma1.getListaDeAlunos();

        System.out.println(alunos);
    }

}
