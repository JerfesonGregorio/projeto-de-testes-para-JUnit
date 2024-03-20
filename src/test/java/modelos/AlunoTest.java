package modelos;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.Date;


@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AlunoTest {

    Turma turma1;
    Professor professor1;
    Aluno aluno1;
    Disciplina disciplina1;

    @BeforeEach
    void instanciacaoObjetos() {
        turma1 = new Turma("1A", 1);
        professor1 = new Professor("Itamar", 222222, "Matemática", new BigDecimal("2300.60"));
        aluno1 = new Aluno("João", 12345, new Date(), turma1);
        disciplina1 = new Disciplina("Matemática", 60);
    }

    @Test
    @DisplayName("verificando atributos de aluno1")
    void verificarAtributos() {
        Assertions.assertEquals("João", aluno1.getNome());
        Assertions.assertEquals(12345, aluno1.getMatricula());
        Assertions.assertEquals("1A", aluno1.getTurma());
    }

    @Test
    @DisplayName("verificando se aluno1 sabe somar")
    void alunoVaiSomarOsNumeros() {
        var resultado = aluno1.calcularValores(2, 2);
        Assertions.assertEquals(resultado, 4);
    }

}
