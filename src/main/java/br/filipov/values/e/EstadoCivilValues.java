package br.filipov.values.e;

import br.filipov.constants.Constants;

/**
 * @author Marcelo Aparecido Filipov
 * @since 2014
 */
public enum EstadoCivilValues {
	
	SOLTEIRO(1, "Solteiro"),
    CASADO_COMUNHAO_UNIVERSAL(2, Constants.CASADO + " - Comunhão Universal"),
    CASADO_COMUNHAO_PARCIAL(3, Constants.CASADO + " - Comunhão Parcial"),
    CASADO_SEPARACAO_DE_BENS(4, Constants.CASADO + " - Separação de Bens"),
    VIUVO(5, "Viúvo"),
    SEPARADO_JUDICIALMENTE(6, "Separado Judicialmente"),
    DIVORCIADO(7, "Divorciado"),
    CASADO_REGIME_DOTAL(8, Constants.CASADO + " - Regime Dotal"),
    CASADO_REGIME_MISTO(9, Constants.CASADO + " - Regime Misto ou Especial"),
    CASADO_PART_FINAL_AQUESTOS(11, Constants.CASADO + " - Part. Final Aquestos");
	
	private Integer codigo;
	private String descricao;
	
	private EstadoCivilValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static String getDescricaoById(byte id) {
		String descricao = null;
		for (EstadoCivilValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(short id) {
		String descricao = null;
		for (EstadoCivilValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}

	public static String getDescricaoById(int id) {
		String descricao = null;
		for (EstadoCivilValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static String getDescricaoById(long id) {
		String descricao = null;
		for (EstadoCivilValues v : values()) {
			if (v.getCodigo() == id) {
				descricao = v.getDescricao();
				break;
			}
		}
		return descricao;
	}
	
	public static EstadoCivilValues parse(int id){
		EstadoCivilValues retorno = null;
		for (EstadoCivilValues v: values()){
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
