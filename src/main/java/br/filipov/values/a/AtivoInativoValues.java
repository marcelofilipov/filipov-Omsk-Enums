package br.filipov.values.a;

import java.util.Optional;
import java.util.stream.Stream;

public enum AtivoInativoValues {

	ATIVO(1, "Ativo"), INATIVO(0, "Inativo");

	private Integer codigo;
	private String descricao;

	private AtivoInativoValues(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public static Stream<AtivoInativoValues> stream() {
		return Stream.of(AtivoInativoValues.values());
	}

	public static Optional<String> getDescricaoById(byte id) {

		final String descricao = AtivoInativoValues.stream()
				.filter(a -> a.getCodigo() == id)
				.findFirst().get().getDescricao();
				
		return Optional.ofNullable(descricao);
	}

	public static Optional<String> getDescricaoById(short id) {

		final String descricao = AtivoInativoValues.stream()
				.filter(a -> a.getCodigo() == id)
				.findFirst().get().getDescricao();
					
		return Optional.ofNullable(descricao);
	}

	public static Optional<String> getDescricaoById(int id) {

		final String descricao = AtivoInativoValues.stream()
				.filter(a -> a.getCodigo() == id)
				.findFirst().get().getDescricao();

		return Optional.ofNullable(descricao);
	}

	public static Optional<String> getDescricaoById(long id) {

		final String descricao = AtivoInativoValues.stream()
				.filter(a -> a.getCodigo() == id)
				.findFirst().get().getDescricao();

		return Optional.ofNullable(descricao);
	}

	public static Optional<AtivoInativoValues> parse(int id) {
		
		final AtivoInativoValues retorno = AtivoInativoValues.stream()
				.filter(a -> a.getCodigo() == id)
				.findFirst().get();

		return Optional.ofNullable(retorno);
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
