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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtidUsuario;
	private JPasswordField passwordField;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JPasswordField passwordFieldContraseñaR;
	private JPasswordField passwordFieldRepetirContraseña;
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
		
		txtIdUsuario = new JTextField();
		Login.add(txtIdUsuario, "cell 2 1,growx");
		txtIdUsuario.setColumns(10);
		
		JLabel LabelContraseña = new JLabel("Contraseña:");
		Login.add(LabelContraseña, "cell 1 2,alignx trailing");
		
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
		
		JLabel lblUsuario = new JLabel("Usuario");
		Registro.add(lblUsuario, "cell 1 1,alignx trailing");
		
		txtidUsuario = new JTextField();
		Registro.add(txtidUsuario, "cell 2 1,growx");
		txtidUsuario.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña");
		Registro.add(lblContraseña, "cell 1 2,alignx trailing");
		
		passwordFieldContraseñaR = new JPasswordField();
		Registro.add(passwordFieldContraseñaR, "cell 2 2,growx");
		
		JLabel lblRepetirContraseña = new JLabel("Repetir contraseña");
		Registro.add(lblRepetirContraseña, "cell 1 3,alignx trailing");
		
		passwordFieldRepetirContraseña = new JPasswordField();
		Registro.add(passwordFieldRepetirContraseña, "cell 2 3,growx");
		
		JLabel lblNombre = new JLabel("Nombre");
		Registro.add(lblNombre, "cell 1 4,alignx trailing");
		
		txtNombre = new JTextField();
		Registro.add(txtNombre, "cell 2 4,growx");
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos");
		Registro.add(lblApellido, "cell 1 5,alignx trailing");
		
		txtApellidos = new JTextField();
		Registro.add(txtApellidos, "cell 2 5,growx");
		txtApellidos.setColumns(10);
		
		JLabel lblFuncion = new JLabel("Funcion");
		Registro.add(lblFuncion, "cell 1 6,alignx trailing");
		
		JComboBox comboBoxErregistroFuncion = new JComboBox();
		comboBoxErregistroFuncion.setModel(new DefaultComboBoxModel(Permisos.values()));
		Registro.add(comboBoxErregistroFuncion, "cell 2 6,growx");
		
		JButton btnRegistrarse = new JButton("Registrarse");
		Registro.add(btnRegistrarse, "cell 3 8");
	
		
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		
				String usuario = txtidUsuario.getText();
				String contraseña = new String(passwordFieldContraseñaR.getPassword());
				String repetirContraseña = new String(passwordFieldRepetirContraseña.getPassword());
				String nombre = txtNombre.getText();
				String apellidos = txtApellidos.getText();
				Permisos funcion = (Permisos) comboBoxErregistroFuncion.getSelectedItem();
				
				if (!contraseña.equals(repetirContraseña)) {
					JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales.");
				
			} else if (usuario.isBlank() || contraseña.isBlank() || repetirContraseña.isBlank() ||  nombre.isBlank() || apellidos.isBlank()) {
				JOptionPane.showMessageDialog(null, "Hay que completar todos los campos.");
			}
			else {
				Usuario persona = new Usuario();
				persona.setIdUsuario(usuario);
				persona.setContraseña(contraseña);
				persona.setNombre(nombre);
				persona.setApellidos(apellidos);
				persona.setFuncion(funcion);
				if (persona.registrado()) {
					JOptionPane.showMessageDialog(null, "El usuario esta registrado.");
				} else {
					JOptionPane.showMessageDialog(null, "El usuario se ha registrado.");
					persona.registrarse();
					entrada.setSelectedIndex(0);
				}
			}
				txtidUsuario.setText("");
				passwordFieldContraseñaR.setText("");
				passwordFieldRepetirContraseña.setText("");
				txtNombre.setText("");
				txtApellidos.setText("");
				comboBoxErregistroFuncion.setSelectedIndex(0);
				
}
		});
		
		Registro.add(btnRegistrarse, "cell 3 9");
	}
	
		
	}

