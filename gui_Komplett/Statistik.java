package gui_Komplett;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;;

public class Statistik{
	private final JPanel contentPanel = new JPanel();
	
	private Startbildschirm startbildschirm;
	private JTextField txtHighscore;
	private final JTextField textField = new JTextField();
	
	
	

	
	public Statistik(Startbildschirm startbildschirm) {
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		txtHighscore = new JTextField();
		txtHighscore.setText("Highscore ");
		GridBagConstraints gbc_txtHighscore = new GridBagConstraints();
		gbc_txtHighscore.anchor = GridBagConstraints.WEST;
		gbc_txtHighscore.insets = new Insets(0, 0, 5, 0);
		gbc_txtHighscore.gridx = 1;
		gbc_txtHighscore.gridy = 1;
		contentPanel.add(txtHighscore, gbc_txtHighscore);
		txtHighscore.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.EAST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JList list = new JList();
		GridBagConstraints gbc_list = new GridBagConstraints();
		gbc_list.fill = GridBagConstraints.BOTH;
		gbc_list.gridx = 1;
		gbc_list.gridy = 4;
		contentPanel.add(list, gbc_list);
		this.startbildschirm = startbildschirm;
		 
		
		
		
	}

}
