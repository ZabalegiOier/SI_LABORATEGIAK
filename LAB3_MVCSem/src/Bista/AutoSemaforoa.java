package Bista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Observer;
import java.util.Observable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import Eredua.SemaforoKudeatzailea;

public class AutoSemaforoa extends JFrame implements Observer{

	private static final long serialVersionUID = -1526416068663302084L;
	private JPanel contentPane;
	private JPanel pnlSemaforo;
	private SemaforoArgia argiBerde = null;
	private SemaforoArgia argiGorri = null;
	private JLabel lblKont;

	/**
	 * Create the frame.
	 */
	public AutoSemaforoa() {
		SemaforoKudeatzailea.getSK().addObserver(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
	}

	/**
	 * leihoaren elmentuak hasieratzeko
	 */
	private void initialize() {
		setSize(150, 555);
		this.setContentPane(getContentPane());
		setTitle("Autoak");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	/**
	 * Panel nagusia bueltatzen du
	 */
	public JPanel getContentPane() {
		if (contentPane == null) {
			contentPane = new JPanel();
			contentPane.setLayout(new BorderLayout());
			contentPane.add(getPnlSemaforo(), BorderLayout.CENTER);
		}
		return contentPane;
	}

	/**
	 * Semaforoaren panela bueltatzen du
	 */
	private JPanel getPnlSemaforo() {
		if (pnlSemaforo == null) {
			pnlSemaforo = new JPanel();
			pnlSemaforo.setLayout(new GridLayout(4, 1, 0, 10));
			pnlSemaforo.add(getLblKont());
			pnlSemaforo.add(getArgiGorri(),null);
			pnlSemaforo.add(getArgiBerde(),null);
		}
		return pnlSemaforo;
	}
	
	/**
	 * Argi gorriaren panela bueltatzen du
	 */
	private SemaforoArgia getArgiGorri() {
		if (argiGorri == null) {
			argiGorri = new SemaforoArgia("gorri", true);
		}
		return argiGorri;
	}

	/**
	 * Argi berdearen panela bueltatzen du
	 */
	private SemaforoArgia getArgiBerde() {
		if (argiBerde == null) {
			argiBerde = new SemaforoArgia("berde", false);
		}
		return argiBerde;
	}
	
	/**
	 * Kontadorearen eraikitzailea bueltatzen du
	 */
	private JLabel getLblKont() {
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

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		lblKont.setText(String.valueOf(SemaforoKudeatzailea.getSK().getKontadore()));
		argiBerde.setAktibo(!SemaforoKudeatzailea.getSK().berdeDago());
		argiGorri.setAktibo(SemaforoKudeatzailea.getSK().berdeDago());
	}

	/**
	 * UPDATE 
	 * -------
	 * Semaforo kudeatzailearen bitartez:
	 *    - lblKont: zenbakien kolorea aldatu (setForeground)
	 *    - lblKont: kontadorearen balioa eguneratu
	 *    - argiGorri eta argiBerde kudeatu
	 */
	
}
