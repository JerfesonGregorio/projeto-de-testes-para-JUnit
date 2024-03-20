package modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

public class PessoaTest {

    Pessoa pessoa1 = new Pessoa("João", 1234);

    @ParameterizedTest
    @MethodSource("definirNomeEhMatricula")
    void alterarNomeEhMatriculaDePessoa1(String novoNome, int novaMatricula) {
        pessoa1.setNome(novoNome);
        pessoa1.setMatricula(novaMatricula);
        Assertions.assertEquals(novoNome, pessoa1.getNome());
        Assertions.assertEquals(novaMatricula, pessoa1.getMatricula());
    }

    public static Stream<Arguments> definirNomeEhMatricula() {
        return Stream.of(
                Arguments.of("Carlos", 2222)
        );
    }

}
