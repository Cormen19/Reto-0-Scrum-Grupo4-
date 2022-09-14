package reto0;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;

public class PlanoCentro extends JFrame {
	
	private JPanel contentPane;
	private static JButton Boton1;
	private static JLabel PlanoCentro;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanoCentro frame = new PlanoCentro();
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
	public PlanoCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Boton1 = new JButton("");
		Boton1.setForeground(new Color(0, 0, 0));
		Boton1.setBackground(new Color(255,0,0));
		Boton1.setBounds(62, 292, 19, 19);
		
		contentPane.add(Boton1);
		
		PlanoCentro = new JLabel("");
		PlanoCentro.setIcon(new ImageIcon("C:\\Users\\in2dm3\\Desktop\\Retos\\Reto-0-Scrum-Grupo4-\\Reto-0-Scrum-Grupo-4-2022-2023-main\\Reto-0-Scrum-Grupo-4-2022-2023\\src\\reto0\\Imagenes\\PlanoCentro.png"));
		PlanoCentro.setBounds(0, 0, 753, 734);
		contentPane.add(PlanoCentro);
	
	Boton1.addActionListener(new ActionListener(){
        int count = 1;
            public void actionPerformed (ActionEvent e) {

                if(count==1){
                    Boton1.setBackground(Color.green);
                     count = 2;
                }
                else if(count==2){
                    Boton1.setBackground(Color.red);
                     count = 1;
                }
              }
        
    });
}}
