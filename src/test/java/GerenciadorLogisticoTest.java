import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class GerenciadorLogisticoTest {
	@Test
	void deveContarAtividadesRealizadas() {
		ListaAtividades listaAtividades = new ListaAtividades(
			new Atividade("Anexação de vagões", true),
			new Atividade("Descarga de containers", false),
			new Atividade("Anexação de containers", true),
			new Atividade("Descarga de vagões", true)
		);
		assertEquals(3, GerenciadorLogistico.contarAtividadesRealizadas(listaAtividades));
	}

	@Test
	void deveListarDescricoesAtividades() {
		ListaAtividades listaAtividades = new ListaAtividades(
			new Atividade("Anexação de vagões", true),
			new Atividade("Descarga de containers", false),
			new Atividade("Anexação de containers", true),
			new Atividade("Descarga de vagões", true)
		);
		assertEquals("Anexação de vagões, Descarga de containers, Anexação de containers, Descarga de vagões", GerenciadorLogistico.listarDescricoesAtividades(listaAtividades));
	}

	@Test
	void deveListarApenasAtividadesRealizadas() {
		ListaAtividades listaAtividades = new ListaAtividades(
			new Atividade("Anexação de vagões", true),
			new Atividade("Descarga de containers", false),
			new Atividade("Anexação de containers", true),
			new Atividade("Descarga de vagões", true)
		);
		List<Atividade> atividadesRealizadas = GerenciadorLogistico.listarAtividadesRealizadas(listaAtividades);
		assertEquals(3, atividadesRealizadas.size());
		assertTrue(atividadesRealizadas.stream().allMatch(Atividade::isRealizada));
	}
}
