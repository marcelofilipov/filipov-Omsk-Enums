package br.filipov.values.o;

import br.filipov.utils.Constants;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum OrigemRecursoValues {

	LIVRE(1, (Constants.RECURSO + " Livre")),
	OBRIGATORIO(2, (Constants.RECURSO + " Obrigatório"));

	private Integer codigo;
	private String descricao;

	private OrigemRecursoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (OrigemRecursoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (OrigemRecursoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (OrigemRecursoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (OrigemRecursoValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static OrigemRecursoValues parse(int id){
		OrigemRecursoValues retorno = null;
		for (OrigemRecursoValues v: values()){
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