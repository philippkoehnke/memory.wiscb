package gui_Komplett;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Einzelspieler extends JDialog {
	private JTextField textField;
	private static final String CHARS_GROSS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String CHARS_KLEIN = "abcdefghijklmnopqrstuvwxyz";
	private static final String CHARS_ANDERE = "123456789!?§$%";

	/**
	 * Create the dialog.
	 */
	public Einzelspieler() {

		setAlwaysOnTop(true);
		setTitle("Starte Einzelspieler ");
		setSize(500, 500);
		setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		JLabel lblNameSpieler = new JLabel("Name Spieler 1");
		lblNameSpieler.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNameSpieler = new GridBagConstraints();
		gbc_lblNameSpieler.insets = new Insets(0, 0, 0, 5);
		gbc_lblNameSpieler.gridx = 0;
		gbc_lblNameSpieler.gridy = 0;
		getContentPane().add(lblNameSpieler, gbc_lblNameSpieler);

		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				SpielerBennene(arg0);
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setColumns(12);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;

		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

	}

	public void SpielerBennene(KeyEvent e) {
		char c = e.getKeyChar();
		if (CHARS_GROSS.indexOf(c) == -1 && CHARS_KLEIN.indexOf(c) == -1 && CHARS_ANDERE.indexOf(c) == -1 ) {
			e.consume();
		}

	}

}
