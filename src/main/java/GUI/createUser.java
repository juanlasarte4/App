package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class createUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tecladoNombre;
	private JTextField tecladoContacto;
	private JTextField tecladoApellido;
	private JTextField tecladoTelefono;
	private JTextField tecladoFax;
	private JTextField tecladoDireccion;
	private JTextField tecladoDireccion2;
	private JTextField tecladoCiudad;
	private JTextField tecladoRegion;
	private JTextField tecladoPais;
	private JTextField tecladoCodigoPostal;
	private JTextField tecladoRepVentas;
	private JTextField tecladoLimiteCredito;
	private JTextField tecladoDocumento;
	private JTextField tecladoEmail;
	private JTextField tecladoPassword;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public createUser() {
		setFont(new Font("Unispace", Font.PLAIN, 10));
		setTitle("Crear Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelPedirDatos = new JPanel();
		panelPedirDatos.setBounds(10, 10, 200, 340);
		contentPane.add(panelPedirDatos);
		panelPedirDatos.setLayout(null);

		JLabel campoNombre = new JLabel("Nombre:");
		campoNombre.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		campoNombre.setBounds(0, 0, 200, 15);
		panelPedirDatos.add(campoNombre);

		JLabel campoContacto = new JLabel("Contacto:");
		campoContacto.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		campoContacto.setBounds(0, 20, 200, 15);
		panelPedirDatos.add(campoContacto);

		JLabel campoApellido = new JLabel("Apellido:");
		campoApellido.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		campoApellido.setBounds(0, 40, 200, 15);
		panelPedirDatos.add(campoApellido);

		JLabel campoTelefono = new JLabel("Telefono:");
		campoTelefono.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		campoTelefono.setBounds(0, 60, 200, 15);
		panelPedirDatos.add(campoTelefono);

		JLabel campoFax = new JLabel("Fax:");
		campoFax.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoFax.setHorizontalAlignment(SwingConstants.CENTER);
		campoFax.setBounds(0, 80, 200, 15);
		panelPedirDatos.add(campoFax);

		JLabel campoDireccion = new JLabel("Direccion:");
		campoDireccion.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		campoDireccion.setBounds(0, 100, 200, 15);
		panelPedirDatos.add(campoDireccion);

		JLabel campoDireccion2 = new JLabel("Direccion 2:");
		campoDireccion2.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoDireccion2.setHorizontalAlignment(SwingConstants.CENTER);
		campoDireccion2.setBounds(0, 120, 200, 15);
		panelPedirDatos.add(campoDireccion2);

		JLabel campoCiudad = new JLabel("Ciudad:");
		campoCiudad.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		campoCiudad.setBounds(0, 140, 200, 15);
		panelPedirDatos.add(campoCiudad);

		JLabel campoRegion = new JLabel("Region:");
		campoRegion.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoRegion.setHorizontalAlignment(SwingConstants.CENTER);
		campoRegion.setBounds(0, 160, 200, 15);
		panelPedirDatos.add(campoRegion);

		JLabel campoPais = new JLabel("Pais:");
		campoPais.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoPais.setHorizontalAlignment(SwingConstants.CENTER);
		campoPais.setBounds(0, 180, 200, 15);
		panelPedirDatos.add(campoPais);

		JLabel campoCodigoPostal = new JLabel("Codigo Postal:");
		campoCodigoPostal.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoCodigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		campoCodigoPostal.setBounds(0, 200, 200, 15);
		panelPedirDatos.add(campoCodigoPostal);

		JLabel campoRepVentas = new JLabel("Rep Ventas:");
		campoRepVentas.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoRepVentas.setHorizontalAlignment(SwingConstants.CENTER);
		campoRepVentas.setBounds(0, 220, 200, 15);
		panelPedirDatos.add(campoRepVentas);

		JLabel campoLimiteCredito = new JLabel("Limite Credito:");
		campoLimiteCredito.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoLimiteCredito.setHorizontalAlignment(SwingConstants.CENTER);
		campoLimiteCredito.setBounds(0, 240, 200, 14);
		panelPedirDatos.add(campoLimiteCredito);

		JLabel campoTipoDocumento = new JLabel("Tipo Documento:");
		campoTipoDocumento.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoTipoDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		campoTipoDocumento.setBounds(0, 260, 200, 14);
		panelPedirDatos.add(campoTipoDocumento);

		JLabel campoDocumento = new JLabel("Documento");
		campoDocumento.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		campoDocumento.setBounds(0, 280, 200, 15);
		panelPedirDatos.add(campoDocumento);

		JLabel campoEmail = new JLabel("Email:");
		campoEmail.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoEmail.setHorizontalAlignment(SwingConstants.CENTER);
		campoEmail.setBounds(0, 300, 200, 15);
		panelPedirDatos.add(campoEmail);

		JLabel campoPassword = new JLabel("Password:");
		campoPassword.setFont(new Font("Unispace", Font.PLAIN, 11));
		campoPassword.setHorizontalAlignment(SwingConstants.CENTER);
		campoPassword.setBounds(0, 320, 200, 15);
		panelPedirDatos.add(campoPassword);

		JPanel panelIntroducirDatos = new JPanel();
		panelIntroducirDatos.setBounds(210, 10, 400, 340);
		contentPane.add(panelIntroducirDatos);
		panelIntroducirDatos.setLayout(null);

		tecladoNombre = new JTextField();
		tecladoNombre.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoNombre.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoNombre.setBounds(0, 0, 200, 20);
		panelIntroducirDatos.add(tecladoNombre);
		tecladoNombre.setColumns(10);

		tecladoContacto = new JTextField();
		tecladoContacto.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoContacto.setColumns(10);
		tecladoContacto.setBounds(0, 20, 200, 20);
		panelIntroducirDatos.add(tecladoContacto);

		tecladoApellido = new JTextField();
		tecladoApellido.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoApellido.setColumns(10);
		tecladoApellido.setBounds(0, 40, 200, 20);
		panelIntroducirDatos.add(tecladoApellido);

		tecladoTelefono = new JTextField();
		tecladoTelefono.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoTelefono.setColumns(10);
		tecladoTelefono.setBounds(0, 60, 200, 20);
		panelIntroducirDatos.add(tecladoTelefono);

		tecladoFax = new JTextField();
		tecladoFax.setFont(new Font("Unispace", Font.PLAIN, 10));
		tecladoFax.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoFax.setColumns(10);
		tecladoFax.setBounds(0, 80, 200, 20);
		panelIntroducirDatos.add(tecladoFax);

		tecladoDireccion = new JTextField();
		tecladoDireccion.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoDireccion.setColumns(10);
		tecladoDireccion.setBounds(0, 100, 200, 20);
		panelIntroducirDatos.add(tecladoDireccion);

		tecladoDireccion2 = new JTextField();
		tecladoDireccion2.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoDireccion2.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoDireccion2.setColumns(10);
		tecladoDireccion2.setBounds(0, 120, 200, 20);
		panelIntroducirDatos.add(tecladoDireccion2);

		tecladoCiudad = new JTextField();
		tecladoCiudad.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoCiudad.setColumns(10);
		tecladoCiudad.setBounds(0, 140, 200, 20);
		panelIntroducirDatos.add(tecladoCiudad);

		tecladoRegion = new JTextField();
		tecladoRegion.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoRegion.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoRegion.setColumns(10);
		tecladoRegion.setBounds(0, 160, 200, 20);
		panelIntroducirDatos.add(tecladoRegion);

		tecladoPais = new JTextField();
		tecladoPais.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoPais.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoPais.setColumns(10);
		tecladoPais.setBounds(0, 180, 200, 20);
		panelIntroducirDatos.add(tecladoPais);

		tecladoCodigoPostal = new JTextField();
		tecladoCodigoPostal.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoCodigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoCodigoPostal.setColumns(10);
		tecladoCodigoPostal.setBounds(0, 200, 200, 20);
		panelIntroducirDatos.add(tecladoCodigoPostal);

		tecladoRepVentas = new JTextField();
		tecladoRepVentas.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoRepVentas.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoRepVentas.setColumns(10);
		tecladoRepVentas.setBounds(0, 220, 200, 20);
		panelIntroducirDatos.add(tecladoRepVentas);

		tecladoLimiteCredito = new JTextField();
		tecladoLimiteCredito.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoLimiteCredito.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoLimiteCredito.setColumns(10);
		tecladoLimiteCredito.setBounds(0, 240, 200, 20);
		panelIntroducirDatos.add(tecladoLimiteCredito);

		tecladoDocumento = new JTextField();
		tecladoDocumento.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoDocumento.setColumns(10);
		tecladoDocumento.setBounds(0, 280, 200, 20);
		panelIntroducirDatos.add(tecladoDocumento);

		tecladoEmail = new JTextField();
		tecladoEmail.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoEmail.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoEmail.setColumns(10);
		tecladoEmail.setBounds(0, 300, 200, 20);
		panelIntroducirDatos.add(tecladoEmail);

		tecladoPassword = new JTextField();
		tecladoPassword.setFont(new Font("Unispace", Font.PLAIN, 11));
		tecladoPassword.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoPassword.setColumns(10);
		tecladoPassword.setBounds(0, 320, 200, 20);
		panelIntroducirDatos.add(tecladoPassword);

		JPanel panelTipoDocumento = new JPanel();
		panelTipoDocumento.setBounds(0, 260, 200, 20);
		panelIntroducirDatos.add(panelTipoDocumento);
		panelTipoDocumento.setLayout(null);

		final JRadioButton tecladoTipoDocumentoDNI = new JRadioButton("DNI");
		tecladoTipoDocumentoDNI.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoTipoDocumentoDNI.setFont(new Font("Unispace", Font.PLAIN, 10));
		buttonGroup.add(tecladoTipoDocumentoDNI);
		tecladoTipoDocumentoDNI.setBounds(0, 0, 100, 20);
		panelTipoDocumento.add(tecladoTipoDocumentoDNI);

		final JRadioButton tecladoTipoDocumentoNIE = new JRadioButton("NIE");
		tecladoTipoDocumentoNIE.setHorizontalAlignment(SwingConstants.CENTER);
		tecladoTipoDocumentoNIE.setFont(new Font("Unispace", Font.PLAIN, 10));
		buttonGroup.add(tecladoTipoDocumentoNIE);
		tecladoTipoDocumentoNIE.setBounds(100, 0, 100, 20);
		panelTipoDocumento.add(tecladoTipoDocumentoNIE);

		JPanel panelAdvertencias = new JPanel();
		panelAdvertencias.setBounds(200, 0, 200, 340);
		panelIntroducirDatos.add(panelAdvertencias);
		panelAdvertencias.setLayout(null);

		final JLabel avisoNombre = new JLabel("");
		avisoNombre.setBounds(0, 0, 200, 20);
		panelAdvertencias.add(avisoNombre);
		avisoNombre.setForeground(Color.RED);
		avisoNombre.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoNombre.setHorizontalAlignment(SwingConstants.CENTER);

		final JLabel avisoContacto = new JLabel("");
		avisoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		avisoContacto.setForeground(Color.RED);
		avisoContacto.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoContacto.setBounds(0, 20, 200, 20);
		panelAdvertencias.add(avisoContacto);

		final JLabel avisoApellido = new JLabel("");
		avisoApellido.setHorizontalAlignment(SwingConstants.CENTER);
		avisoApellido.setForeground(Color.RED);
		avisoApellido.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoApellido.setBounds(0, 40, 200, 20);
		panelAdvertencias.add(avisoApellido);

		final JLabel avisoTelefono = new JLabel("");
		avisoTelefono.setHorizontalAlignment(SwingConstants.CENTER);
		avisoTelefono.setForeground(Color.RED);
		avisoTelefono.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoTelefono.setBounds(0, 60, 200, 20);
		panelAdvertencias.add(avisoTelefono);

		final JLabel avisoFax = new JLabel("");
		avisoFax.setHorizontalAlignment(SwingConstants.CENTER);
		avisoFax.setForeground(Color.RED);
		avisoFax.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoFax.setBounds(0, 80, 200, 20);
		panelAdvertencias.add(avisoFax);

		final JLabel avisoDireccion = new JLabel("");
		avisoDireccion.setHorizontalAlignment(SwingConstants.CENTER);
		avisoDireccion.setForeground(Color.RED);
		avisoDireccion.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoDireccion.setBounds(0, 100, 200, 20);
		panelAdvertencias.add(avisoDireccion);

		final JLabel avisoDireccion2 = new JLabel("");
		avisoDireccion2.setHorizontalAlignment(SwingConstants.CENTER);
		avisoDireccion2.setForeground(Color.RED);
		avisoDireccion2.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoDireccion2.setBounds(0, 120, 200, 20);
		panelAdvertencias.add(avisoDireccion2);

		final JLabel avisoCiudad = new JLabel("");
		avisoCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		avisoCiudad.setForeground(Color.RED);
		avisoCiudad.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoCiudad.setBounds(0, 140, 200, 20);
		panelAdvertencias.add(avisoCiudad);

		final JLabel avisoRegion = new JLabel("");
		avisoRegion.setHorizontalAlignment(SwingConstants.CENTER);
		avisoRegion.setForeground(Color.RED);
		avisoRegion.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoRegion.setBounds(0, 160, 200, 20);
		panelAdvertencias.add(avisoRegion);

		final JLabel avisoPais = new JLabel("");
		avisoPais.setHorizontalAlignment(SwingConstants.CENTER);
		avisoPais.setForeground(Color.RED);
		avisoPais.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoPais.setBounds(0, 180, 200, 20);
		panelAdvertencias.add(avisoPais);

		final JLabel avisoCodigoPostal = new JLabel("");
		avisoCodigoPostal.setHorizontalAlignment(SwingConstants.CENTER);
		avisoCodigoPostal.setForeground(Color.RED);
		avisoCodigoPostal.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoCodigoPostal.setBounds(0, 200, 200, 20);
		panelAdvertencias.add(avisoCodigoPostal);

		final JLabel avisoRepVentas = new JLabel("");
		avisoRepVentas.setHorizontalAlignment(SwingConstants.CENTER);
		avisoRepVentas.setForeground(Color.RED);
		avisoRepVentas.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoRepVentas.setBounds(0, 220, 200, 20);
		panelAdvertencias.add(avisoRepVentas);

		final JLabel avisoLimiteCredito = new JLabel("");
		avisoLimiteCredito.setHorizontalAlignment(SwingConstants.CENTER);
		avisoLimiteCredito.setForeground(Color.RED);
		avisoLimiteCredito.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoLimiteCredito.setBounds(0, 240, 200, 20);
		panelAdvertencias.add(avisoLimiteCredito);

		final JLabel avisoTipoDocumento = new JLabel("");
		avisoTipoDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		avisoTipoDocumento.setForeground(Color.RED);
		avisoTipoDocumento.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoTipoDocumento.setBounds(0, 260, 200, 20);
		panelAdvertencias.add(avisoTipoDocumento);

		final JLabel avisoDocumento = new JLabel("");
		avisoDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		avisoDocumento.setForeground(Color.RED);
		avisoDocumento.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoDocumento.setBounds(0, 280, 200, 20);
		panelAdvertencias.add(avisoDocumento);

		final JLabel avisoEmail = new JLabel("");
		avisoEmail.setHorizontalAlignment(SwingConstants.CENTER);
		avisoEmail.setForeground(Color.RED);
		avisoEmail.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoEmail.setBounds(0, 300, 200, 20);
		panelAdvertencias.add(avisoEmail);

		final JLabel avisoPassword = new JLabel("");
		avisoPassword.setHorizontalAlignment(SwingConstants.CENTER);
		avisoPassword.setForeground(Color.RED);
		avisoPassword.setFont(new Font("Unispace", Font.PLAIN, 11));
		avisoPassword.setBounds(0, 320, 200, 20);
		panelAdvertencias.add(avisoPassword);

		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 350, 600, 40);
		contentPane.add(panelBotones);
		panelBotones.setLayout(new BorderLayout(0, 0));

		JButton botonCrear = new JButton("Crear");
		botonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "El cliente se ha creado correctamente.");
			}
		});
		botonCrear.setFont(new Font("Unispace", Font.PLAIN, 10));
		panelBotones.add(botonCrear);

		JButton botonCancelar = new JButton("Cancelar");
		botonCancelar.setFont(new Font("Unispace", Font.PLAIN, 10));
		panelBotones.add(botonCancelar, BorderLayout.EAST);

		JButton botonReset = new JButton("Reset");
		botonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tecladoNombre.setText("");
				tecladoContacto.setText("");
				tecladoApellido.setText("");
				tecladoTelefono.setText("");
				tecladoFax.setText("");
				tecladoDireccion.setText("");
				tecladoDireccion2.setText("");
				tecladoCiudad.setText("");
				tecladoRegion.setText("");
				tecladoPais.setText("");
				tecladoCodigoPostal.setText("");
				tecladoRepVentas.setText("");
				tecladoLimiteCredito.setText("");
				buttonGroup.clearSelection();
				tecladoDocumento.setText("");
				tecladoEmail.setText("");
				tecladoPassword.setText("");
			}
		});
		botonReset.setFont(new Font("Unispace", Font.PLAIN, 10));
		panelBotones.add(botonReset, BorderLayout.WEST);

		tecladoNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoNombre.getText().isEmpty()) {
					avisoNombre.setText("Campo obligatorio");
					;
				} else {
					avisoNombre.setText("");
				}
			}
		});

		tecladoContacto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoContacto.getText().isEmpty()) {
					avisoContacto.setText("Campo obligatorio");
					;
				} else {
					avisoContacto.setText("");
				}
			}
		});

		tecladoApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoApellido.getText().isEmpty()) {
					avisoApellido.setText("Campo obligatorio");
					;
				} else {
					avisoApellido.setText("");
				}
			}
		});

		tecladoTelefono.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoTelefono.getText().isEmpty()) {
					avisoTelefono.setText("Campo obligatorio");
					;
				} else {
					avisoTelefono.setText("");
				}
			}
		});

		tecladoFax.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoFax.getText().isEmpty()) {
					avisoFax.setText("Campo obligatorio");
					;
				} else {
					avisoFax.setText("");
				}
			}
		});

		tecladoDireccion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoDireccion.getText().isEmpty()) {
					avisoDireccion.setText("Campo obligatorio");
					;
				} else {
					avisoDireccion.setText("");
				}
			}
		});

		tecladoDireccion2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoDireccion2.getText().isEmpty()) {
					avisoDireccion2.setText("Campo obligatorio");
					;
				} else {
					avisoDireccion2.setText("");
				}
			}
		});

		tecladoCiudad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoCiudad.getText().isEmpty()) {
					avisoCiudad.setText("Campo obligatorio");
					;
				} else {
					avisoCiudad.setText("");
				}
			}
		});

		tecladoRegion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoRegion.getText().isEmpty()) {
					avisoRegion.setText("Campo obligatorio");
					;
				} else {
					avisoRegion.setText("");
				}
			}
		});

		tecladoPais.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoPais.getText().isEmpty()) {
					avisoPais.setText("Campo obligatorio");
					;
				} else {
					avisoPais.setText("");
				}
			}
		});

		tecladoCodigoPostal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoCodigoPostal.getText().isEmpty()) {
					avisoCodigoPostal.setText("Campo obligatorio");
					;
				} else {
					avisoCodigoPostal.setText("");
				}
			}
		});

		tecladoRepVentas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoRepVentas.getText().isEmpty()) {
					avisoRepVentas.setText("Campo obligatorio");
					;
				} else {
					avisoRepVentas.setText("");
				}
			}
		});

		tecladoLimiteCredito.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoLimiteCredito.getText().isEmpty()) {
					avisoLimiteCredito.setText("Campo obligatorio");
					;
				} else {
					avisoLimiteCredito.setText("");
				}
			}
		});

		tecladoDocumento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoDocumento.getText().isEmpty()) {
					avisoDocumento.setText("Campo obligatorio");
					;
				} else {
					avisoDocumento.setText("");
				}
			}
		});

		tecladoEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoEmail.getText().isEmpty()) {
					avisoEmail.setText("Campo obligatorio");
					;
				} else {
					avisoEmail.setText("");
				}
			}
		});

		tecladoPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (tecladoPassword.getText().isEmpty()) {
					avisoPassword.setText("Campo obligatorio");
					;
				} else {
					avisoPassword.setText("");
				}
			}
		});
	}
}
