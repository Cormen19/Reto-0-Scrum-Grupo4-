import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreUsuario;
	private JPasswordField passwordField;
	private JComboBox comboBoxEgunAutaketa;

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
		Login.setLayout(new MigLayout("", "[grow][right][grow,left][grow]", "[grow][][][grow][]"));
		
		JLabel NombreUsuario = new JLabel("Usuario:");
		Login.add(NombreUsuario, "cell 1 1,alignx trailing");
		
		txtNombreUsuario = new JTextField();
		Login.add(txtNombreUsuario, "cell 2 1,growx");
		txtNombreUsuario.setColumns(10);
		
		JLabel LabelContraseña = new JLabel("Contraseña:");
		Login.add(LabelContraseña, "cell 1 2,alignx trailing");
		
		passwordField = new JPasswordField();
		Login.add(passwordField, "cell 2 2,growx");
		
		JPanel Registro = new JPanel();
		entrada.addTab("Registro", null, Registro, null);
		Registro.setLayout(new MigLayout("", "[grow][right][left][grow]", "[][][][][][][][]"));
		
		JComboBox comboBoxErregistroFuntzioak = new JComboBox();
		comboBoxErregistroFuntzioak.setModel(new DefaultComboBoxModel(Permisos.values()));
		Registro.add(comboBoxErregistroFuntzioak, "cell 2 7,growx");
	}

} 

