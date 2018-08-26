package br.filipov.values.t;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum TipoAtuacaoGrupoUsuarioValues {

	OPERACAO(1, "Operação"),
	AUTORIZADORES(2, "Autorizadores"),
	DISTRIBUICAO(3, "Distribuição"),
	NOTIFICACAO(4, "Notificação");
	
	private Integer codigo;
	private String descricao;
	
	private TipoAtuacaoGrupoUsuarioValues(Integer codigo, String descricao){
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (TipoAtuacaoGrupoUsuarioValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (TipoAtuacaoGrupoUsuarioValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (TipoAtuacaoGrupoUsuarioValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(long id) {
		String descricao = null;
		for (TipoAtuacaoGrupoUsuarioValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static TipoAtuacaoGrupoUsuarioValues parse(int id){
		TipoAtuacaoGrupoUsuarioValues retorno = null;
		for (TipoAtuacaoGrupoUsuarioValues v: values()){
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
