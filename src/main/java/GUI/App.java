package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaClientes;
	private JTable tablaPedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Clientes");
		mnNewMenu.setFont(new Font("Unispace", Font.PLAIN, 11));
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Crear");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createUser frame = new createUser();
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Modificar");
		mntmNewMenuItem_1.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Borrar");
		mntmNewMenuItem_2.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenu mnNewMenu_1 = new JMenu("Empleados");
		mnNewMenu_1.setFont(new Font("Unispace", Font.PLAIN, 11));
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Crear");
		mntmNewMenuItem_3.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Modificar");
		mntmNewMenuItem_4.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem_4.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Borrar");
		mntmNewMenuItem_5.setFont(new Font("Unispace", Font.PLAIN, 11));
		mntmNewMenuItem_5.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu_1.add(mntmNewMenuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane contenedorPrincipal = new JTabbedPane(JTabbedPane.TOP);
		contenedorPrincipal.setBounds(10, 11, 764, 517);
		contenedorPrincipal.setFont(new Font("Unispace", Font.PLAIN, 11));
		contentPane.add(contenedorPrincipal);

		JScrollPane contenedorClientes = new JScrollPane();
		contenedorPrincipal.addTab("Clientes", null, contenedorClientes, null);

		tablaClientes = new JTable();
		tablaClientes.setFont(new Font("Unispace", Font.PLAIN, 11));
		contenedorClientes.setRowHeaderView(tablaClientes);
		login login = new login();
		login.setVisible(true);
		mostrarTodosLosClientes(login);

		JScrollPane contenedorPedidos = new JScrollPane();
		contenedorPrincipal.addTab("Pedidos", null, contenedorPedidos, null);
		
		tablaPedidos = new JTable();
		contenedorPedidos.setRowHeaderView(tablaPedidos);
	}

	public void mostrarTodosLosClientes(login login) {
		String usuario = login.getTecladoUsuario().getText();
		String clave = login.getTecladoPassword().getText();
		try {
			// INICIAMOS LA CONEXION A LA BBDD CON EL USUARIO Y LA CLAVE QUE HEMOS PEDIDO
			// PREVIAMENTE
			Connection conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/jardineria?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					usuario, clave);

			// CREAMOS UNA CONSULTA Y LA EJECUTAMOS
			Statement statement = conexion.createStatement();

			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("Codigo");
			model.addColumn("Nombre");
			model.addColumn("Contacto");
			model.addColumn("Apellido");
			model.addColumn("Telefono");
			model.addColumn("Fax");
			model.addColumn("Direccion");
			model.addColumn("Direccion 2");
			model.addColumn("Ciudad");
			model.addColumn("Region");
			model.addColumn("Pais");
			model.addColumn("Codigo Postal");
			model.addColumn("Rep Ventas");
			model.addColumn("Limite Credito");

			tablaClientes.setModel(model);
			String[] dato = new String[16];
			ResultSet resultSet = statement.executeQuery("select * from cliente");
			// MOSTRAMOS TODOS LOS CLIENTES
			while (resultSet.next()) {
				dato[0] = resultSet.getString(0);
				dato[1] = resultSet.getString(1);
				dato[2] = resultSet.getString(2);
				dato[3] = resultSet.getString(3);
				dato[4] = resultSet.getString(4);
				dato[5] = resultSet.getString(5);
				dato[6] = resultSet.getString(6);
				dato[7] = resultSet.getString(7);
				dato[8] = resultSet.getString(8);
				dato[9] = resultSet.getString(9);
				dato[10] = resultSet.getString(10);
				dato[11] = resultSet.getString(11);
				dato[12] = resultSet.getString(12);
				dato[13] = resultSet.getString(13);
				dato[14] = resultSet.getString(14);
				dato[15] = resultSet.getString(15);
				dato[16] = resultSet.getString(16);
				model.addRow(dato);
			}
			conexion.close();
		} catch (SQLException sqle) {
			System.out.println("No se ha podido acceder a la BBDD.");
		}
	}
}