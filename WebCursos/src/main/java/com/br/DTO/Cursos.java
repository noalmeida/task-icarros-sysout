package com.br.DTO;

public class Cursos {
	
	public int idcurso;
	public String nomecurso;
	public String datacurso;
	public String horacurso;
	public String duracaocurso;
	public String resumocurso;
	
	
	
	public Cursos(int idcurso, String nomecurso, String datacurso, String horacurso, String duracaocurso,
			String resumocurso) {
		super();
		this.idcurso = idcurso;
		this.nomecurso = nomecurso;
		this.datacurso = datacurso;
		this.horacurso = horacurso;
		this.duracaocurso = duracaocurso;
		this.resumocurso = resumocurso;
	}
	public Cursos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public String getDatacurso() {
		return datacurso;
	}
	public void setDatacurso(String datacurso) {
		this.datacurso = datacurso;
	}
	public String getDuracaocurso() {
		return duracaocurso;
	}
	public void setDuracaocurso(String duracaocurso) {
		this.duracaocurso = duracaocurso;
	}
	public String getResumocurso() {
		return resumocurso;
	}
	public void setResumocurso(String resumocurso) {
		this.resumocurso = resumocurso;
	}
	public String getHoracurso() {
		return horacurso;
	}
	public void setHoracurso(String horacurso) {
		this.horacurso = horacurso;
	}

}
