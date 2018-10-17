package visao;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class TelaGanhos extends JDialog{
	public TelaGanhos() {
		setVisible(true);
		setModal(true);
		setSize(new Dimension(200, 400));
		this.setLocationRelativeTo(null);
	}
	
}

