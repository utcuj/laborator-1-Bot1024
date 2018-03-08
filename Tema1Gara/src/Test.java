import java.awt.EventQueue;

public class Test {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					
					Gara g = new Gara();
					g.addTrain("IR1123", "Falticeni", 12, 21);
					g.addTrain("IR1231", "Bucursti", 07, 35);
					g.addTrain("IR2341", "Oradea", 18, 55);
					g.addTrain("R12877", "Gyergyotekeropatak", 01, 07);
					g.addTrain("R12361", "Botosani", 22, 42);
					g.printTrains();
					
					window.g = g;
					
					window.frmTrainStation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
