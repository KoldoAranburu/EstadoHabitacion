package patron.state;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;

public class PantallaPrincipal {

	private JFrame frame;
	private JTextField txtNombreDeUsuario;
	private JTextField txtContrasea;
	private JLabel lblContrasea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PantallaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNombreDeUsuario = new JTextField();
		txtNombreDeUsuario.setBounds(208, 63, 149, 20);
		frame.getContentPane().add(txtNombreDeUsuario);
		txtNombreDeUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setColumns(10);
		txtContrasea.setBounds(208, 136, 149, 20);
		frame.getContentPane().add(txtContrasea);
		
		JLabel lblNewLabel = new JLabel("Nombre de usuario");
		lblNewLabel.setBounds(208, 38, 149, 14);
		frame.getContentPane().add(lblNewLabel);
		
		lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(208, 111, 149, 14);
		frame.getContentPane().add(lblContrasea);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordarme en este orden");
		chckbxNewCheckBox.setBounds(210, 181, 147, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(0, 0, 255));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(238, 231, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(208, 282, 149, 100);
		frame.getContentPane().add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.append(lblNewLabel.getText() + "\n");
                textArea.append(txtNombreDeUsuario.getText() + "\n");
                textArea.append("Recordarme: " + chckbxNewCheckBox.getVerifyInputWhenFocusTarget());
            }
        });		
	}
}
