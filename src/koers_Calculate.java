import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.SystemColor;

import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.SwingConstants;



public class koers_Calculate {

	private JFrame frmKoersdosramos;
	private JTextField txtfield1;
	private JTextField txtfield2;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					koers_Calculate window = new koers_Calculate();
					window.frmKoersdosramos.setVisible(true);
					window.frmKoersdosramos.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public koers_Calculate() {
		initialize();
		
		
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmKoersdosramos = new JFrame();
		frmKoersdosramos.setTitle("Koers_dosRamos");
		frmKoersdosramos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\daniel\\Pictures\\school pics\\icon2.png"));
		frmKoersdosramos.getContentPane().setBackground(Color.DARK_GRAY);
		frmKoersdosramos.setBounds(100, 100, 545, 365);
		frmKoersdosramos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKoersdosramos.getContentPane().setLayout(null);
		
	final	JComboBox Currency_Box = new JComboBox();
		Currency_Box.setBackground(SystemColor.inactiveCaptionBorder);
		Currency_Box.setMaximumRowCount(80);
		Currency_Box.setFont(new Font("Swansea", Font.BOLD, 16));
		Currency_Box.setModel(new DefaultComboBoxModel(new String[] {"SRD", "USD", "EURO"}));
		Currency_Box.setToolTipText("20");
		Currency_Box.setBounds(10, 129, 228, 45);
		frmKoersdosramos.getContentPane().add(Currency_Box);
		
		final JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"USD", "SRD", "EURO"}));
		comboBox2.setToolTipText("20");
		comboBox2.setMaximumRowCount(80);
		comboBox2.setFont(new Font("Swansea", Font.BOLD, 16));
		comboBox2.setBackground(SystemColor.activeCaption);
		comboBox2.setBounds(293, 129, 226, 45);
		frmKoersdosramos.getContentPane().add(comboBox2);
		
		txtfield1 = new JTextField();
		txtfield1.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtfield1.setBounds(10, 185, 228, 50);
		frmKoersdosramos.getContentPane().add(txtfield1);
		txtfield1.setColumns(10);
		
		txtfield2 = new JTextField(2);
		txtfield2.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtfield2.setBounds(293, 185, 226, 50);
		frmKoersdosramos.getContentPane().add(txtfield2);
		txtfield2.setColumns(10);
		
		JList list = new JList();
		list.setBounds(159, 131, -36, 1);
		frmKoersdosramos.getContentPane().add(list);
		
		JButton btnNewButton = new JButton("Wissen");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtfield1.setText("");
				txtfield2.setText("");
				
			}
		});
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setFont(new Font("Swansea", Font.BOLD, 23));
		btnNewButton.setBounds(39, 262, 146, 53);
		frmKoersdosramos.getContentPane().add(btnNewButton);
		
		JButton btnSluiten = new JButton("Sluiten");
		btnSluiten.setForeground(Color.BLACK);
		btnSluiten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSluiten.setBackground(new Color(255, 51, 51));
		btnSluiten.setFont(new Font("Swansea", Font.BOLD, 23));
		btnSluiten.setBounds(351, 262, 146, 53);
		frmKoersdosramos.getContentPane().add(btnSluiten);
		
		JLabel lblKoersCalculator = new JLabel("Koers Calculator");
		lblKoersCalculator.setFont(new Font("Swansea", Font.BOLD, 45));
		lblKoersCalculator.setForeground(new Color(65, 105, 225));
		lblKoersCalculator.setBounds(89, 11, 377, 65);
		frmKoersdosramos.getContentPane().add(lblKoersCalculator);
		
		JButton btnNewButton_1 = new JButton("Bereken");
		btnNewButton_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double bereken_Getal = Double.parseDouble(txtfield1.getText());
				double ans;
				
				if (Currency_Box.getSelectedItem().equals("SRD") && comboBox2.getSelectedItem().equals("EURO")) {
					ans = bereken_Getal / 8.60;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("SRD") && comboBox2.getSelectedItem().equals("USD")) {
					ans = bereken_Getal / 7.52;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("SRD") && comboBox2.getSelectedItem().equals("SRD")) {
					ans = bereken_Getal;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("SRD")) {
					ans = bereken_Getal * 7.57;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("EURO") && comboBox2.getSelectedItem().equals("SRD")) {
					ans = bereken_Getal * 8.65;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("EURO") && comboBox2.getSelectedItem().equals("USD")) {
					ans = bereken_Getal * 1.15272;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("EURO") && comboBox2.getSelectedItem().equals("EURO")) {
					ans = bereken_Getal;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("EURO")) {
					ans = bereken_Getal * 0.867465;
					txtfield2.setText(Double.toString(ans));
				}
				if (Currency_Box.getSelectedItem().equals("USD") && comboBox2.getSelectedItem().equals("USD")) {
					ans = bereken_Getal;
					txtfield2.setText(Double.toString(ans));
				}
			};
		});
		btnNewButton_1.setFont(new Font("Swansea", Font.BOLD, 23));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(194, 262, 147, 53);
		frmKoersdosramos.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Verkoop");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Swansea", Font.BOLD, 24));
		lblNewLabel.setBounds(70, 71, 115, 50);
		frmKoersdosramos.getContentPane().add(lblNewLabel);
		
		JLabel lblAankoop = new JLabel("Aankoop");
		lblAankoop.setForeground(Color.WHITE);
		lblAankoop.setFont(new Font("Swansea", Font.BOLD, 24));
		lblAankoop.setBounds(359, 71, 107, 50);
		frmKoersdosramos.getContentPane().add(lblAankoop);
		
		JLabel label = new JLabel("<->");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Swansea", Font.BOLD, 24));
		label.setBounds(251, 71, 90, 50);
		frmKoersdosramos.getContentPane().add(label);
		
	
	
		
	 
	}
}
