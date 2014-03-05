/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Victor
 */
public class VtanaAltas extends JFrame implements MouseListener {

    public static JTextField[] cajas = new JTextField[12];
    public static JTextField[] cajas2 = new JTextField[10];
    public static JButton[] botones = new JButton[3];
    public static JLabel[] label = new JLabel[4];
    public static JFrame ventana;
    public int cont = 2;
    public int cx = 23;
    public int cy=23;
    public int x=0;
    
   
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == botones[0]) {
            cont++;
            cajas[cont] = new JTextField();
            ventana.add(cajas[cont]);
            cajas[cont].setBounds(80, 110 + cx, 150, 30);
            cx += 23;
        }
       
        if (e.getSource() == botones[1]) {
            x++;
            cajas2[x] = new JTextField();
            ventana.add(cajas2[x]);
            cajas2[x].setBounds(350, 110 + cy, 150, 30);
            cy += 23;
        }
        
        if (e.getSource()==botones[2]){
            
        }
                   
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public VtanaAltas() {
        ventana = new JFrame("Altas De Contactos");
        ventana.setLayout(null);
        ventana.setSize(550, 400); //tamaño de mi ventana 
        ventana.setLocationRelativeTo(null); //centrar ventana 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// se cierra con x
        ventana.setVisible(true);

        label[0] = new JLabel();
        label[0].setText("Nombre: ");
        label[0].setBounds(20, 20, 100, 50);
        ventana.add(label[0]);

        cajas[0] = new JTextField();
        cajas[0].setBounds(80, 30, 280, 30);
        ventana.add(cajas[0]);

        label[1] = new JLabel();
        label[1].setText("Direccion: ");
        label[1].setBounds(20, 60, 700, 50);
        ventana.add(label[1]);

        cajas[1] = new JTextField();
        cajas[1].setBounds(80, 70, 280, 30);
        ventana.add(cajas[1]);

        label[2] = new JLabel();
        label[2].setText("Telefonos: ");
        label[2].setBounds(20, 100, 700, 50);
        ventana.add(label[2]);

        cajas[2] = new JTextField();
        cajas[2].setBounds(80, 110, 150, 30);
        ventana.add(cajas[2]);

        botones[0] = new JButton("+");
        botones[0].setBounds(230, 110, 40, 30);
        botones[0].addMouseListener(this);
        ventana.add(botones[0]);
        
        label[3] = new JLabel();
        label[3].setText("E-mail: ");
        label[3].setBounds(300, 100, 700, 50);
        ventana.add(label[3]);
        
        cajas2[0] = new JTextField();
        cajas2[0].setBounds(350, 110, 150, 30);
        ventana.add(cajas2[0]);

        botones[1] = new JButton("+");
        botones[1].setBounds(500, 110, 40, 30);
        botones[1].addMouseListener(this);
        ventana.add(botones[1]);
        
        botones[2] = new JButton("Guardar");
        botones[2].setBounds(450, 350, 90, 30);
        botones[2].addMouseListener(this);
        ventana.add(botones[2]);

    }
}
