package modelos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Assertions;

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
    @DisplayName("Teste de atributos")
    void verificarAtributos() {
        Assertions.assertEquals("João", aluno1.getNome());
        Assertions.assertEquals(12345, aluno1.getMatricula());
        System.out.println("Deu certo!");
    }

}
