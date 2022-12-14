package reto0;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Ventana que sirve para conectar el login con los planos de alarma de incendios y calefaccion*/
@SuppressWarnings("serial")
public class MenuPlanoCentro extends JFrame {

	private JPanel contentPane;
	@SuppressWarnings("unused")
	private static JLabel lblPlanoCentro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuPlanoCentro frame = new MenuPlanoCentro();
		frame.setVisible(true);
		Inicio.alarmadeIncendios = Base_de_Datos.cargarAlarmasdeIncendios();
		Inicio.calefaccion = Base_de_Datos.cargarCalefacion();
	}

	/**
	 * Create the frame.
	 */
	public MenuPlanoCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 360);
		setLocationRelativeTo ( null );
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Menu Principal");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblTitulo.setBounds(70, 25, 219, 44);
		contentPane.add(lblTitulo);
		
		JButton btnAlarmaDeIncendios = new JButton("Alarma de Incendios");
		btnAlarmaDeIncendios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanoAlarmaCentro.main(null);
				dispose();
			}
		});
		btnAlarmaDeIncendios.setBounds(88, 158, 152, 34);
		contentPane.add(btnAlarmaDeIncendios);
		
		JButton btnCalefacion = new JButton("Calefacción");
		btnCalefacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanoCalefaccionCentro.main(null);
				dispose();
			}
		});
		btnCalefacion.setBounds(88, 97, 152, 34);
		contentPane.add(btnCalefacion);
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBounds(88, 221, 152, 34);
		btnCerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(null);
				dispose();
			}
		});
		contentPane.add(btnCerrarSesion);
	
	}
}
