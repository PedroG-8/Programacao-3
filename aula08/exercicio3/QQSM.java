package aula08.exercicio3;
import java.awt.Container;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class QQSM {

	ArrayList <String> easy = new ArrayList<String>();
	ArrayList <String> medium = new ArrayList<String>();
	ArrayList <String> hard = new ArrayList<String>();
	Prize current = Prize.twFive;
	JToggleButton correct;
	
	QQSM() throws FileNotFoundException {
		File file = new File("C:\\Users\\Pedro G\\Desktop\\aula8\\QQSM\\QQSM\\questions.txt");
		Scanner readf = new Scanner(file);
		
		while(readf.hasNextLine()){
			String line = readf.nextLine();
			if(line.split("&&")[6].equals("0"))
				easy.add(line);
			else if(line.split("&&")[6].equals("1"))
				medium.add(line);
			else if(line.split("&&")[6].equals("2"))
				hard.add(line);
			else{
				System.err.println("Erro ao ler perguntas.");
				System.exit(1);
			}
			
		}
		
		readf.close();
	}
	
	public void getQuestion(JTextArea money, JLabel image, JTextArea question, JRadioButton p1, JRadioButton p2, JRadioButton p3, JRadioButton p4) {
		String q;
		int rand;
		
		if(chooseDif() == 0) {
			rand = getRandN(easy.size());
			q = easy.get(rand);
		}
		else if(chooseDif() == 1) {
			rand = getRandN(medium.size());
			q = medium.get(rand);
		}
		else {
			rand = getRandN(hard.size());
			q = hard.get(rand);
		}
		
		money.setText(String.valueOf(getMoney())+"€");
		image.setIcon(new ImageIcon("C:\\Users\\Pedro G\\Desktop\\aula8\\QQSM\\QQSM\\imgs\\img0.png"+q.split("&&")[0]));
		question.setText(q.split("&&")[1]);
		
		int[] arr = randArray(4);
		p1.setText(q.split("&&")[arr[0]+2]);
		p2.setText(q.split("&&")[arr[1]+2]);
		p3.setText(q.split("&&")[arr[2]+2]);
		p4.setText(q.split("&&")[arr[3]+2]);
		int j = 0;
		for(int i = 0; i < 4; i++) {
			if(arr[i] == 0) {
				j = i;
			}
		}
		
		switch(j) {
			case 0:
				correct = p1;
				break;
			case 1:
				correct = p2;
				break;
			case 2:
				correct = p3;
				break;
			case 3:
				correct = p4;
				break;
		}
		
		if(chooseDif() == 0) {
			easy.remove(rand);
		}
		else if(chooseDif() == 1) {
			medium.remove(rand);
		}
		else {
			hard.remove(rand);
		}
	}
	
	public void play(Container contentPane, JTextArea money, JLabel image, JTextArea question, JToggleButton p1, JToggleButton p2, JToggleButton p3, JToggleButton p4) {
		
		JToggleButton selected = null;
		
		if(p1.isSelected())
			selected = p1;
		else if(p2.isSelected())
			selected = p2;
		else if(p3.isSelected())
			selected = p3;
		else if(p4.isSelected())
			selected = p4;
		
		if(selected == null || selected != correct || current.getNum() == 250000) {
			JOptionPane.showMessageDialog(contentPane, "Ganhou " + String.valueOf(getMoney()) + "€!");
			System.exit(0);
		}
		
		current = Prize.nextPrize(current);
	}
	
	public int getMoney() {
		return current.getNum();
	}

	public void fiftyFifty(JButton c, JToggleButton p1, JToggleButton p2, JToggleButton p3, JToggleButton p4) {
		int except;
		if(correct == p1)
			except = 0;
		else if(correct == p2)
			except = 1;
		else if(correct == p3)
			except = 2;
		else
			except = 3;
		
		int[] rand = randArray(4);
		
		int j = 0;
		for(int i = 0; i < 3; i++) {
			if(rand[i] == 0 && except != 0) {
				p1.setEnabled(false);
				j++;
			}
			else if(rand[i] == 1 && except != 1) {
				p2.setEnabled(false);
				j++;
			}
			else if(rand[i] == 2 && except != 2) {
				p3.setEnabled(false);
				j++;
			}
			else if(rand[i] == 3 && except != 3) {
				p4.setEnabled(false);
				j++;
			}
			
			if(j == 2) break;
		}
		c.setEnabled(false);
	}

	public void publicHelp(Container c, JButton publico, JToggleButton p1, JToggleButton p2, JToggleButton p3, JToggleButton p4) {

		int dif = chooseDif();
		int max = (int)(Math.random() * 100);
		int per = 0;
		for(int i = 0; i < (3 - dif) * 2; i++){
			per = (int)(Math.random() * 100);
			if(per > max)
				max = per;
		}
		
		JToggleButton wrong1 = new JToggleButton();
		JToggleButton wrong2 = new JToggleButton();
		JToggleButton wrong3 = new JToggleButton();
		
		if(correct == p1) {
			wrong2 = p2;
			wrong3 = p3;
			wrong1 = p4;
		}
		if(correct == p2) {
			wrong2 = p4;
			wrong3 = p3;
			wrong1 = p1;
		}
		if(correct == p3) {
			wrong2 = p2;
			wrong3 = p1;
			wrong1 = p4;
		}
		if(correct == p4) {
			wrong2 = p2;
			wrong3 = p3;
			wrong1 = p1;
		}
		
		int pr2 = (100 - max) / 6;
		int pr3 = 2 * (100 - max) / 6;
		int pr4 = 3 * (100 - max) / 6;
		
		String s = "";
		
		int rand[] = randArray(4);
		
		for(int i = 0; i < 4; i++) {
			if(rand[i] == 0) {
				s += correct.getText() + ": " + max + "%\n";
			}
			else if(rand[i] ==1 ) {
				s += wrong2.getText() + ": " + (pr2 + 1) + "%\n";
			}
			else if(rand[i] == 2) {
				s += wrong3.getText() + ": " + pr3 + "%\n";
			}
			else {
				s += wrong1.getText() + ": " + pr4 + "%\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, s, "Ajuda do Público", JOptionPane.QUESTION_MESSAGE);
				
		publico.setEnabled(false);
		
	}
	
	public void phone(Container content, JButton phone, JToggleButton p1, JToggleButton p2, JToggleButton p3, JToggleButton p4){
		
		int dif = chooseDif();
		int button1 = -1;
		JToggleButton wrong = null;
		
		if(correct == p1)
			button1 = 0;
		else if(correct == p2)
			button1 = 1;
		else if(correct == p3)
			button1 = 2;
		else
			button1 = 3;
		
		int randButton = getRandN(4);
		
		while(randButton == button1)
			randButton = getRandN(4);
		
		switch(randButton){
			case 0:
				wrong = p1;
				break;
			case 1:
				wrong = p2;
				break;
			case 2:
				wrong = p3;
				break;
			case 3:
				wrong = p4;
				break;
		}
		
		int wrongPerc;
		int rightPerc;
		wrongPerc = (int)(((Math.random()) / (3 - dif)) * 100);
		rightPerc = 100 - wrongPerc;
		
		if(rightPerc > wrongPerc)
			JOptionPane.showMessageDialog(null, "Duvida entre:\n" + correct.getText() + ": " + rightPerc + "%\n" + wrong.getText() + ": " + wrongPerc + "%", 
				"Ajuda do Telefone", JOptionPane.QUESTION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "Duvida entre:\n" + wrong.getText() + ": " + wrongPerc + "%\n" + correct.getText() + ": " + rightPerc + "%", 
					"Ajuda do Telefone", JOptionPane.QUESTION_MESSAGE);
		phone.setEnabled(false);
	}
	
	private int chooseDif() {
		if (current.getNum() <= 500)
			return 0;
		else if (current.getNum() <= 10000)
			return 1;
		else
			return 2;
	}
	
	private int getRandN(int n) {
		return (int)(Math.random() * n);
	}

	private int[] randArray(int n) {
		int[] arr = new int[n];
		int i = 0;
		while(i != n) {
			int rand = getRandN(n);
			boolean exists = false;
			for(int j = i - 1; j >= 0; j--) {
				if(rand==arr[j]) exists = true;
			}
			if(!exists) {
				arr[i] = rand;
				i++;
			}	
		}
		return arr;
	}	
}