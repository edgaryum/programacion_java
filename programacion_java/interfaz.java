//librerias
import javax.swing.*;
import java.awt.event.*;
//clase publica
public class interfaz extends JFrame implements ActionListener{
    //botones
    private JButton boton1, boton2, boton3, boton4;
    //label de texto
    private JLabel label1;
    //constructor
    public interfaz(){
        setLayout(null);
        boton1 = new JButton("1");
        boton1.setBounds(10, 100,90, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(110, 100,90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(210, 100,90, 30);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("salir");
        boton4.setBounds(210, 200,90, 30);
        add(boton4);
        boton4.addActionListener(this);

        label1= new JLabel("En espera");
        label1.setBounds(10, 10, 300, 30);
        add(label1);
    }
//captura de eventos
public void actionPerformed(ActionEvent a){
    if(a.getSource() == boton1){
        label1.setText("Has presionado el boton 1");
    }
    if(a.getSource()== boton2){
        label1.setText("Has presionado el boton 2");
    }
    if(a.getSource()== boton3){
        label1.setText("Has presionado el boton 3");
    }
    if(a.getSource()== boton4){
        System.exit(0);
    }
}

//metodo main
public static void main (String args[]){
    interfaz b = new interfaz();
    b.setBounds(0,0,500,300);
    b.setVisible(true);
    b.setResizable(false);
    b.setLocationRelativeTo(null);

}
}


/*import javax.swing.*;
import java.awt.event.*;

public class interfaz extends JFrame implements ActionListener{

    JButton boton1;
    public interfaz(){
        setLayout(null);
        boton1 = new JButton("cerrar");
        boton1.setBounds(300, 250, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent evento){
     if(evento.getSource() == boton1){
        System.exit(0);
     }
    }
    public static void main (String args[]){
        interfaz a = new interfaz();
        a.setBounds(0,0,450,350);
        a.setVisible(true);
        a.setResizable(false);
        a.setLocationRelativeTo(null);
    }
}*/