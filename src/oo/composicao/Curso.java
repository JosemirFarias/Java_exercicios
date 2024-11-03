package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> aluno = new ArrayList<>();
	
	Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionaAluno(Aluno aluno) {
		this.aluno.add(aluno);
		aluno.curso.add(this);
	}
}
