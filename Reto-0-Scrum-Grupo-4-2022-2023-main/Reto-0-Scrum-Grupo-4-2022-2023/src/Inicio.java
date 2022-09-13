import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreUsuario;
	private JPasswordField passwordField;
	private JComboBox comboBoxEgunAutaketa;
	private JTextField txtUsuario;
	private JTextField textContraseña;
	private JTextField txtRepetirC;
	private JTextField Nombre;
	private JTextField Apellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane entrada = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(entrada);
		
		JPanel Login = new JPanel();
		entrada.addTab("Login", null, Login, null);
		Login.setLayout(new MigLayout("", "[grow][right][grow,left][grow][]", "[grow][][][grow][]"));
		
		JLabel NombreUsuario = new JLabel("Usuario:");
		Login.add(NombreUsuario, "cell 1 1,alignx trailing");
		
		txtNombreUsuario = new JTextField();
		
		Login.add(txtNombreUsuario, "cell 2 1,growx");
		txtNombreUsuario.setColumns(10);
		
		JLabel LabelContraseña = new JLabel("Contraseña:");
		Login.add(LabelContraseña, "cell 1 2,alignx trailing");
		
		passwordField = new JPasswordField();
		Login.add(passwordField, "cell 2 2,growx");
		
		JButton bntConfirmar = new JButton("Confirmar");
		Login.add(bntConfirmar, "cell 4 4");
		
		JPanel Registro = new JPanel();
		entrada.addTab("Registro", null, Registro, null);
		Registro.setLayout(new MigLayout("", "[grow][right][left][grow,right]", "[grow][][][][][][][grow][]"));
		
		JLabel lblUsuario = new JLabel("Usuario");
		Registro.add(lblUsuario, "cell 1 1,alignx trailing");
		
		txtUsuario = new JTextField();
		Registro.add(txtUsuario, "cell 2 1,growx");
		txtUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		Registro.add(lblContraseña, "cell 1 2,alignx trailing");
		
		textContraseña = new JTextField();
		Registro.add(textContraseña, "cell 2 2,growx");
		textContraseña.setColumns(10);
		
		JLabel lblRepetirContraseña = new JLabel("Repetir contraseña");
		Registro.add(lblRepetirContraseña, "cell 1 3,alignx trailing");
		
		txtRepetirC = new JTextField();
		Registro.add(txtRepetirC, "cell 2 3,growx");
		txtRepetirC.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		Registro.add(lblNombre, "cell 1 4,alignx trailing");
		
		Nombre = new JTextField();
		Registro.add(Nombre, "cell 2 4,growx");
		Nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		Registro.add(lblApellido, "cell 1 5,alignx trailing");
		
		Apellidos = new JTextField();
		Registro.add(Apellidos, "cell 2 5,growx");
		Apellidos.setColumns(10);
		
		JLabel lblFuncion = new JLabel("Funcion");
		Registro.add(lblFuncion, "cell 1 6,alignx trailing");
		
		JComboBox comboBoxErregistroFuntzioak = new JComboBox();
		comboBoxErregistroFuntzioak.setModel(new DefaultComboBoxModel(Permisos.values()));
		Registro.add(comboBoxErregistroFuntzioak, "cell 2 6,growx");
		
		JButton btnRegistrarse = new JButton("Registrarse");
		Registro.add(btnRegistrarse, "cell 3 8");
	
		
		/**btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		

} 
	
		}**/
	}
}
