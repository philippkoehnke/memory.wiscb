package gui_Komplett;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.Font;



public class Startbildschirm extends JFrame {

	public static void main(String[] args) {
		new Startbildschirm();

	}

	private void init() {
		System.out.println("Set");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setTitle("Menü");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 150, 0, 147, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 90, 0, 0, 0, 35, 35, 35, 35, 35, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);
		
				JButton btnStatistik = new JButton("Statistik");
				btnStatistik.setFont(new Font("Tahoma", Font.PLAIN, 30));
				btnStatistik.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						anzeigen();
					}
				});
						
								JButton btnEinzelspieler = new JButton("Einzelspieler");
								btnEinzelspieler.setFont(new Font("Tahoma", Font.PLAIN, 30));
								btnEinzelspieler.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										starteEinzelspieler();
										
									}
								});
								GridBagConstraints gbc_btnEinzelspieler = new GridBagConstraints();
								gbc_btnEinzelspieler.gridwidth = 6;
								gbc_btnEinzelspieler.anchor = GridBagConstraints.SOUTH;
								gbc_btnEinzelspieler.insets = new Insets(0, 0, 5, 0);
								gbc_btnEinzelspieler.gridx = 0;
								gbc_btnEinzelspieler.gridy = 1;
								getContentPane().add(btnEinzelspieler, gbc_btnEinzelspieler);
				
						JButton btnMehrspieler = new JButton("Mehrspieler ");
						btnMehrspieler.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								starteMehrspieler();
							}
						});
						btnMehrspieler.setFont(new Font("Tahoma", Font.PLAIN, 30));
						GridBagConstraints gbc_btnMehrspieler = new GridBagConstraints();
						gbc_btnMehrspieler.gridwidth = 6;
						gbc_btnMehrspieler.insets = new Insets(0, 0, 5, 0);
						gbc_btnMehrspieler.gridx = 0;
						gbc_btnMehrspieler.gridy = 3;
						getContentPane().add(btnMehrspieler, gbc_btnMehrspieler);
				GridBagConstraints gbc_btnStatistik = new GridBagConstraints();
				gbc_btnStatistik.gridwidth = 6;
				gbc_btnStatistik.insets = new Insets(0, 0, 5, 0);
				gbc_btnStatistik.anchor = GridBagConstraints.NORTH;
				gbc_btnStatistik.gridx = 0;
				gbc_btnStatistik.gridy = 5;
				getContentPane().add(btnStatistik, gbc_btnStatistik);
		setVisible(true);
		System.out.println("ready");

	}

	protected void starteMehrspieler() {
		try {
			Einzelspieler dialog = new Einzelspieler();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	protected void starteEinzelspieler() {
		try {
			Einzelspieler dialog = new Einzelspieler();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	protected void anzeigen() {
		
	}

	public Startbildschirm() {

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		setJMenuBar(menuBar);

		JMenu mnSystem = new JMenu("System");
		mnSystem.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		menuBar.add(mnSystem);

		JMenuItem mntmBeenden = new JMenuItem("Beenden");
		mntmBeenden.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		mntmBeenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				beenden();
			}
		});

		mnSystem.add(mntmBeenden);

		JMenu mnFunktionen = new JMenu("Funktionen");
		mnFunktionen.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		menuBar.add(mnFunktionen);

		JMenuItem mntmNewMenuItem = new JMenuItem("Statistik zur\u00FCcksetzten");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuzurücksetzten();

			}
		});
		mnFunktionen.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Impressum");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 28));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				impressum();
			}
		});
		mnFunktionen.add(mntmNewMenuItem_1);
		System.out.println("starte ...");
		init();
	}

	protected void menuzurücksetzten() {
		int opt = JOptionPane.showConfirmDialog(this, "Möchten Sie die Statistik zurücksetzten ?", "Zurücksetzten ?",
				JOptionPane.YES_NO_OPTION);
		if (opt == JOptionPane.YES_OPTION) {
			setBack setBack = new setBack();
			setBack.zurücksetzten();
		}

	}

	protected void impressum() {
		try {
			Impressum dialog = new Impressum();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void beenden() {
		int opt = JOptionPane.showConfirmDialog(this, "Möchten Sie wirklich beenden ?", "Programm beenden ?",
				JOptionPane.YES_NO_OPTION);
		if (opt == JOptionPane.YES_OPTION) {
			System.exit(0);
		}

	}
}
