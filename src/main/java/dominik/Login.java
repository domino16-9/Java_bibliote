package dominik;


import dominik.model.Userinfo;
import dominik.Register;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login extends JFrame {  //klasa się rozciąga

    public Login() {
        initComponents();


    }


    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JFrame frame;
    private static JLabel loginsuccess;

    private void initComponents() { //initComponents metoda do tworzenia interfejsu graficznego


        frame = new JFrame();
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// bez tego program się nie zamknie
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setLocationRelativeTo(null); //aby okno otwierało się na środku

        panel.setLayout(null);

        JLabel userlabel = new JLabel("User");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        userText = new JTextField(20); // pole wpisywania
        userText.setBounds(100, 20, 165, 25); // xy to odstęp od krawędzi
        panel.add(userText);


        JLabel passwordlabel = new JLabel("password");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("zaloguj");
        button.setBounds(100, 85, 120, 20);

        panel.add(button);

        JButton registerbutton = new JButton("zarejestruj się");
        registerbutton.setBounds(100, 110, 120, 20);
        panel.add(registerbutton);

        loginsuccess = new JLabel("");
        loginsuccess.setBounds(10, 140, 200, 20);
        panel.add(loginsuccess);



        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                buttonActionPerformed(ev);
            }
        });
        registerbutton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerbuttonActionPerformed(e);
            }
        }));

    }

    private void buttonActionPerformed(ActionEvent ev){
        File file = new File("user.txt"); //odczyt  z pliku
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {  // Dodawanie wyjątku FileNotFoundException wymagane do działania scannera
            e.printStackTrace();
        }
        String login = scanner.nextLine();
        String haslo = scanner.nextLine();


        String user = userText.getText(); // porównanie hasła i loginu
        String password = passwordText.getText();
        if (user.equals(login) && password.equals(haslo)) {
            // loginsuccess.setText("udało ci się zalogować");
            new Main(this).setVisible(true);
            frame.setVisible(false);
        } else {
            loginsuccess.setText("błędny login lub hasło");
        }

    }

    private void registerbuttonActionPerformed(ActionEvent e) {
        new Register(this).setVisible(true);
    }

}
