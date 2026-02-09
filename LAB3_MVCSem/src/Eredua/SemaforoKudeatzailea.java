package Eredua;

import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

/** SEMAFOROA KUDEATZEKO EREDUA*/
public class SemaforoKudeatzailea extends Observable{
	private static SemaforoKudeatzailea nSK = new SemaforoKudeatzailea();
	private boolean berdeDago;
	private static final int PERIODO = 15;
	private int kont;
	private Timer timer = null;
	
	private SemaforoKudeatzailea ()
	{
		berdeDago = true;
		kont = PERIODO;
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				updateKont();
			}		
		};
		timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, 0, 1000);
	}
	
	private void updateKont() {
		kont--;
		if (kont == 0) {
			kont = PERIODO;
			berdeDago = !berdeDago;
		}
		//Ereduaren egoera konsolatik atera
		System.out.printf("EREDUAREN EGOERA-> berdeDago : %b   Kont: %d\n", berdeDago, kont);
		setChanged();
		notifyObservers();
	}
	
	public static SemaforoKudeatzailea getSK() { return nSK; }
	
	public int getKontadore() {	return kont;}
	
	public boolean berdeDago() { return berdeDago; }
	
	public void berdeJarri() {
		if (!berdeDago()) {
			kont = PERIODO;
			berdeDago = true;		
		}
		setChanged();
		notifyObservers();
	}
	
}
