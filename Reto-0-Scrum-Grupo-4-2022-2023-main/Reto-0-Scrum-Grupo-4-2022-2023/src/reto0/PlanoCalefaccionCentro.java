package reto0;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;

import java.awt.Font;

@SuppressWarnings("serial")
public class PlanoCalefaccionCentro extends JFrame {
	
	public JPanel contentPane;
	public static JButton Boton1;
	public static JButton Boton2;
	public static JLabel PlanoCentro;
	public static JButton Boton3;
	private static JButton Boton4;
	private static JButton Boton5;
	private static JButton Boton6;
	private static JButton Boton8;
	private static JButton Boton7;
	private static JButton Boton9;
	private static JButton Boton10;
	private static JButton Boton11;
	private static JButton Boton12;
	private static JButton Boton13;
	private static JButton Boton14;
	private static JButton Boton15;
	private static JButton Boton16;
	private static JButton Boton17;
	private static JButton Boton18;
	private static JButton Boton19;
	private static JButton Boton20;
	private static JButton Boton21;
	private static JButton Boton22;
	private static JButton Boton23;
	private ArrayList<JButton> Botones= new ArrayList<JButton>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PlanoCalefaccionCentro frame = new PlanoCalefaccionCentro();
		frame.setVisible(true);
	
	}

	/**
	 * Create the frame.
	 */
	public PlanoCalefaccionCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 841);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo ( null );
		setResizable(false);
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnAtás = new JButton("Menu Principal");
		
		btnAtás.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuPlanoCentro.main(null);
				dispose();
			}
		});
		btnAtás.setBounds(505, 106, 152, 40);
		contentPane.add(btnAtás);
		
		JButton btnApagar = new JButton("Apagar Todo");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean todosapagados= true;
				for(int i =0;i<Inicio.calefaccion.size();i++) {
					if(Inicio.calefaccion.get(i).isEncendido()) {
						todosapagados = false;
						Botones.get(i).setBackground(Color.red);
						Inicio.calefaccion.get(i).setEncendido(false);
					}
				}
				if(!todosapagados) {
					JOptionPane.showMessageDialog(null, "Ya se han  apagado todas  las alarmas");
					Calefaccion.actualizarEstadoTodo(false);
				}else {
					JOptionPane.showMessageDialog(null, "Ya estan apagadas las alarmas");
					
				}
			}
		});
		btnApagar.setBounds(505, 165, 152, 40);
		contentPane.add(btnApagar);
		
		

		
		JButton btnEncenderTodo = new JButton("Encender Todo");
		btnEncenderTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean todosencendidos= true;
				for(int i =0;i<Inicio.calefaccion.size();i++) {
					if(!Inicio.calefaccion.get(i).isEncendido()) {
						todosencendidos = false;
						Botones.get(i).setBackground(Color.green);
						Inicio.calefaccion.get(i).setEncendido(true);
					}
				}
				if(todosencendidos) {
					JOptionPane.showMessageDialog(null, "Ya estaban todas las alarmas encendidas");
				}else {
					JOptionPane.showMessageDialog(null, "Ya se han encendido todas las alarmas");
					Calefaccion.actualizarEstadoTodo(true);
				}
			}
		});
		btnEncenderTodo.setBounds(505, 228, 152, 40);
		contentPane.add(btnEncenderTodo);
		
		//Creamos todos los botones
		Boton3 = new JButton("");
		Boton3.setBackground(Color.RED);
		Boton3.setBounds(208, 344, 19, 19);
		contentPane.add(Boton3);
		
		Boton2 = new JButton("");
		Boton2.setBackground(Color.RED);
		Boton2.setBounds(135, 344, 19, 19);
		contentPane.add(Boton2);
		
		Boton1 = new JButton("");
		Boton1.setForeground(new Color(0, 0, 0));
		Boton1.setBackground(Color.RED);
		Boton1.setBounds(68, 370, 19, 19);
		
		contentPane.add(Boton1);
		//Añadimos un metodo para que cuando pulsamos en el boton cambie de color de rojo a verde o al reves 
		
		
		Boton4 = new JButton("");
		Boton4.setBackground(Color.RED);
		Boton4.setBounds(310, 435, 19, 19);
		contentPane.add(Boton4);
		
		Boton5 = new JButton("");
		Boton5.setBackground(Color.RED);
		Boton5.setBounds(310, 571, 19, 19);
		contentPane.add(Boton5);
		
		Boton6 = new JButton("");
		Boton6.setBackground(Color.RED);
		Boton6.setBounds(310, 521, 19, 19);
		contentPane.add(Boton6);
		
		Boton7 = new JButton("");
		Boton7.setBackground(Color.RED);
		Boton7.setBounds(356, 629, 19, 19);
		contentPane.add(Boton7);
		
		Boton8 = new JButton("");
		Boton8.setBackground(Color.RED);
		Boton8.setBounds(297, 629, 19, 19);
		contentPane.add(Boton8);
		
		Boton9 = new JButton("");
		Boton9.setBackground(Color.RED);
		Boton9.setBounds(440, 629, 19, 19);
		contentPane.add(Boton9);
		
		Boton10 = new JButton("");
		Boton10.setBackground(Color.RED);
		Boton10.setBounds(505, 629, 19, 19);
		contentPane.add(Boton10);
		
		Boton11 = new JButton("");
		Boton11.setBackground(Color.RED);
		Boton11.setBounds(561, 629, 19, 19);
		contentPane.add(Boton11);
		
		Boton12 = new JButton("");
		Boton12.setBackground(Color.RED);
		Boton12.setBounds(632, 640, 19, 19);
		contentPane.add(Boton12);
		
		Boton13 = new JButton("");
		Boton13.setBackground(Color.RED);
		Boton13.setBounds(655, 720, 19, 19);
		contentPane.add(Boton13);
		
		Boton14 = new JButton("");
		Boton14.setBackground(Color.RED);
		Boton14.setBounds(595, 731, 19, 19);
		contentPane.add(Boton14);
		
		Boton15 = new JButton("");
		Boton15.setBackground(Color.RED);
		Boton15.setBounds(521, 731, 19, 19);
		contentPane.add(Boton15);
		
		Boton16 = new JButton("");
		Boton16.setBackground(Color.RED);
		Boton16.setBounds(422, 731, 19, 19);
		contentPane.add(Boton16);
		
		Boton17 = new JButton("");
		Boton17.setBackground(Color.RED);
		Boton17.setBounds(356, 731, 19, 19);
		contentPane.add(Boton17);
		
		Boton18 = new JButton("");
		Boton18.setBackground(Color.RED);
		Boton18.setBounds(285, 731, 19, 19);
		contentPane.add(Boton18);
		
		Boton19 = new JButton("");
		Boton19.setBackground(Color.RED);
		Boton19.setBounds(208, 666, 19, 19);
		contentPane.add(Boton19);
		
		Boton20 = new JButton("");
		Boton20.setBackground(Color.RED);
		Boton20.setBounds(208, 521, 19, 19);
		contentPane.add(Boton20);
		
		Boton21 = new JButton("");
		Boton21.setBackground(Color.RED);
		Boton21.setBounds(521, 435, 19, 19);
		contentPane.add(Boton21);
		
		Boton22 = new JButton("");
		Boton22.setBackground(Color.RED);
		Boton22.setBounds(366, 435, 19, 19);
		contentPane.add(Boton22);
		
		Boton23 = new JButton("");
		Boton23.setBackground(Color.RED);
		Boton23.setBounds(115, 157, 19, 19);
		contentPane.add(Boton23);
		
		
			
		//Usamos una etiqueta y en ella ponemos la imagen del plano del centro
		PlanoCentro = new JLabel("");
		PlanoCentro.setIcon(new ImageIcon(PlanoAlarmaCentro.class.getResource("/reto0/Imagenes/PlanoCentro.png")));
		PlanoCentro.setBounds(0, 57, 753, 734);
		contentPane.add(PlanoCentro);
		
		//Ponemos un titulo al plano 
		JLabel TituloPlano = new JLabel("Plano calefaccion centro");
		TituloPlano.setFont(new Font("Tahoma", Font.PLAIN, 28));
		TituloPlano.setBounds(249, 11, 321, 57);
		contentPane.add(TituloPlano);
		
		Botones.add(Boton1);
		Botones.add(Boton2);
		Botones.add(Boton3);
		Botones.add(Boton4);
		Botones.add(Boton5);
		Botones.add(Boton6);
		Botones.add(Boton7);
		Botones.add(Boton8);
		Botones.add(Boton9);
		Botones.add(Boton10);
		Botones.add(Boton11);
		Botones.add(Boton12);
		Botones.add(Boton13);
		Botones.add(Boton14);
		Botones.add(Boton15);
		Botones.add(Boton16);
		Botones.add(Boton17);
		Botones.add(Boton18);
		Botones.add(Boton19);
		Botones.add(Boton20);
		Botones.add(Boton21);
		Botones.add(Boton22);
		Botones.add(Boton23);
		
		for(int i = 0 ; i<=Inicio.calefaccion.size()-1;i++) {
			final int indice = i;
			if(Inicio.calefaccion.get(i).isEncendido()) {
				Botones.get(i).setBackground(Color.green);
			}else {
				Botones.get(i).setBackground(Color.red);
			}
			Botones.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
	                if(Inicio.calefaccion.get(indice).isEncendido()){
	                	Botones.get(indice).setBackground(Color.red);
	                	Inicio.calefaccion.get(indice).setEncendido(false);
	                	Inicio.calefaccion.get(indice).actualizarEstado();
	                }
	                else {
	                	Botones.get(indice).setBackground(Color.green);	                
	                	Inicio.calefaccion.get(indice).setEncendido(true);
	                	Inicio.calefaccion.get(indice).actualizarEstado();
	                }
				}
			});
		}
		
	}	
}
