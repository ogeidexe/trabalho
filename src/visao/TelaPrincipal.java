package visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame{
	JPanel painel1;
	JButton botaoGasto;
	JButton botaoGanho;
	public TelaPrincipal(String titulo) {
		setVisible(true);
		setSize(400, 200);
		setTitle(titulo);
		this.setLocationRelativeTo(null);
		
		painel1 = new JPanel(new GridLayout(2, 1));
		botaoGanho = new JButton("Recebi Algo");
		botaoGasto = new JButton("Gastei com Algo");
		
		painel1.add(botaoGanho);
		painel1.add(botaoGasto);
		botaoGanho.addActionListener(new acaoGanho());
		botaoGasto.addActionListener(new acaoGasto());
		
		this.add(painel1);
	}
	public class acaoGasto implements ActionListener {


		public void actionPerformed(ActionEvent e) {
			TelaGastos tgastos = new TelaGastos();
		}
		
		
	}
	public class acaoGanho implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			TelaGanhos tganhos =  new TelaGanhos();
		}
		
	}

}


