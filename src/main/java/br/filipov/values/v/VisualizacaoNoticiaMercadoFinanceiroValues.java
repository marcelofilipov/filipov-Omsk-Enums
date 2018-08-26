package br.filipov.values.v;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum VisualizacaoNoticiaMercadoFinanceiroValues {

	PAINEL(1, "Painel"), ALERTA(2, "Alerta");

	private Integer codigo;
	private String descricao;

	private VisualizacaoNoticiaMercadoFinanceiroValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (VisualizacaoNoticiaMercadoFinanceiroValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (VisualizacaoNoticiaMercadoFinanceiroValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (VisualizacaoNoticiaMercadoFinanceiroValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (VisualizacaoNoticiaMercadoFinanceiroValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static VisualizacaoNoticiaMercadoFinanceiroValues parse(int id){
		VisualizacaoNoticiaMercadoFinanceiroValues retorno = null;
		for (VisualizacaoNoticiaMercadoFinanceiroValues v: values()){
			if (v.getCodigo() == id) {
				retorno = v;
				break;
			}
		}
		return retorno;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
