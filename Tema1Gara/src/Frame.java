import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import java.awt.event.ActionEvent;

public class Frame {

	JFrame frmTrainStation;
	private JTextField textField;
	private JTextField textField_1;
	public Gara g;

	


	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTrainStation = new JFrame();
		frmTrainStation.setTitle("Train Station");
		frmTrainStation.setBounds(100, 100, 342, 252);
		frmTrainStation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTrainStation.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(82, 13, 116, 22);
		frmTrainStation.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNumeTren = new JLabel("Nume Tren");
		lblNumeTren.setBounds(12, 16, 73, 16);
		frmTrainStation.getContentPane().add(lblNumeTren);
		
		JButton btnAfisare = new JButton("Afisare");
		btnAfisare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String afis = "Trenul nu a fost gasit!";
				String find = textField.getText();
				boolean found = false;
				
				for (Tren t: g.trenuri) {
					if (t.getName().equals(find)) {
						if (found == false)	afis = t.print();
						else afis = "Au fost gasite mai multe trenuri cu aceasta nume(eroare)";
					}
				}
				textField_1.setText(afis);
			}
		});
		btnAfisare.setBounds(210, 12, 97, 25);
		frmTrainStation.getContentPane().add(btnAfisare);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 48, 285, 144);
		frmTrainStation.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}
}
