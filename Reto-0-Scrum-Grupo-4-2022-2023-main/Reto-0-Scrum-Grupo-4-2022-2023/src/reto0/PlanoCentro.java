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
import javax.swing.JTextField;
import java.awt.Font;

public class PlanoCentro extends JFrame {
	
	public JPanel contentPane;
	public static JButton Boton1;
	public static JButton Boton2;
	public static JLabel PlanoCentro;
	public JButton Boton3;
	private JButton Boton4;
	private JButton Boton5;
	private JButton Boton6;
	private JButton Boton8;
	private JButton Boton7;
	private JButton Boton9;
	private JButton Boton10;
	private JButton Boton11;
	private JButton Boton12;
	private JButton Boton13;
	private JButton Boton14;
	private JButton Boton15;
	private JButton Boton16;
	private JButton Boton17;
	private JButton Boton18;
	private JButton Boton19;
	private JButton Boton20;
	private JButton Boton21;
	private JButton Boton22;
	private JButton Boton23;
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
		setBounds(100, 100, 810, 841);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		Boton2.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton2.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton2.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		Boton3.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton3.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton3.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
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
		
		Boton3.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton3.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton3.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton4.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton4.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton4.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton5.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton5.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton5.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton6.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton6.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton6.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton7.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton7.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton7.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton8.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton8.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton8.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton9.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton9.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton9.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton10.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton10.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton10.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton11.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton11.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton11.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton12.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton12.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton12.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton13.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton13.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton13.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton14.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton14.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton14.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton15.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton15.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton15.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton16.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton16.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton16.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton17.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton17.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton17.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton18.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton18.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton18.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton19.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton19.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton19.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton20.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton20.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton20.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton21.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton21.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton21.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton22.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton22.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton22.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		Boton23.addActionListener(new ActionListener(){
	        int count = 1;
	            public void actionPerformed (ActionEvent e) {

	                if(count==1){
	                    Boton23.setBackground(Color.green);
	                     count = 2;
	                }
	                else if(count==2){
	                    Boton23.setBackground(Color.red);
	                     count = 1;
	                }
	              }
	        
	    });
		
		
		
			
		//Usamos una etiqueta y en ella ponemos la imagen del plano del centro
		PlanoCentro = new JLabel("");
		PlanoCentro.setIcon(new ImageIcon("src\\reto0\\Imagenes\\PlanoCentro.png"));
		PlanoCentro.setBounds(0, 57, 753, 734);
		contentPane.add(PlanoCentro);
		
		//Ponemos un titulo al plano 
		JLabel TituloPlano = new JLabel("Plano calefaccion centro");
		TituloPlano.setFont(new Font("Tahoma", Font.PLAIN, 28));
		TituloPlano.setBounds(249, 11, 321, 57);
		contentPane.add(TituloPlano);
}	
}
