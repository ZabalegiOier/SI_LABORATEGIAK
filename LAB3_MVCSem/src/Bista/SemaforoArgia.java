package Bista;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

public class SemaforoArgia extends JPanel {

	private static final long serialVersionUID = 3049040957332920611L;
	private String kolore;
	private boolean aktibo;
	private JLabel lblSemaforoArgia;

	/**SEMAFORO ARGIKO ERAIKITZAILEA*/
	public SemaforoArgia(String pKolore, boolean pAktibo) {
		super();
		initialize();
		kolore = pKolore.toLowerCase();
		setAktibo(pAktibo);
	}

	//arriaga
	/**PANELA HASIERATU*/
	private void initialize() {
		this.setSize(getPreferredSize());
		this.setLayout(new GridBagLayout());
		this.add(getLblSemaforoArgia());
	}

	
	private JLabel getLblSemaforoArgia() {
		if (lblSemaforoArgia == null) {
			lblSemaforoArgia = new JLabel("");
		}
		return lblSemaforoArgia;
	}

	/** SEMAFORO ARGIA AUKERATU (true- piztuta, false - itzalita)*/
	public void setAktibo(boolean pAktibo) {
		aktibo = pAktibo;
		
		String irudiIzena;
		
		if (aktibo) {
			irudiIzena = kolore+".png";
		}else {
			irudiIzena = "itzalita.png";
		}
		
		getLblSemaforoArgia().setIcon(new ImageIcon(this.getClass().getResource(irudiIzena)));
		
	}
}

