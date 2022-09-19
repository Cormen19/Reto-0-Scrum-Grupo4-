package reto0;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PlanoAlarmaCentro extends JFrame {

	private JPanel contentPane;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	int count4 = 0;
	int count5 = 0;
	int count6 = 0;
	int count7 = 0;
	int count8 = 0;
	int count9 = 0;
	int count10 = 0;
	int count11 = 0;
	int count12 = 0;
	int count13 = 0;
	int count14 = 0;
	int count15 = 0;
	int count16 = 0;
	int count17 = 0;
	int count18 = 0;
	int count19 = 0;
	int count20 = 0;
	int count21 = 0;
	int count22 = 0;
	int count23 = 0; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlanoAlarmaCentro frame = new PlanoAlarmaCentro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 	*Creamos y centramos el plano al centro
	 */
	public PlanoAlarmaCentro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count1==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn1.setBackground(Color.green);
                count1 = 2;   
            }
            else if(valor==2){
            	btn1.setBackground(Color.red);
                count1 = 1;
            }
        }
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count1==1){
                	btn1.setBackground(Color.green);
                     count1 = 2;
                }
                else if(count1==2){
                	btn1.setBackground(Color.red);
                     count1 = 1;
                }
                else {
                	
                }
			}
		});
		btn1.setBounds(31, 224, 18, 16);
		contentPane.add(btn1);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count2==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn2.setBackground(Color.green);
                count2 = 2; 
            }
            else if(valor==2){
            	btn2.setBackground(Color.red);
                count2 = 1; 
            }
        }
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count2==1){
                	btn2.setBackground(Color.green);
                     count2 = 2;
                }
                else if(count2==2){
                	btn2.setBackground(Color.red);
                     count2 = 1;
                }
                else {
                	
                }
			}
		});
		btn2.setBounds(126, 224, 18, 16);
		contentPane.add(btn2);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count3==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn3.setBackground(Color.green);
                count3 = 2;       
            }
            else if(valor==2){
            	btn3.setBackground(Color.red);
                count3 = 1;
            }
        }
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count3==1){
                	btn3.setBackground(Color.green);
                     count3 = 2;
                }
                else if(count3==2){
                	btn3.setBackground(Color.red);
                     count3 = 1;
                }
                else {
                	
                }
			}
		});
		btn3.setBounds(207, 224, 18, 16);
		contentPane.add(btn3);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count4==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn4.setBackground(Color.green);
                count4 = 2;  
            }
            else if(valor==2){
            	btn4.setBackground(Color.red);
                count4 = 1;
            }
        }
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count4==1){
                	btn4.setBackground(Color.green);
                     count4 = 2;
                }
                else if(count4==2){
                	btn4.setBackground(Color.red);
                     count4 = 1;
                }
                else {
                	
                }
			}
		});
		btn4.setBounds(312, 351, 18, 16);
		contentPane.add(btn4);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count5==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn5.setBackground(Color.green);
                count5 = 2; 
            }
            else if(valor==2){
            	btn5.setBackground(Color.red);
                count5 = 1;
            }
        }
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count5==1){
                	btn5.setBackground(Color.green);
                     count5 = 2;
                }
                else if(count5==2){
                	btn5.setBackground(Color.red);
                     count5 = 1;
                }
                else {
                	
                }
			}
		});
		btn5.setBounds(377, 351, 18, 16);
		contentPane.add(btn5);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count6==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn6.setBackground(Color.green);
                count6 = 2;
            }
            else if(valor==2){
            	btn6.setBackground(Color.red);
                count6 = 1;
            }
        }
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count6==1){
                	btn6.setBackground(Color.green);
                     count6 = 2;
                }
                else if(count6==2){
                	btn6.setBackground(Color.red);
                     count6 = 1;
                }
                else {
                	
                }
			}
		});
		btn6.setBounds(560, 351, 18, 16);
		contentPane.add(btn6);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count7==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn7.setBackground(Color.green);
                count7 = 2;   
            }
            else if(valor==2){
            	btn7.setBackground(Color.red);
                count7 = 1;
            }
        }
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count7==1){
                	btn7.setBackground(Color.green);
                     count7 = 2;
                }
                else if(count7==2){
                	btn7.setBackground(Color.red);
                     count7 = 1;
                }
                else {
                	
                }
			}
		});
		btn7.setBounds(312, 431, 18, 16);
		contentPane.add(btn7);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count8==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn8.setBackground(Color.green);
                count8 = 2;    
            }
            else if(valor==2){
            	btn8.setBackground(Color.red);
                count8 = 1;
            }
        }
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count8==1){
                	btn8.setBackground(Color.green);
                     count8 = 2;
                }
                else if(count8==2){
                	btn8.setBackground(Color.red);
                     count8 = 1;
                }
                else {
                	
                }
			}
		});
		btn8.setBounds(312, 511, 18, 16);
		contentPane.add(btn8);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count9==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn9.setBackground(Color.green);
                count9 = 2; 
            }
            else if(valor==2){
            	btn9.setBackground(Color.red);
                count9 = 1;
            }
        }
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count9==1){
                	btn9.setBackground(Color.green);
                     count9 = 2;
                }
                else if(count9==2){
                	btn9.setBackground(Color.red);
                     count9 = 1;
                }
                else {
                	
                }
			}
		});
		btn9.setBounds(299, 571, 18, 16);
		contentPane.add(btn9);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count10==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn10.setBackground(Color.green);
                count10 = 2;   
            }
            else if(valor==2){
            	btn10.setBackground(Color.red);
                count10 = 1;
            }
        }
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count10==1){
                	btn10.setBackground(Color.green);
                     count10 = 2;
                }
                else if(count10==2){
                	btn10.setBackground(Color.red);
                     count10 = 1;
                }
                else {
                	
                }
			}
		});
		btn10.setBounds(365, 559, 18, 16);
		contentPane.add(btn10);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count11==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn11.setBackground(Color.green);
                count11 = 2;
            }
            else if(valor==2){
            	btn11.setBackground(Color.red);
                count11 = 1;
            }
        }
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count11==1){
                	btn11.setBackground(Color.green);
                     count11 = 2;
                }
                else if(count11==2){
                	btn11.setBackground(Color.red);
                     count11 = 1;
                }
                else {
                	
                }
			}
		});
		btn11.setBounds(441, 571, 18, 16);
		contentPane.add(btn11);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count12==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn12.setBackground(Color.green);
                count12 = 2;
            }
            else if(valor==2){
            	btn12.setBackground(Color.red);
                count12 = 1;
            }
        }
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count12==1){
                	btn12.setBackground(Color.green);
                     count12 = 2;
                }
                else if(count11==2){
                	btn12.setBackground(Color.red);
                     count11 = 1;
                }
                else {
                	
                }
			}
		});
		btn12.setBounds(505, 571, 18, 16);
		contentPane.add(btn12);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn13 = new JButton("");
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count13==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn13.setBackground(Color.green);
                count13 = 2;   
            }
            else if(valor==2){
            	btn13.setBackground(Color.red);
                count13 = 1;
            }
        }
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count13==1){
                	btn13.setBackground(Color.green);
                     count13 = 2;
                }
                else if(count13==2){
                	btn13.setBackground(Color.red);
                     count13 = 1;
                }
                else {
                	
                }
			}
		});
		btn13.setBounds(560, 571, 18, 16);
		contentPane.add(btn13);

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn14 = new JButton("");
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count14==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn14.setBackground(Color.green);
                count14 = 2;      
            }
            else if(valor==2){
            	btn14.setBackground(Color.red);
                count14 = 1;
            }
        }
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count14==1){
                	btn14.setBackground(Color.green);
                     count14 = 2;
                }
                else if(count5==2){
                	btn14.setBackground(Color.red);
                     count14 = 1;
                }
                else {
                	
                }
			}
		});
		btn14.setBounds(636, 571, 18, 16);
		contentPane.add(btn14);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn15 = new JButton("");
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count15==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn15.setBackground(Color.green);
                count15 = 2;   
            }
            else if(valor==2){
            	btn15.setBackground(Color.red);
                count15 = 1;
            }
        }
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count15==1){
                	btn15.setBackground(Color.green);
                     count15 = 2;
                }
                else if(count15==2){
                	btn15.setBackground(Color.red);
                     count15 = 1;
                }
                else {
                	
                }
			}
		});
		btn15.setBounds(223, 450, 18, 16);
		contentPane.add(btn15);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn16 = new JButton("");
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count16==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn16.setBackground(Color.green);
                count16 = 2;      
            }
            else if(valor==2){
            	btn16.setBackground(Color.red);
                count16 = 1;
            }
        }
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count16==1){
                	btn16.setBackground(Color.green);
                     count16 = 2;
                }
                else if(count16==2){
                	btn16.setBackground(Color.red);
                     count16 = 1;
                }
                else {
                	
                }
			}
		});
		btn16.setBounds(207, 597, 18, 16);
		contentPane.add(btn16);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn17 = new JButton("");
		btn17.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count17==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn17.setBackground(Color.green);
                count17 = 2;      
            }
            else if(valor==2){
            	btn17.setBackground(Color.red);
                count17 = 1;
            }
        }
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count17==1){
                	btn17.setBackground(Color.green);
                     count17 = 2;
                }
                else if(count17==2){
                	btn17.setBackground(Color.red);
                     count17 = 1;
                }
                else {
                	
                }
			}
		});
		btn17.setBounds(280, 668, 18, 16);
		contentPane.add(btn17);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn18 = new JButton("");
		btn18.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count18==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn18.setBackground(Color.green);
                count18 = 2; 
            }
            else if(valor==2){
            	btn18.setBackground(Color.red);
                count18 = 1;
            }
        }
		btn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count18==1){
                	btn18.setBackground(Color.green);
                     count18 = 2;
                }
                else if(count18==2){
                	btn18.setBackground(Color.red);
                     count18 = 1;
                }
                else {
                	
                }
			}
		});
		btn18.setBounds(365, 668, 18, 16);
		contentPane.add(btn18);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn19 = new JButton("");
		btn19.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count19==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn19.setBackground(Color.green);
                count19 = 2;
            }
            else if(valor==2){
            	btn19.setBackground(Color.red);
                count19 = 1;
            }
        }
		btn19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count19==1){
                	btn19.setBackground(Color.green);
                     count19 = 2;
                }
                else if(count19==2){
                	btn19.setBackground(Color.red);
                     count19 = 1;
                }
                else {
                	
                }
			}
		});
		btn19.setBounds(421, 668, 18, 16);
		contentPane.add(btn19);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count20==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn20.setBackground(Color.green);
                count20 = 2;
            }
            else if(valor==2){
            	btn20.setBackground(Color.red);
                count20 = 1;
            }
        }
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count20==1){
                	btn20.setBackground(Color.green);
                     count20 = 2;
                }
                else if(count20==2){
                	btn20.setBackground(Color.red);
                     count20 = 1;
                }
                else {
                	
                }
			}
		});
		btn20.setBounds(518, 668, 18, 16);
		contentPane.add(btn20);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JButton btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count21==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn21.setBackground(Color.green);
                count21 = 2;  
            }
            else if(valor==2){
            	btn21.setBackground(Color.red);
                count21 = 1;
            }
        }
		btn21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count21==1){
                	btn21.setBackground(Color.green);
                     count21 = 2;
                }
                else if(count21==2){
                	btn21.setBackground(Color.red);
                     count21 = 1;
                }
                else {
                	
                }
			}
		});
		btn21.setBounds(601, 668, 18, 16);
		contentPane.add(btn21);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count22==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn22.setBackground(Color.green);
                count22 = 2;    
            }
            else if(valor==2){
            	btn22.setBackground(Color.red);
                count22 = 1;
            }
        }
		btn22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count22==1){
                	btn22.setBackground(Color.green);
                     count22 = 2;
                }
                else if(count22==2){
                	btn22.setBackground(Color.red);
                     count22 = 1;
                }
                else {
                	
                }
			}
		});
		btn22.setBounds(663, 649, 18, 16);
		contentPane.add(btn22);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		JButton btn23 = new JButton("");
		btn23.setFont(new Font("Tahoma", Font.PLAIN, 8));
		if(count23==0){
            int valor = (int)(Math.random()*2+1);
            if(valor==1){
                btn23.setBackground(Color.green);
                count23 = 2; 
            }
            else if(valor==2){
            	btn23.setBackground(Color.red);
                count23 = 1;
            }
        }
		btn23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                if(count23==1){
                	btn23.setBackground(Color.green);
                     count23 = 2;
                }
                else if(count23==2){
                	btn23.setBackground(Color.red);
                     count23 = 1;
                }
                else {
                	
                }
			}
		});
		btn23.setBounds(126, 94, 18, 16);
		contentPane.add(btn23);
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PlanoAlarmaCentro.class.getResource("src\\reto0\\Imagenes\\PlanoCentro.png")));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setBounds(0, 0, 766, 725);
		contentPane.add(lblNewLabel);
		
	}
}