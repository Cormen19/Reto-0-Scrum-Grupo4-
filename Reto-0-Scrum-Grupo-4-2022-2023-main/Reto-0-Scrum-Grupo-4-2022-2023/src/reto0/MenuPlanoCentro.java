package reto0;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/*Ventana que sirve para conectar el login con los planos de alarma de incendios y calefaccion*/
public class MenuPlanoCentro extends JFrame {

	private JPanel contentPane;
	private static JLabel lblPlanoCentro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MenuPlanoCentro frame = new MenuPlanoCentro();
		frame.setVisible(true);
			
	}

	/**
	 * Create the frame.
	 */
	public MenuPlanoCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Menu Principal");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblTitulo.setBounds(401, 24, 290, 44);
		contentPane.add(lblTitulo);
		
		JButton btnAlarmaDeIncendios = new JButton("Alarma de Incendios");
		btnAlarmaDeIncendios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PlanoAlarmasdeIncendios.main(null);
				dispose();
			}
		});
		btnAlarmaDeIncendios.setBounds(424, 140, 152, 34);
		contentPane.add(btnAlarmaDeIncendios);
		
		JButton btnCalefacion = new JButton("Calefacción");
		btnCalefacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlanoCentro.main(null);
				dispose();
			}
		});
		btnCalefacion.setBounds(424, 79, 152, 34);
		contentPane.add(btnCalefacion);
		
	
		
		lblPlanoCentro = new JLabel();
		lblPlanoCentro.setIcon(new ImageIcon("src\\reto0\\Imagenes\\PlanoCentro.png"));
		lblPlanoCentro.setBounds(0, 0, 753, 734);
		contentPane.add(lblPlanoCentro);
	
	}
}