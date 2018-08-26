package br.filipov.values.s;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum SituacaoValues {
	
	CALCULO_EFETUADO(1, "Cálculo da curva efetuado"),
	COTACOES_CARREGADAS(2, "Cotações carregadas"),
	ERRO_CALCULO(3, "Erro no cálculo da curva"),
	SEM_CARGA_INDICADORES(4, "Sem carga de indicadores");
	
	private Integer codigo;
	private String descricao;
	
	private SituacaoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (SituacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (SituacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (SituacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (SituacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static SituacaoValues parse(int id){
		SituacaoValues retorno = null;
		for (SituacaoValues v: values()){
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
