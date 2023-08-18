import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class ruletajankempo extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3, boton4;
    private JLabel label1, label2, label3, label4, label5;
    private int Ronda = 0, com = 0;
    Random D = new Random();
    private int bala = D.nextInt(6) + 1;

    // constructor
    public ruletajankempo() {
        setLayout(null);
        boton1 = new JButton("piedra");
        boton1.setBounds(10, 110, 90, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("papel");
        boton2.setBounds(110, 110, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("tijeras");
        boton3.setBounds(210, 110, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("salir");
        boton4.setBounds(210, 200, 90, 30);
        add(boton4);
        boton4.addActionListener(this);

        label1 = new JLabel("En espera1");
        label1.setBounds(10, 10, 300, 30);
        add(label1);

        label2 = new JLabel("En espera2");
        label2.setBounds(10, 40, 300, 30);
        add(label2);

        label3 = new JLabel("En espera3");
        label3.setBounds(10, 70, 300, 30);
        add(label3);

        label4 = new JLabel("Ronda: " + Ronda);
        label4.setBounds(250, 10, 300, 30);
        add(label4);

        label5 = new JLabel("Ganador: ");
        label5.setBounds(250, 40, 300, 30);
        add(label5);
    }

    // captura de eventos
    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == boton1) {
            com = D.nextInt(3) + 1;
            label1.setText("Has elegido piedra");
            if (com == 1) {
                label2.setText("Jugador COM ha elegido Piedra");
                label3.setText("Empate");
            }
            if (com == 2) {
                label2.setText("Jugador COM ha elegido Papel");
                label3.setText("Jugador COM Gana: ");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador 1 pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }
            if (com == 3) {
                label2.setText("Jugador COM ha elegido Tijeras");
                label3.setText("Jugador 1 gana: ");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador COM pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }

            label4.setText("Ronda: " + Ronda);
        }
        if (a.getSource() == boton2) {
            com = D.nextInt(3) + 1;
            label1.setText("Has elegido papel");
            if (com == 1) {
                label2.setText("Jugador COM ha elegido Piedra");
                label3.setText("Jugador 1 gana");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador COM pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }
            if (com == 2) {
                label2.setText("Jugador COM ha elegido Papel");
                label3.setText("Empate");
            }
            if (com == 3) {
                label2.setText("Jugador COM ha elegido Tijeras");
                label3.setText("Jugador COM Gana");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador 1 pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }

            label4.setText("Ronda: " + Ronda);
        }
        if (a.getSource() == boton3) {
            com = D.nextInt(3) + 1;
            label1.setText("Has elegido tijeras");
            if (com == 1) {
                label2.setText("Jugador COM ha elegido Piedra");
                label3.setText("Jugador COM Gana");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador 1 pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }
            if (com == 2) {
                label2.setText("Jugador COM ha elegido Papel");
                label3.setText("Jugador 1 gana");
                Ronda = Ronda + 1;
                if (bala == Ronda) {
                    label5.setText("bum, jugador COM pierde");
                    boton1.setVisible(false);
                    boton2.setVisible(false);
                    boton3.setVisible(false);
                }
            }
            if (com == 3) {
                label2.setText("Jugador COM ha elegido Tijeras");
                label3.setText("Empate");
            }

            label4.setText("Ronda: " + Ronda);
        }

        if (a.getSource() == boton4) {
            System.exit(0);
        }
    }

    public static void main(String args[]) {

        ruletajankempo b = new ruletajankempo();
        b.setBounds(0, 0, 500, 300);
        b.setVisible(true);
        b.setResizable(false);
        b.setLocationRelativeTo(null);

        /*
         * // ruleta rusa y piedra papel tijeras
         * Scanner teclado = new Scanner(System.in);
         * int Ronda = 0, bala = 0, com = 0, jug = 0, m = 0;
         * System.out.print("Ingrese Nombre del Jugador: ");
         * String jugador = teclado.nextLine();
         * 
         * // generar un numero al azar entre 1 y 6
         * Random D = new Random();
         * bala = D.nextInt(6) + 1;
         * // hacer un bulce para piedra papel tijeras de 6 rondas maximo
         * while (Ronda != bala) {
         * com = D.nextInt(3) + 1;
         * // jugador escoje 1 de 3 opcines
         * System.out.println("seleccione una de las siguientes opciones: ");
         * System.out.print("1 piedra, 2 papel, 3 tijeras: ");
         * jug = teclado.nextInt();
         * // condicional segun quien pierda
         * if (com == jug) {
         * System.out.println("empate");
         * } else if (com == 1 & jug == 2) {
         * System.out.println("Jugador COM eligio piedra");
         * System.out.println("Jugador COM dispara");
         * m = 1;
         * Ronda = Ronda + 1;
         * } else if (com == 1 & jug == 3) {
         * System.out.println("Jugador COM eligio piedra");
         * System.out.println("Jugador "+jugador+" dispara");
         * m = 2;
         * Ronda = Ronda + 1;
         * } else if (com == 2 & jug == 1) {
         * System.out.println("Jugador COM eligio papel");
         * System.out.println("Jugador "+jugador+" dispara");
         * m = 2;
         * Ronda = Ronda + 1;
         * } else if (com == 2 & jug == 3) {
         * System.out.println("Jugador COM eligio papel");
         * System.out.println("Jugador COM dispara");
         * m = 1;
         * Ronda = Ronda + 1;
         * } else if (com == 3 & jug == 1) {
         * System.out.println("Jugador COM eligio tijeras");
         * System.out.println("Jugador COM dispara");
         * m = 1;
         * Ronda = Ronda + 1;
         * } else if (com == 3 & jug == 2) {
         * System.out.println("Jugador COM eligio tijeras");
         * System.out.println("Jugador "+jugador+" dispara");
         * m = 2;
         * Ronda = Ronda + 1;
         * }
         * 
         * if(Ronda != bala){
         * System.out.println("Casquillo vacio");
         * }else{
         * System.out.println("Disparo");
         * }
         * }
         * if ( m == 1){
         * System.out.println ("Jugador COM muere, Felicidades");
         * } else if (m==2){
         * System.out.println("jugador "+ jugador + " muere, lo lamento, has perdido");
         * }
         * teclado.close();
         * 
         */ }
}