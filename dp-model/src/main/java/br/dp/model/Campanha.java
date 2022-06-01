package br.dp.model;

import java.security.Timestamp;

public class Campanha extends BasePojo {

	private String titulo;
	private String descricao;
	private String requisitos;
	private Timestamp dataInicio;
	private Timestamp dataFim;
	private Long instituicaoId;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(final String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(final String requisitos) {
		this.requisitos = requisitos;
	}

	public Timestamp getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(final Timestamp dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Timestamp getDataFim() {
		return dataFim;
	}

	public void setDataFim(final Timestamp dataFim) {
		this.dataFim = dataFim;
	}

	public Long getInstituicaoId() {
		return instituicaoId;
	}

	public void setInstituicaoId(final Long instituicaoId) {
		this.instituicaoId = instituicaoId;
	}

	@Override
	public String toString() {
		return "Campanha [titulo=" + titulo + ", descricao=" + descricao + ", requisitos=" + requisitos
				+ ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", instituicaoId=" + instituicaoId + "]";
	}

	public Campanha(final String titulo, final String descricao, final String requisitos, final Timestamp dataInicio,
			final Timestamp dataFim, final Long instituicaoId) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.requisitos = requisitos;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.instituicaoId = instituicaoId;
	}

}
