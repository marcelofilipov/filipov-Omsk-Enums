package br.filipov.values.e;

import br.filipov.constants.Constants;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2014
 */
public enum EscolaridadeValues {
	
	ANALFABETO(1, "Analfabeto"), 
	ENSINO_FUNDAMENTAL(2, (Constants.ENSINO + " Fundamental")),
	ENSINO_MEDIO(3, (Constants.ENSINO + " Médio")),
    SUPERIOR_INCOMPLETO(4, (Constants.SUPERIOR + " Incompleto")),
    SUPERIOR(5, Constants.SUPERIOR),
    POS_GRADUADO(6, "Pós Graduado"),
    MESTRADO(7, "Mestrado"),
    DOUTORADO(8, "Doutorado"),
    SUPERIOR_EM_ANDAMENTO(9, (Constants.SUPERIOR + " em Andamento"));

	private Integer codigo;
	private String descricao;
	
	private EscolaridadeValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (EscolaridadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (EscolaridadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (EscolaridadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (EscolaridadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static EscolaridadeValues parse(int id){
		EscolaridadeValues retorno = null;
		for (EscolaridadeValues v: values()){
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
