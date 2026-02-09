package Bista;
import java.util.Observer;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Eredua.SemaforoKudeatzailea;

import javax.swing.JButton;

public class OinezkoSemaforoa extends JFrame implements Observer{

	private static final long serialVersionUID = 820323745068010478L;
	private JPanel contentPane;
	private JPanel pnlSemaforo;
	private SemaforoArgia argiBerde = null;
	private SemaforoArgia argiGorri = null;
	private JLabel lblKont;
	private JButton btnBideaEskatu;


	public OinezkoSemaforoa() {
		SemaforoKudeatzailea.getSK().addObserver(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	}

	private void initialize() {
		setSize(150, 555);
		this.setContentPane(getContentPane());
		setTitle("Oinezkoak");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public JPanel getContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(getPnlSemaforo(), BorderLayout.CENTER);
		}
		return contentPane;
	}
	//SEMAFORO: PANELA
	private JPanel getPnlSemaforo() {
		if (pnlSemaforo == null) {
			pnlSemaforo = new JPanel();
			pnlSemaforo.setLayout(new GridLayout(4, 1, 0, 10));
			pnlSemaforo.add(getLblCont());
			pnlSemaforo.add(getArgiGorri(),null);
			pnlSemaforo.add(getArgiBerde(),null);
			pnlSemaforo.add(getBtnBideaEskatu());
		}
		return pnlSemaforo;
	}
	
	//0- SEMAFORO: argi gorria
	private SemaforoArgia getArgiGorri() {
		if (argiGorri == null) {
			argiGorri = new SemaforoArgia("gorri", true);
		}
		return argiGorri;
	}
	
	//1- SEMAFORO: argi berdea
	private SemaforoArgia getArgiBerde() {
		if (argiBerde == null) {
			argiBerde = new SemaforoArgia("berde", false);
		}
		return argiBerde;
	}
	
	//2- SEMAFORO: kontadorea
	private JLabel getLblCont() {
		if (lblKont == null) {
			lblKont = new JLabel("15");
			lblKont.setOpaque(true);
			lblKont.setBackground(Color.BLACK);
			lblKont.setFont(new Font("Lucida Grande", Font.BOLD, 72));
			lblKont.setHorizontalAlignment(SwingConstants.CENTER);
			lblKont.setForeground(Color.RED);
		}
		return lblKont;
	}

	private JButton getBtnBideaEskatu() {
		if (btnBideaEskatu == null) {
			btnBideaEskatu = new JButton("Bidea eskatu");
			btnBideaEskatu.addActionListener(getControler());
			
		}
		return btnBideaEskatu;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		lblKont.setText(String.valueOf(SemaforoKudeatzailea.getSK().getKontadore()));
		argiBerde.setAktibo(SemaforoKudeatzailea.getSK().berdeDago());
		argiGorri.setAktibo(!SemaforoKudeatzailea.getSK().berdeDago());
	}
	
	/**
	 * UPDATE 
	 * -------
	 * Semaforo kudeatzailearen bitartez:
	 *    - lblKont: zenbakien kolorea aldatu (setForeground)
	 *    - lblKont: kontadorearen balioa eguneratu
	 *    - argiGorri eta argiBerde kudeatu
	 */
	
	/**
	 * KONTROLADOREA
	 * --------------
	 * Semaforo kudeatzailearen bitartez
	 * 	- argiBerde aktibatu
	 * 
	 */	
	private class controler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(getBtnBideaEskatu())) {
				SemaforoKudeatzailea.getSK().berdeJarri();
			}
			
		}
		
	}
	private controler controler=null;
	
	private controler getControler() {
		if (controler== null) {
			controler = new controler();
		}
		return controler;
	}
	
}

