import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import compiler.util.TipoDeDado;

public class ParametroFunProc {
	private Map<TipoDeDado, List<String>> parametros = new HashMap<>();
	private List<TipoDeDado> ordemParametros = new LinkedList<>();
	
	public ParametroFunProc() {
		parametros.put(TipoDeDado.INT, new ArrayList<>());
		parametros.put(TipoDeDado.BOOL, new ArrayList<>());
		parametros.put(TipoDeDado.STRING, new ArrayList<>());
	}
	
	public Map<TipoDeDado, List<String>> getParametros() {
		return parametros;
	}
	public void setParametros(Map<TipoDeDado, List<String>> parametros) {
		this.parametros = parametros;
	}
	public List<TipoDeDado> getOrdemParametros() {
		return ordemParametros;
	}
	public void setOrdemParametros(List<TipoDeDado> ordemParametros) {
		this.ordemParametros = ordemParametros;
	}
	
	
	
}
