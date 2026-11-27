import org.example.Main;
import org.example.colaborador;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CadastroColaboradorPadraoTest {

    @Test
    void deveCadastrarColaboradorPadrao() {

        // Simula os dados digitados pelo usuário
        String entrada = "1001\nAna Souza\n3000,00\n";

        InputStream entradaOriginal = System.in;

        try {
            System.setIn(new ByteArrayInputStream(
                    entrada.getBytes()
            ));

            // Cria uma lista vazia de colaboradores
            List<colaborador> colaboradores = new ArrayList<>();

            // Executa o cadastro de colaborador padrão
            Main.CadastraColaborador(colaboradores, 1);

            // Verifica se o colaborador foi adicionado
            assertEquals(1, colaboradores.size());

            // Recupera o colaborador cadastrado
            colaborador cadastrado = colaboradores.get(0);

            // Verifica os dados cadastrados
            assertEquals(1001, cadastrado.getMatricula());
            assertEquals("Ana Souza", cadastrado.getNome());
            assertEquals(3000.00, cadastrado.getSalarioBase(), 0.01);

        } finally {
            // Restaura a entrada original
            System.setIn(entradaOriginal);
        }
    }
}