package lab1.org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

public class klase1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JTextField txtGustukoDuzu;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField txtBotoiBatSakatu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					klase1 frame = new klase1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public klase1() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().add(getChckbxNewCheckBox());
		getContentPane().add(getChckbxNewCheckBox_1());
		getContentPane().add(getTxtGustukoDuzu());
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getBtnNewButton_1());
		getContentPane().add(getBtnNewButton_2());
		getContentPane().add(getBtnNewButton_3());
		getContentPane().add(getBtnNewButton_4());
		getContentPane().add(getBtnNewButton_5());
		getContentPane().add(getTxtBotoiBatSakatu());
		getContentPane().add(getRdbtnNewRadioButton());
		getContentPane().add(getRdbtnNewRadioButton_1());
		getContentPane().add(getRdbtnNewRadioButton_2());

	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("BAI");
			buttonGroup.add(chckbxNewCheckBox);
			chckbxNewCheckBox.setBounds(154, 226, 41, 20);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("EZ");
			buttonGroup.add(chckbxNewCheckBox_1);
			chckbxNewCheckBox_1.setBounds(197, 226, 41, 20);
		}
		return chckbxNewCheckBox_1;
	}
	private JTextField getTxtGustukoDuzu() {
		if (txtGustukoDuzu == null) {
			txtGustukoDuzu = new JTextField();
			txtGustukoDuzu.setText("GUSTUKO DUZU?");
			txtGustukoDuzu.setBounds(41, 227, 96, 18);
			txtGustukoDuzu.setColumns(10);
		}
		return txtGustukoDuzu;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("A1");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(165, 71, 84, 20);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("A2");
			btnNewButton_1.setBounds(260, 71, 84, 20);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("B2");
			btnNewButton_2.setBounds(260, 100, 84, 20);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("B1");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_3.setBounds(165, 101, 84, 20);
		}
		return btnNewButton_3;
	}
	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("C1");
			btnNewButton_4.setBounds(165, 131, 84, 20);
		}
		return btnNewButton_4;
	}
	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("C2");
			btnNewButton_5.setBounds(260, 130, 84, 20);
		}
		return btnNewButton_5;
	}
	private JTextField getTxtBotoiBatSakatu() {
		if (txtBotoiBatSakatu == null) {
			txtBotoiBatSakatu = new JTextField();
			txtBotoiBatSakatu.setForeground(SystemColor.infoText);
			txtBotoiBatSakatu.setBackground(SystemColor.control);
			txtBotoiBatSakatu.setText("Botoi bat sakatu");
			txtBotoiBatSakatu.setBounds(176, 37, 96, 18);
			txtBotoiBatSakatu.setColumns(10);
		}
		return txtBotoiBatSakatu;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("A");
			buttonGroup_1.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setBounds(6, 71, 102, 20);
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnNewRadioButton_1() {
		if (rdbtnNewRadioButton_1 == null) {
			rdbtnNewRadioButton_1 = new JRadioButton("B");
			buttonGroup_1.add(rdbtnNewRadioButton_1);
			rdbtnNewRadioButton_1.setBounds(6, 100, 102, 20);
		}
		return rdbtnNewRadioButton_1;
	}
	private JRadioButton getRdbtnNewRadioButton_2() {
		if (rdbtnNewRadioButton_2 == null) {
			rdbtnNewRadioButton_2 = new JRadioButton("C");
			buttonGroup_1.add(rdbtnNewRadioButton_2);
			rdbtnNewRadioButton_2.setBounds(6, 131, 102, 20);
		}
		return rdbtnNewRadioButton_2;
	}
}
