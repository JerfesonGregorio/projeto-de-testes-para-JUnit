package modelos;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DisciplinaTest {

    Turma turma1;
    Professor professor1;
    Professor professor2;
    Professor professor3;
    Professor professor4;
    Aluno aluno1;
    Disciplina disciplina1;

    @BeforeEach
    void instanciacaoDeObjetos() {
        turma1 = new Turma("1A", 1);
        professor1 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        professor2 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        professor3 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        professor4 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        aluno1 = new Aluno("João", 12345, new Date(), turma1);
        disciplina1 = new Disciplina("Matemática", 60);
        disciplina1.adicionarProfessor(professor1);
        disciplina1.adicionarProfessor(professor2);
        disciplina1.adicionarProfessor(professor3);
        disciplina1.adicionarProfessor(professor4);
    }

    @Test
    void retornarProfessorCadastradoNaDisciplina() {
        var professor = disciplina1.getProfessor(0);
        assertEquals(professor, professor1);
        System.out.println(professor.getNome() +" == "+ disciplina1.getProfessor(0).getNome());
    }

    @Test
    void deveExcluirOhProfessorDaDisciplina() {
        disciplina1.excluirProfessor(professor1);
        assertEquals(3, disciplina1.quantidadeProfessor());
    }

    @Test
    void deveRetornarAhQuantidadeDeProfessoresDaDisciplina() {
        int quantidadeDeProfessores = disciplina1.quantidadeProfessor();
        assertEquals(4, quantidadeDeProfessores);
    }

    @Test
    void deveRetornarAhCargaHorariaDaDisciplina() {
        int cargaHoraria = disciplina1.getCargaHoraria();
        assertEquals(60, cargaHoraria);
    }

    @Test
    void deveAlterarAhCargaHorariaDaDisciplina() {
        int cargaHoraria = disciplina1.setCargaHoraria(90);
        assertEquals(90, cargaHoraria);
    }

}
