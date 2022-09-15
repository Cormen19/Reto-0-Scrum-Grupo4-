package reto0;
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
import reto0.Usuario.Permisos;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtNombre;
	private JPasswordField passwordField;
	private JTextField txtApellidos;
	private JTextField txtEmail;
	private JPasswordField passwordFieldContrasenya;
	private JPasswordField passwordFieldRepetirContrasenya;
	private JTextField txtIdUsuario;
	
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
		
		txtUsuario = new JTextField();
		Login.add(txtUsuario, "cell 2 1,growx");
		txtUsuario.setColumns(10);
		
		JLabel LabelContrasenya = new JLabel("Contraseña:");
		Login.add(LabelContrasenya, "cell 1 2,alignx trailing");
		
		passwordField = new JPasswordField();
		Login.add(passwordField, "cell 2 2,growx");
		
		JButton bntConfirmar = new JButton("Confirmar");
		bntConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		Login.add(bntConfirmar, "cell 4 4");
		
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
		
		JLabel lblRepetirContrasenya = new JLabel("Repetir contraseña");
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
		
		JComboBox comboBoxErregistroFuncion = new JComboBox();
		comboBoxErregistroFuncion.setModel(new DefaultComboBoxModel(Permisos.values()));
		Registro.add(comboBoxErregistroFuncion, "cell 2 6,growx");
		
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
				
				Permisos rol = (Permisos) comboBoxErregistroFuncion.getSelectedItem();
				
				if (!contrasenya.equals(repetirContrasenya)) {
					JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales.");
				
			} else if (email.isBlank() || contrasenya.isBlank() || repetirContrasenya.isBlank() ||  nombre.isBlank() || apellidos.isBlank()) {
				JOptionPane.showMessageDialog(null, "Hay que completar todos los campos.");
			}
			else {
				Usuario persona = new Usuario( Base_de_Datos.consultar_Ultimo_Usuario(),  nombre,  apellidos,  rol,  email,  contrasenya);
			
				if (persona.registrado()) {
					JOptionPane.showMessageDialog(null, "El usuario esta registrado.");
				} else {
					JOptionPane.showMessageDialog(null, "El usuario se ha registrado.");
					persona. registrarse();
					entrada.setSelectedIndex(0);
				}
			}
				txtUsuario.setText("");
				passwordFieldContrasenya.setText("");
				passwordFieldRepetirContrasenya.setText("");
				txtApellidos.setText("");
				txtEmail.setText("");
				comboBoxErregistroFuncion.setSelectedIndex(0);
				
}
		});
		Registro.add(btnRegistrarse, "cell 3 9");
		
		JLabel lblContrasenya = new JLabel("Contraseña");
		Registro.add(lblContrasenya, "cell 1 3,alignx trailing");
	}
	
		
	}

