package br.filipov.values.n;

import br.filipov.utils.Constants;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2014
 */
public enum NacionalidadeValues {

	BRASILEIRO(1, "Brasileiro"),
	ESTRANGEIRO_COM_VISTO_PERMANENTE(2, (Constants.ESTRANGEIRO_COM + " Visto Permanente")), 
	ESTRANGEIRO_COM_VISTO_TEMPORARIO(3, (Constants.ESTRANGEIRO_COM + " Visto Temporário")), 
	NATURALIZADO(4, "Naturalizado"), 
	PORTUGUES_COM_RESIDENCIA_PERMANENTE(5, "Português com Residência Permanente"), 
	ESTRANGEIRO_DOMICILIO_EXTERIOR(6, (Constants.ESTRANGEIRO_COM + " Domicílio no Exterior"));

	private Integer codigo;
	private String descricao;

	private NacionalidadeValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (NacionalidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}	
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (NacionalidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (NacionalidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (NacionalidadeValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static NacionalidadeValues parse(int id){
		NacionalidadeValues retorno = null;
		for (NacionalidadeValues v: values()){
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
