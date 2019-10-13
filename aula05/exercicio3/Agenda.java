package aula05.exercicio3;
import java.util.*;
import java.io.*;

public class Agenda {

	private List<Pessoa> agenda = new ArrayList<>(); 
	
	public void carregarFicheiro(String filename) throws IOException{
		Scanner ler = new Scanner(new File(filename));
		String format = ler.nextLine();
		ler.close();
		FormatoDaAgenda agendaFormat = null;
		if(format.equals("Nokia")) {
			agendaFormat = new Nokia();
		}else if(format.equals("vCard")){
			agendaFormat = new vCard();
		}else if(format.equals("CSV")){
			agendaFormat = new CSV();
		}
		addContacts(agendaFormat.lerFicheiro(filename));
	}
	
	public void salvarFicheiro(String filename, FormatoDaAgenda format) throws IOException{
		format.escreverParaFicheiro(filename, agendaToArray());
	}
	
	public void addContacts(Pessoa[] pessoas) {
		for(Pessoa p : pessoas) {
			adicionarContacto(p);
		}
	}
	
	public void adicionarContacto(Pessoa pessoa) {
		agenda.add(pessoa);
	}
	
	public void removerContacto(Pessoa pessoa) throws Exception{
		if(!agenda.contains(pessoa)) throw new Exception("Pessoa não existe");
		agenda.remove(pessoa);
	}
	
	private Pessoa[] agendaToArray() {
		return agenda.toArray(new Pessoa[0]);
	}
	
	public int numContactos() {
		return agenda.size();
	}
	
	@Override
	public String toString() {
		return agenda.toString();
	}
	
}