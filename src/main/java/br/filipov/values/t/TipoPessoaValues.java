package br.filipov.values.t;

import br.filipov.constants.Constants;

/**
 * @author Marcelo A. Filipov
 * @since 2014
 */
public enum TipoPessoaValues {

	FISICA(1, "PF", (Constants.PESSOA + " Física")),
	JURIDICA(2, "PJ", (Constants.PESSOA + " Jurídica"));

	private Integer codigo;
	private String sigla;
	private String descricao;

	private TipoPessoaValues(int id, String sigla, String descricao) {
		this.codigo = id;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getSiglaById(byte id) {
		String sigla = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}	
		}
		return sigla;
	}

	public static String getSiglaById(short id) {
		String sigla = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}

	public static String getSiglaById(int id) {
		String sigla = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}
	
	public static String getSiglaById(long id) {
		String sigla = null;
		for (TipoPessoaValues v : values()) {
			if (v.getCodigo() == id) {
				sigla = v.getSigla();
				break;
			}
		}
		return sigla;
	}
	
	public static TipoPessoaValues parse(int id){
		TipoPessoaValues retorno = null;
		for (TipoPessoaValues v: values()){
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

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}

}
