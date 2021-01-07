package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame appJardineria;
	private JTextField tecladoUsuario;
	private JPasswordField tecladoClave;
	
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login login = new login();
					login.appJardineria.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appJardineria = new JFrame();
		appJardineria.setFont(new Font("Unispace", Font.PLAIN, 10));
		appJardineria.setTitle("App jardineria");
		appJardineria.setBounds(100, 100, 450, 300);
		appJardineria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appJardineria.getContentPane().setLayout(null);

		JPanel panelUsuario = new JPanel();
		panelUsuario.setBounds(0, 0, 250, 50);
		appJardineria.getContentPane().add(panelUsuario);
		panelUsuario.setLayout(null);

		JLabel campoUsuario = new JLabel("Usuario:");
		campoUsuario.setBounds(10, 15, 50, 15);
		panelUsuario.add(campoUsuario);
		campoUsuario.setFont(new Font("Unispace", Font.PLAIN, 10));

		tecladoUsuario = new JTextField();
		tecladoUsuario.setBounds(60, 10, 100, 30);
		panelUsuario.add(tecladoUsuario);

		JPanel panelClave = new JPanel();
		panelClave.setBounds(0, 50, 250, 100);
		appJardineria.getContentPane().add(panelClave);
		panelClave.setLayout(null);

		JLabel campoClave = new JLabel("Clave:");
		campoClave.setBounds(10, 15, 50, 15);
		panelClave.add(campoClave);
		campoClave.setFont(new Font("Unispace", Font.PLAIN, 10));

		tecladoClave = new JPasswordField();
		tecladoClave.setBounds(60, 10, 100, 30);
		panelClave.add(tecladoClave);

		final JButton botonParaOcultarClave = new JButton();
		botonParaOcultarClave.setBounds(160, 10, 30, 30);
		panelClave.add(botonParaOcultarClave);
		botonParaOcultarClave.setIcon(new ImageIcon(login.class.getResource("/img/view_eye_icon.png")));
		botonParaOcultarClave.setVisible(false);
		
		final JButton botonParaVerClave = new JButton();
		botonParaVerClave.setBounds(160, 10, 30, 30);
		panelClave.add(botonParaVerClave);
		botonParaVerClave.setIcon(new ImageIcon(login.class.getResource("/img/view_eye_icon_invisible.png")));

		final JTextArea enlaceOlvidoDeClave = new JTextArea();
		enlaceOlvidoDeClave.setBounds(60, 50, 130, 20);
		panelClave.add(enlaceOlvidoDeClave);
		enlaceOlvidoDeClave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(enlaceOlvidoDeClave,
						"Por el momento, no hay un sistema para recuperar claves.");
			}
		});
		enlaceOlvidoDeClave.setBackground(SystemColor.control);
		enlaceOlvidoDeClave.setFont(new Font("Unispace", Font.PLAIN, 10));
		enlaceOlvidoDeClave.setText("He olvidado la clave");

		JPanel panelControl = new JPanel();
		panelControl.setBounds(0, 150, 250, 50);
		appJardineria.getContentPane().add(panelControl);

		JButton botonAcceder = new JButton("Acceder");
		panelControl.add(botonAcceder);
		botonAcceder.setFont(new Font("Unispace", Font.PLAIN, 10));

		JButton botonSalir = new JButton("Salir");
		panelControl.add(botonSalir);
		botonSalir.setFont(new Font("Unispace", Font.PLAIN, 10));
		botonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botonAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		botonParaVerClave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonParaVerClave.setVisible(false);
				tecladoClave.setEchoChar((char) 0);
				botonParaOcultarClave.setVisible(true);
			}
		});
		botonParaOcultarClave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonParaOcultarClave.setVisible(false);
				tecladoClave.setEchoChar('*');
				botonParaVerClave.setVisible(true);
			}
		});
	}

	public JTextField getTecladoUsuario() {
		return tecladoUsuario;
	}
	
	public JPasswordField getTecladoPassword() {
		return tecladoClave;
	}
}