package br.filipov.values.i;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum IndicadorEventoLogValues {

	INCLUSAO(1, "Inclusão"), 
	ALTERACAO(2, "Alteração"), 
	EXCLUSAO(3, "Exclusão"), 
	CONSULTA(4, "Consulta"),
	LISTA(5, "Lista"); 
	
	private Integer codigo;
	private String descricao;

	private IndicadorEventoLogValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (IndicadorEventoLogValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (IndicadorEventoLogValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (IndicadorEventoLogValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (IndicadorEventoLogValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static IndicadorEventoLogValues parse(int id){
		IndicadorEventoLogValues retorno = null;
		for (IndicadorEventoLogValues v: values()){
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
