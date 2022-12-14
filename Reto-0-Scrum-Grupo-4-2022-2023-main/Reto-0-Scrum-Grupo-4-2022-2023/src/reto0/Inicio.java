package reto0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.miginfocom.swing.MigLayout;
import reto0.Usuario.Permisos;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
/*Esta clase es el inicio del programa , sirve para que el usuario se logue verificando que esta en la base de datos
 * O si no esta registrado para registrarse*/
@SuppressWarnings("serial")
public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JPasswordField passwordField;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JPasswordField passwordFieldContrasenya;
	private JPasswordField passwordFieldRepetirContrasenya;
	@SuppressWarnings("rawtypes")
	private static JComboBox comboBoxRol;
	public static ArrayList<AlarmadeIncendios> alarmadeIncendios = new ArrayList<AlarmadeIncendios>();
	public static ArrayList<Calefaccion> calefaccion = new ArrayList<Calefaccion>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Inicio frame = new Inicio();
		frame.setVisible(true);
		alarmadeIncendios = Base_de_Datos.cargarAlarmasdeIncendios();
		calefaccion = Base_de_Datos.cargarCalefacion();
		
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo ( null );
		setResizable(false);
		
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JTabbedPane entrada = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(entrada);
		
		
		JPanel Login = new JPanel();
		entrada.addTab("Login", null, Login, null);
		Login.setLayout(new MigLayout("", "[grow][right][grow,left][grow][]", "[grow][][][grow][]"));
		
		
		JLabel NombreUsuario = new JLabel("Usuario:");
		Login.add(NombreUsuario, "cell 1 1,alignx trailing");
		
		txtUsuario = new JTextField();
		Login.add(txtUsuario, "cell 2 1,growx");
		txtUsuario.setColumns(10);
		
		JLabel LabelContrasenya = new JLabel("Contrase??a:");
		Login.add(LabelContrasenya, "cell 1 2,alignx trailing");
		
		passwordField = new JPasswordField();
		Login.add(passwordField, "cell 2 2,growx");
		
		/*Atascado funcion login y pasar a los planos*/
		JButton bntConfirmar = new JButton("Confirmar");
		bntConfirmar.addMouseListener(new MouseAdapter() {
				@SuppressWarnings("unused")
				@Override
				public void mouseClicked(MouseEvent e) {
					
					String nombre = txtUsuario.getText();
					String contrasenya = new String(passwordField.getPassword());
					String apellidos = txtApellidos.getText();
					
			
		 if (  contrasenya.isBlank()  || nombre.isBlank() ) {
			JOptionPane.showMessageDialog(null, "Hay que completar todos los campos.");
		}
		
				Usuario persona = new Usuario(nombre, contrasenya);
				
				if (persona.login()) {
					JOptionPane.showMessageDialog(null, "El usuario se ha logeado correctamente.");
					MenuPlanoCentro.main(null);
					dispose();
				}
				
				
				else if (!persona.login())
					JOptionPane.showMessageDialog(null, "El usario o la contrase??a estan mal escritas.");
			}
			});
		Login.add(bntConfirmar, "cell 3 4,alignx right");
	
		
		
		JPanel Registro = new JPanel();
		entrada.addTab("Registro", null, Registro, null);
		Registro.setLayout(new MigLayout("", "[grow][right][grow,left][grow,right]", "[grow][][][][][][][grow][]"));
		
		JLabel lblNombre = new JLabel("Nombre");
		Registro.add(lblNombre, "flowx,cell 1 1,alignx trailing");
		
		txtNombre = new JTextField();
		Registro.add(txtNombre, "cell 2 1,growx");
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		Registro.add(lblApellido, "flowx,cell 1 2,alignx trailing");
		
		txtApellidos = new JTextField();
		Registro.add(txtApellidos, "cell 2 2,growx");
		txtApellidos.setColumns(10);
		
		passwordFieldRepetirContrasenya = new JPasswordField();
		Registro.add(passwordFieldRepetirContrasenya, "cell 2 3,growx");
		
		JLabel lblRepetirContrasenya = new JLabel("Repetir contrase??a");
		Registro.add(lblRepetirContrasenya, "flowx,cell 1 4,alignx trailing");
		
		passwordFieldContrasenya = new JPasswordField();
		Registro.add(passwordFieldContrasenya, "cell 2 4,growx");
		
		JLabel lblEmail = new JLabel("Email");
		Registro.add(lblEmail, "cell 1 5,alignx trailing");
		
		txtEmail = new JTextField();
		Registro.add(txtEmail, "cell 2 5,growx");
		txtEmail.setColumns(10);
		
		JLabel lblRol = new JLabel("Rol");
		Registro.add(lblRol, "cell 1 6,alignx trailing");
		
		comboBoxRol = new JComboBox<>();
		comboBoxRol.setModel(new DefaultComboBoxModel(Permisos.values()));
		Registro.add(comboBoxRol, "cell 2 6,growx");
		
		JButton btnRegistrarse = new JButton("Registrarse");
		Registro.add(btnRegistrarse, "cell 3 8");
	
		
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				String email = txtEmail.getText();
				String contrasenya = new String(passwordFieldContrasenya.getPassword());
				String repetirContrasenya = new String(passwordFieldRepetirContrasenya.getPassword());
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				
				Permisos rol = (Permisos) comboBoxRol.getSelectedItem();
				
				if (!contrasenya.equals(repetirContrasenya)) {
					JOptionPane.showMessageDialog(null, "Las contrase??as no son iguales.");
				
			} else if (!comprobarEmail(email)|| contrasenya.isBlank() || repetirContrasenya.isBlank() ||  nombre.isBlank() || apellidos.isBlank()) {
				JOptionPane.showMessageDialog(null, "Hay que completar todos los campos.");
			}
			else {
				Usuario persona = new Usuario( Base_de_Datos.consultar_Ultimo_Usuario(),  nombre,  apellidos,  rol,  email,  contrasenya);
			
				if (persona.registrado()) {
					JOptionPane.showMessageDialog(null, "El usuario esta registrado.");
				} else {
					if(	persona. registrarse()) {
						JOptionPane.showMessageDialog(null, "El usuario se ha registrado.");
						entrada.setSelectedIndex(0);
					}else {
						JOptionPane.showMessageDialog(null, "Fallo en el registro, hay algun campo vacio");
					}
					
				}
			}
				txtNombre.setText("");
				passwordFieldContrasenya.setText("");
				passwordFieldRepetirContrasenya.setText("");
				txtApellidos.setText("");
				txtEmail.setText("");
				comboBoxRol.setSelectedIndex(0);
				
}
		});
		Registro.add(btnRegistrarse, "cell 3 9");
		
		JLabel lblContrasenya = new JLabel("Contrase??a");
		Registro.add(lblContrasenya, "cell 1 3,alignx trailing");
	}
	
	/*Comprueba que el email es valido para el registro del usuario 
	 * Si es valido devuelve true 
	 * Sino devuelve false*/
	private static boolean comprobarEmail(String email) {
		Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        return mather.find();	
	}
	
}


