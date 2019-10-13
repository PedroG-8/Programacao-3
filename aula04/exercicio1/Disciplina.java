package aula04.exercicio1;
import java.util.*;

public class Disciplina {

	private String nomeDisciplina;
	private String areaCientifica;
	private int ECTS;
	private Professor responsavel;
	private List <Estudante> alunos;
	
	public Disciplina(String nome, String area, int ECTS, Professor resp) {
		super();
		nomeDisciplina = nome;
		areaCientifica = area;
		this.ECTS = ECTS;
		responsavel = resp;
		this.alunos = new ArrayList<>();
	}

	public boolean addAluno(Estudante est) {
		if(alunos.contains(est)) { 
			return false;
		}
		else {
			return alunos.add(est);
		}
	}
	
	public Estudante[] getAlunos() {
		return alunos.toArray(new Estudante[0]);
	}
	
	public boolean delAluno(int nMec) {
		for(Estudante estudante : getAlunos()) {
			if(estudante.nMec() == nMec) {
				return alunos.remove(estudante);
			}
		}
		return false;
	}
	
	public boolean alunoInscrito(int nMec) {
		for(Estudante estudante : getAlunos()) {
			if(estudante.nMec() == nMec) {
				return true;
			}
		}
			return false;
	}
	
	public int numAlunos() {
		return alunos.size();
	}
	
	@Override
	public String toString() {
		return "Nome da disciplina: " + nomeDisciplina + "\nÁrea Científica: " + areaCientifica +
				"\nECTS: " + ECTS + "\nProfessor Responsável: " + responsavel + "\nNúmero de alunos inscritos: " + 
				numAlunos();
	}
	
	public Estudante[] getAlunos(String tipo) {
		List<Estudante> tmpAlunos = new ArrayList<>();
		for(Estudante estudante : getAlunos()) {
			if(estudante.getClass().toString().contains(tipo)) {
				tmpAlunos.add(estudante);
			}
		}
		return tmpAlunos.toArray(new Estudante[0]);
	}
}
