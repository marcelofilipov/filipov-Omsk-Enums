package br.filipov.values.i;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum IndicadorAprovacaoValues {

	AGUARDANDO_APROVACAO(1, "Aguardando Aprovação"),
	PENDENTE(2, "Pendente"),
	APROVADO(3, "Aprovado"),
	REPROVADO(4, "Reprovado"),
	REJEITADO(5, "Rejeitado"),
	CANCELADO(6, "Cancelado");
	
	private Integer codigo;
	private String descricao;

	private IndicadorAprovacaoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (IndicadorAprovacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (IndicadorAprovacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (IndicadorAprovacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (IndicadorAprovacaoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static IndicadorAprovacaoValues parse(int id){
		IndicadorAprovacaoValues retorno = null;
		for (IndicadorAprovacaoValues v: values()){
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