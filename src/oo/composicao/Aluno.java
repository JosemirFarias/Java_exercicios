package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> curso = new ArrayList<>();
	
	Aluno(String nome) {
		this.nome = nome;
	}
	
	void adicionaCurso(Curso curso) {
		this.curso.add(curso);
		curso.aluno.add(this);
		
	}
	
	public String toString() {
		return nome; 
	}
	
}
