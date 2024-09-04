import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListaAtividades implements Iterable<Atividade> {
	private List<Atividade> atividades = new ArrayList<>();

	public ListaAtividades(Atividade... atividades) {
		this.atividades = Arrays.asList(atividades);
	}

	@Override
	public Iterator<Atividade> iterator() {
		return atividades.iterator();
	}
}
