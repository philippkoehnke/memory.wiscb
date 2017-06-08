package gui_Komplett;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Impressum extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public Impressum() {
		
		setAlwaysOnTop(true);
		setTitle("Impressum v.1.0");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JTextArea txtrImpressumEntwicklungUnd = new JTextArea();
			txtrImpressumEntwicklungUnd.setFont(new Font("Monospaced", Font.PLAIN, 20));
			txtrImpressumEntwicklungUnd.setEditable(false);
			txtrImpressumEntwicklungUnd.setTabSize(3);
			txtrImpressumEntwicklungUnd.setText(
					"Impressum:\r\nEntwicklung und Entwurf : \t\nAndreas Steinwender\nMarcus Gauterin\nJannik Brinkmann\nPhilipp Köhnke\r\nHeadCoach : \tHerr Lang\r");
			GridBagConstraints gbc_txtrImpressumEntwicklungUnd = new GridBagConstraints();
			gbc_txtrImpressumEntwicklungUnd.fill = GridBagConstraints.BOTH;
			gbc_txtrImpressumEntwicklungUnd.gridx = 0;
			gbc_txtrImpressumEntwicklungUnd.gridy = 0;
			contentPanel.add(txtrImpressumEntwicklungUnd, gbc_txtrImpressumEntwicklungUnd);
		}
		{
			JPanel buttonPane = new JPanel();

			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
