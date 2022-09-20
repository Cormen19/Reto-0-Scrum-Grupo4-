package reto0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class PlanoAlarmaCentro extends JFrame {

	private JPanel contentPane;
	private ArrayList<JButton> Botones= new ArrayList<JButton>();
    private ArrayList<Boolean> encendido = new ArrayList<Boolean>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			PlanoAlarmaCentro frame = new PlanoAlarmaCentro();
			frame.setVisible(true);
	}
	
	/**
	 	*Creamos y centramos el plano al centro
	 */
	
	public PlanoAlarmaCentro() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 754);
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
		
		JButton btnApagar = new JButton("Apagar Todo");
		btnApagar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean todosapagados= true;
				for(int i =0;i<encendido.size();i++) {
					if(encendido.get(i)) {
						todosapagados = false;
						Botones.get(i).setBackground(Color.red);
						encendido.set(i, false);
					}
				}
				if(!todosapagados) {
					JOptionPane.showMessageDialog(null, "Ya se han  apagado todas  las alarmas");
					Base_de_Datos.EncenderoApagarTodo("alarma",false);
				}else {
					JOptionPane.showMessageDialog(null, "Ya estan apagadas las alarmas");
				}
			}
		});
		btnApagar.setBounds(502, 140, 152, 40);
		contentPane.add(btnApagar);
		
		JButton btnEncenderTodo = new JButton("Encender Todo");
		btnEncenderTodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				boolean todosencendidos= true;
				for(int i =0;i<encendido.size();i++) {
					if(!encendido.get(i)) {
						todosencendidos = false;
						Botones.get(i).setBackground(Color.green);
						encendido.set(i, true);
					}
				}
				if(todosencendidos) {
					JOptionPane.showMessageDialog(null, "Ya estaban todas las alarmas encendidas");
				}else {
					JOptionPane.showMessageDialog(null, "Ya se han encendido todas las alarmas");
					Base_de_Datos.EncenderoApagarTodo("alarma",true);
						
					
				
				}
			}
		});
		btnEncenderTodo.setBounds(502, 206, 152, 40);
		contentPane.add(btnEncenderTodo);
		btnAtás.setBounds(502, 70, 152, 40);
		contentPane.add(btnAtás);
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn1 = new JButton();
		btn1.setBounds(31, 224, 18, 16);
		contentPane.add(btn1);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn2 = new JButton();
		btn2.setBounds(126, 224, 18, 16);
		contentPane.add(btn2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn3 = new JButton();
		btn3.setBounds(207, 224, 18, 16);
		contentPane.add(btn3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn4 = new JButton();
		btn4.setBounds(312, 351, 18, 16);
		contentPane.add(btn4);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn5 = new JButton();
		btn5.setBounds(377, 351, 18, 16);
		contentPane.add(btn5);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn6 = new JButton();
		btn6.setBounds(560, 351, 18, 16);
		contentPane.add(btn6);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn7 = new JButton();
		btn7.setBounds(312, 431, 18, 16);
		contentPane.add(btn7);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn8 = new JButton();
		btn8.setBounds(312, 511, 18, 16);
		contentPane.add(btn8);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn9 = new JButton();
		btn9.setBounds(299, 571, 18, 16);
		contentPane.add(btn9);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn10 = new JButton();
		btn10.setBounds(365, 559, 18, 16);
		contentPane.add(btn10);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn11 = new JButton();
		btn11.setBounds(441, 571, 18, 16);
		contentPane.add(btn11);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn12 = new JButton();
		btn12.setBounds(505, 571, 18, 16);
		contentPane.add(btn12);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn13 = new JButton();
		btn13.setBounds(560, 571, 18, 16);
		contentPane.add(btn13);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn14 = new JButton();
		btn14.setBounds(636, 571, 18, 16);
		contentPane.add(btn14);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn15 = new JButton();
		btn15.setBounds(223, 450, 18, 16);
		contentPane.add(btn15);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn16 = new JButton();
		btn16.setBounds(207, 597, 18, 16);
		contentPane.add(btn16);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn17 = new JButton();
		btn17.setBounds(280, 668, 18, 16);
		contentPane.add(btn17);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn18 = new JButton();
		btn18.setBounds(365, 668, 18, 16);
		contentPane.add(btn18);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn19 = new JButton();
		btn19.setBounds(421, 668, 18, 16);
		contentPane.add(btn19);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn20 = new JButton();
		btn20.setBounds(518, 668, 18, 16);
		contentPane.add(btn20);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn21 = new JButton();
		btn21.setBounds(601, 668, 18, 16);
		contentPane.add(btn21);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn22 = new JButton();
		btn22.setBounds(663, 649, 18, 16);
		contentPane.add(btn22);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn23 = new JButton();
		btn23.setBounds(126, 94, 18, 16);
		contentPane.add(btn23);
		
 
		Botones.add(btn1);
		Botones.add(btn2);
		Botones.add(btn3);
		Botones.add(btn4);
		Botones.add(btn5);
		Botones.add(btn6);
		Botones.add(btn7);
		Botones.add(btn8);
		Botones.add(btn9);
		Botones.add(btn10);
		Botones.add(btn11);
		Botones.add(btn12);
		Botones.add(btn13);
		Botones.add(btn14);
		Botones.add(btn15);
		Botones.add(btn16);
		Botones.add(btn17);
		Botones.add(btn18);
		Botones.add(btn19);
		Botones.add(btn20);
		Botones.add(btn21);
		Botones.add(btn22);
		Botones.add(btn23);
		
		
		for(int i = 0 ; i<=Inicio.alarmadeIncendios.size()-1;i++) {
			encendido.add((Inicio.alarmadeIncendios.get(i)).getEncendido());
			if(encendido.get(i)) {
				Botones.get(i).setBackground(Color.green);
			}else {
				Botones.get(i).setBackground(Color.red);
			}
		}
		for(int i=0 ;i<=Botones.size()-1;i++) {
			final int indice = i;
			Botones.get(i).addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				
	                if(encendido.get(indice)){
	                	Botones.get(indice).setBackground(Color.red);
	                	encendido.set(indice, false);
	                	Base_de_Datos.CambioEstado("alarma",indice,false);
	                }
	                else {
	                	Botones.get(indice).setBackground(Color.green);	                
	                	encendido.set(indice, true);
	                	Base_de_Datos.CambioEstado("alarma",indice,true);
	             
	                }
				}
			});
		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblPlano = new JLabel();
		lblPlano.setIcon(new ImageIcon("src\\reto0\\Imagenes\\PlanoCentro.png"));
		lblPlano.setBackground(new Color(240, 240, 240));
		lblPlano.setBounds(0, 0, 766, 725);
		contentPane.add(lblPlano);
		
		
	}
}