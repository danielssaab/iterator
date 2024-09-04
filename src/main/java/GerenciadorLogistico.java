import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciadorLogistico {
	public static Integer contarAtividadesRealizadas(ListaAtividades listaAtividades) {
		int quantidade = 0;
		Iterator<Atividade> iterator = listaAtividades.iterator();
		while (iterator.hasNext()) {
			Atividade atividade = iterator.next();
			if (atividade.isRealizada()) {
				quantidade++;
			}
		}
		return quantidade;
	}

	public static String listarDescricoesAtividades(ListaAtividades listaAtividades) {
		StringBuilder descricoes = new StringBuilder();
		Iterator<Atividade> iterator = listaAtividades.iterator();
		while (iterator.hasNext()) {
			Atividade atividade = iterator.next();
			if (descricoes.length() > 0) {
				descricoes.append(", ");
			}
			descricoes.append(atividade.getDescricao());
		}
		return descricoes.toString();
	}

	public static List<Atividade> listarAtividadesRealizadas(ListaAtividades listaAtividades) {
		List<Atividade> atividadesRealizadas = new ArrayList<>();
		Iterator<Atividade> iterator = listaAtividades.iterator();
		while (iterator.hasNext()) {
			Atividade atividade = iterator.next();
			if (atividade.isRealizada()) {
				atividadesRealizadas.add(atividade);
			}
		}
		return atividadesRealizadas;
	}
}
