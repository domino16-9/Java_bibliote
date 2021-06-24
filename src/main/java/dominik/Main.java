package dominik;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JTable;

import static java.awt.Font.BOLD;

public class Main extends JFrame {

    private final Login login;

    public Main(Login login) {
        this.login = login;
        initComponents();
        //setLocationRelativeTo(null);
    }

    private static JTextField tytultext;
    private static JTextField autortext;
    private static JTextField isbntext;
    private static JTextField descriptiontext;
    private static JLabel dodano;
    private static JPanel panel;
    private static PrintWriter zapis;



    private void initComponents() {
        JFrame frame = new JFrame();
        frame.setSize(1000, 700);
        //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// bez tego program się nie zamknie
        panel = new JPanel();
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);
        //JLabel userlabel = new JLabel();
        //userlabel.setFont(new Font("arial",BOLD,30));
      //  userlabel.setBounds(200, 20, 140, 30);
       // panel.add(userlabel);

        JLabel header = new JLabel("DODAJ NOWĄ KSIĄŻKE");
        header.setFont(new Font("Arial",Font.BOLD,25));
        header.setBounds(350, 20, 500, 60);
        panel.add(header);

        JLabel tytul = new JLabel("Tytuł");
        tytul.setBounds(100,100,100,40);
        panel.add(tytul);

        tytultext = new JTextField(100); // pole wpisywania
        tytultext.setBounds(200, 100, 200, 40); // xy to odstęp od krawędzi
        panel.add(tytultext);

        JLabel autor = new JLabel("Autor");
        autor.setBounds(560, 100, 100, 40);
        panel.add(autor);

        autortext = new JTextField(100); // pole wpisywania
        autortext.setBounds(660, 100, 200, 40); // xy to odstęp od krawędzi
        panel.add(autortext);

        JLabel isbn = new JLabel("isbn");
        isbn.setBounds(100, 150, 100, 40);
        panel.add(isbn);

        isbntext = new JTextField(100); // pole wpisywania
        isbntext.setBounds(200, 150, 200, 40); // xy to odstęp od krawędzi
        panel.add(isbntext);

        JLabel description = new JLabel("opis książki");
        description.setBounds(560, 150, 100, 40);
        panel.add(description);

        descriptiontext = new JTextField(100); // pole wpisywania
        descriptiontext.setBounds(660, 150, 200, 40); // xy to odstęp od krawędzi
        panel.add(descriptiontext);

        JButton button = new JButton("Dodaj Książke");
        button.setBounds(425, 230, 150, 50);
        panel.add(button);

        dodano = new JLabel("DODAJ NOWĄ KSIĄŻKE");
        dodano.setFont(new Font("Arial",Font.BOLD,25));
        dodano.setBounds(350, 500, 500, 60);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                buttonActionPerformed(ev);
            }
        });

    }
    private void buttonActionPerformed(ActionEvent ev) {
        String autor = autortext.getText();
        String tytul =tytultext.getText();
        String isbn = isbntext.getText();
        String description = descriptiontext.getText();
        PrintWriter zapis = null;     //zapis do pliku
        try {
            zapis = new PrintWriter("books.txt");

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
            zapis.println("pozycja"+1+ autor + "," + tytul + "," + isbn + "," + description);
        zapis.close();


       System.out.println(autor);

    }

    }