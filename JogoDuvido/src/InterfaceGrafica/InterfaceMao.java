package InterfaceGrafica;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;

public class InterfaceMao extends JPanel{
	public InterfaceMao() {
		setBackground(new Color(25, 25, 112));
		setLayout(null);
		
		JButton btnDeclarar = new JButton("DECLARAR");
		btnDeclarar.setBounds(605, 12, 102, 76);
		add(btnDeclarar);
		
		JList list = new JList();
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setBounds(12, 12, 581, 76);
		add(list);
	}
}
