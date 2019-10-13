package aula08.exercicio1;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Janela {

	private JButton[] b;
	
	public Janela() {
		
		JFrame frame = new JFrame("Jogo do Galo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3,3));
		
		actionHappened handler = new actionHappened();
		Font font = new Font("Arial", Font.BOLD, 100);
		b = new JButton[9];
		
		for(int i = 0; i <= 8; i++) {
			b[i] = new JButton();
			content.add(b[i]);
			b[i].addActionListener(handler);
			b[i].setFont(font);
		}
		frame.setContentPane(content);
		frame.setVisible(true);	
	}
	
	
	private class actionHappened implements ActionListener {
		String p1 = "X";
		String p2 = "O";
		String currentP;
		int n = 0, a = 0, numJogadas = 0;
		
		public void actionPerformed(ActionEvent e) {
			// O jogador que começa fica com o 'X' ou o 'O' á sorte
			if(currentP == null) {
				int rand = (int)(Math.random() * 2);
				currentP = "Erro";
				if(rand == 1) {
					currentP = "X";
				}
				else if(rand == 0){
					currentP = "O";
				}
			}
			for(int i = 0; i < b.length; i++) {
				if(e.getSource() == b[i]) {
					if(b[i].getText().isEmpty()) b[i].setText(currentP);	
					else a++;
				}
			}
			
			if(b[0].getText() == b[1].getText() && b[1].getText() == b[2].getText() && !b[0].getText().isEmpty()) {
				n++;
			}
			if(b[3].getText() == b[4].getText() && b[4].getText() == b[5].getText() && !b[3].getText().isEmpty()) {
				n++;
			}
			if(b[6].getText() == b[7].getText() && b[7].getText() == b[8].getText() && !b[6].getText().isEmpty()) {
				n++;
			}
			if(b[0].getText() == b[3].getText() && b[0].getText() == b[6].getText() && !b[0].getText().isEmpty()) {
				n++;
			}
			if(b[1].getText() == b[4].getText() && b[1].getText() == b[7].getText() && !b[1].getText().isEmpty()) {
				n++;
			}
			if(b[2].getText() == b[5].getText() && b[2].getText() == b[8].getText() && !b[2].getText().isEmpty()) {
				n++;
			}
			if(b[0].getText() == b[4].getText() && b[0].getText() == b[8].getText() && !b[0].getText().isEmpty()) {
				n++;
			}
			if(b[2].getText() == b[4].getText() && b[2].getText() == b[6].getText() && !b[2].getText().isEmpty()) {
				n++;
			}
			
			if(n == 1) {
				JOptionPane.showMessageDialog(null, "Resultado: Venceu jogador " + currentP, "Message", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			if(a != 1) {
				numJogadas++;
				if(currentP.equals(p1)) {
					currentP = p2;
				}
				else if(currentP.equals(p2)){
					currentP = p1;
				}	
			}
			if(numJogadas == 9) {
				JOptionPane.showMessageDialog(null, "Resultado: Empate", "Message", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}
			a = 0;
		}
	}
}
