package com.mycompany.projetoaulaclasse;
import java.util.*;

public class AtividadesExtraCurriculares {
	public String nomeAtividade;
	public Double cargaHoraria;
	public String descricao;
	public String categoria;
	public String nomeAluno;
	public int ra;
	public boolean horaExtraCurricular;
	public Date data;
	public String instituicaoCurso;
	public String turno;
	
public void adicionarAtivade(String nomeAtividade, Double cargaHoraria, String descricao,
		String categoria, String nomeAluno, int ra, boolean horaExtraCurricular, Date data, 
		String instituicaoCurso, String turno){
	
	this.nomeAtividade = nomeAtividade;
	this.cargaHoraria = cargaHoraria;
	this.descricao = descricao;
	this.categoria = categoria;
	this.nomeAluno = nomeAluno;
	this.ra = ra;
	this.horaExtraCurricular = horaExtraCurricular;
	this.data = data;
	this.instituicaoCurso = instituicaoCurso;
	this.turno = turno;
}
public void excluirAtividade(String nomeAtividade, Double cargaHoraria, String descricao,
		String categoria, String nomeAluno, int ra, boolean horaExtraCurricular, Date data, 
		String instituicaoCurso, String turno){
	
	this.nomeAtividade = null;
	this.cargaHoraria = null;
	this.descricao = null;
	this.categoria = null;
	this.nomeAluno = null;
	this.ra = (Integer) null;
	this.horaExtraCurricular = (Boolean) null;
	this.data = null;
	this.instituicaoCurso = null;
	this.turno = null;
}

public void editarAtividade(String nomeAtividade, Double cargaHoraria, String descricao,
		String categoria, String nomeAluno, int ra, boolean horaExtraCurricular, Date data, 
		String instituicaoCurso, String turno){
	
	this.nomeAtividade = nomeAtividade;
	this.cargaHoraria = cargaHoraria;
	this.descricao = descricao;
	this.categoria = categoria;
	this.nomeAluno = nomeAluno;
	this.ra = ra;
	this.horaExtraCurricular = horaExtraCurricular;
	this.data = data;
	this.instituicaoCurso = instituicaoCurso;
	this.turno = turno;
}
}
