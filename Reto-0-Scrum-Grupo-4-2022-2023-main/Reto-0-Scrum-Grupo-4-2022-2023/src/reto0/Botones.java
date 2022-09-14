package reto0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botones extends JFrame{

    private JPanel contentPane;
    private static JButton Boton;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
                    Botones frame = new Botones();
                    frame.setVisible(true);
        
    }

    /**
     * Create the frame.
     */
    public Botones() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        Boton = new JButton("");
        Boton.setBounds(161, 101, 89, 23);
        contentPane.add(Boton);

        

        
        Boton.setBackground(Color.RED);
    
    Boton.addActionListener(new ActionListener(){
        int count = 1;
            public void actionPerformed (ActionEvent e) {

                if(count==1){
                    Boton.setBackground(Color.green);
                     count = 2;
                }
                else if(count==2){
                    Boton.setBackground(Color.red);
                     count = 1;
                }
              }
        
    });
    
}}
