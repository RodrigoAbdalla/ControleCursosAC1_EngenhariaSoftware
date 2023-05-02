package com.ac1.ControleCursos.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private int id;
	private String nome;
    private List<Cursos> cursos;
    private String categoria;
	
	public Usuario(String nome) {
		this(0, nome);
        this.cursos = new ArrayList<Cursos>();
	}

	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
            Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

    public void addCursos(Cursos curso){
        this.cursos.add(curso);
        int quantidadeCursos = this.cursos.size();

        // Quando alcançar 12 cursos e categoria estiver em Basic, altera para Premium
        this.categoria = quantidadeCursos > 11 ? "Premium" : "Basic";
    }

    public void addCursos(List<Cursos> cursos){
        // Adiciona curso por curso ao usuário
        for (Cursos curso : cursos) {
            this.cursos.add(curso);
            
            int quantidadeCursos = this.cursos.size();

            // Quando alcançar 12 cursos e categoria estiver em Basic, altera para Premium
            this.categoria = quantidadeCursos > 11 ? "Premium" : "Basic";
        }
    }

    public String getCategoria() {
		return categoria;
	}

    public List<Cursos> getCursos() {
		return this.cursos;
	}
}


