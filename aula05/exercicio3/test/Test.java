package aula05.exercicio3.test;
import aula05.exercicio3.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws IOException{
		
		Agenda agenda = new Agenda();
		
		Data data1 = new Data(13,8,1998);
		Data data2 = new Data(16,1,1997);
		Data data3 = new Data(12,4,1999);
		Data data4 = new Data(9,6,2000);
		Data data5 = new Data(4,4,1998);
		Data data6 = new Data(24,12,1999);
		Data data7 = new Data(28,7,1996);
		Data data8 = new Data(15,11,1994);
		
		// Formato Nokia
		
		agenda.carregarFicheiro("File1.txt");
		agenda.adicionarContacto(new Pessoa("Pedro",data1,967283910));
		agenda.adicionarContacto(new Pessoa("Diogo",data2,912426724));
		agenda.salvarFicheiro("OutputFile1.txt", new Nokia());
		System.out.println("A agenda 1 tem "+agenda.numContactos()+" contactos:");
		System.out.println(agenda);
		System.out.println();
		
		// Formato vCard
		
		agenda = new Agenda();agenda.carregarFicheiro("File2.txt");
		agenda.addContacts(new Pessoa[] {
				new Pessoa("Zé",data3,969238429),
				new Pessoa("Ana",data4,912345678),
				new Pessoa("Simão",data5,929387690),
				new Pessoa("Maria",data6,910974531),
		});
		agenda.salvarFicheiro("OutputFile2.txt",new vCard());
		System.out.println("A agenda 2 tem "+agenda.numContactos()+" contactos:");
		System.out.println(agenda);
		System.out.println();
		
		// Formato CSV
		
		agenda = new Agenda();
		agenda.carregarFicheiro("File3.txt");
		agenda.adicionarContacto(new Pessoa("Joana",data7,918274623));
		agenda.adicionarContacto(new Pessoa("Manuel",data8,935472849));
		agenda.adicionarContacto(new Pessoa("Raquel",new Data(),917328742));
		agenda.salvarFicheiro("OutputFile3.txt", new CSV());
		System.out.println("A agenda 3 tem "+agenda.numContactos()+" contactos:");
		System.out.println(agenda);
		System.out.println();
		
	}

}