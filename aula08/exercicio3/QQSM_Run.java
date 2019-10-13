package aula08.exercicio3;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class QQSM_Run extends JFrame {
	
		private static final long serialVersionUID = 1L;

		public QQSM_Run() throws FileNotFoundException{
			
			super("Quem Quer Ser Milionário");
			
			QQSM game = new QQSM();
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(655,455);
			JPanel content = new JPanel();
			content.setLayout(null);
			
			JTextArea money = new JTextArea();
			money.setBackground(content.getBackground());
			money.setFont(new Font("Arial", Font.PLAIN, 15));
			money.setBounds(580, 10, 100, 50);
			money.setEditable(false);
			
			JLabel image = new JLabel();
			image.setBounds(10, 5, 500, 390);
			
			JTextArea question = new JTextArea();
			question.setBackground(content.getBackground());
			question.setBounds(400, 90, 200, 200);
			question.setFont(new Font("Arial", Font.PLAIN, 24));
			question.setEditable(false);
			question.setWrapStyleWord(true);
			question.setLineWrap(true);
			
			JButton publico = new JButton("Ajuda público");
			publico.setBounds(10, 295, 110, 27);
			
			
			JButton phone = new JButton("Telefone...");
			phone.setBounds(125, 295, 100, 27);
			
			
			JButton fifty = new JButton("50 - 50");
			fifty.setBounds(230, 295, 100, 27);
			
			
			JButton quit = new JButton("Desistir");
			quit.setBounds(440, 370, 80, 27);
			quit.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(getContentPane(), "Ganhou " + String.valueOf(game.getMoney()) + "€!");
					System.exit(0);
				}			
			});
			
			ButtonGroup questions = new ButtonGroup();
			
			JRadioButton p1 = new JRadioButton();
			JRadioButton p2 = new JRadioButton();
			JRadioButton p3 = new JRadioButton();
			JRadioButton p4 = new JRadioButton();

			questions.add(p1);
			questions.add(p2);
			questions.add(p3);
			questions.add(p4);
			
			JButton confirmar = new JButton("Confirmar");
			confirmar.setBounds(525, 370, 93, 27);
			confirmar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					game.play(getContentPane(), money, image, question, p1, p2, p3, p4);
					questions.clearSelection();
					p1.setEnabled(true);
					p2.setEnabled(true);
					p3.setEnabled(true);
					p4.setEnabled(true);
					game.getQuestion(money, image, question, p1, p2, p3, p4);
				}			
			});
			
			fifty.addActionListener(e -> game.fiftyFifty(fifty, p1, p2, p3, p4));
			
			publico.addActionListener(e ->game.publicHelp(getContentPane(), publico, p1, p2, p3, p4));
			
			phone.addActionListener(e ->game.phone(getContentPane(), phone, p1, p2, p3, p4));
			
			p1.setBounds(25, 325, 200, 30);
			p2.setBounds(25, 365, 200, 30);
			p3.setBounds(230, 325, 200, 30);
			p4.setBounds(230, 365, 200, 30);
			
			content.add(money);
			content.add(image);
			content.add(question);
			content.add(publico);
			content.add(phone);
			content.add(fifty);
			content.add(p1);
			content.add(p2);
			content.add(p3);
			content.add(p4);
			content.add(quit);
			content.add(confirmar);
			game.getQuestion(money, image, question, p1, p2, p3, p4);
			add(content);
			setVisible(true);
		}
		
		public static void main(String[] args) throws FileNotFoundException {
			
			new QQSM_Run();
			
		}


	}