package dominik;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Register extends JFrame{

    private final Login login;

    public Register(Login login){
    this.login = login;
    initComponents();
    //setLocationRelativeTo(null);
    }

    private static JTextField firstnameText;
    private static JPasswordField passwordText;
    private static JFrame frame;
    private static JLabel registersuccess;
    private static JTextField usernametext;
    private static JTextField emailtext;
    private static JTextField repasswordText;
    private static JTextField secondnameText;


    private void initComponents(){


        frame = new JFrame();
        frame.setSize(350, 350);
      //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// bez tego program się nie zamknie
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);

        JLabel firstnamelabel = new JLabel("Imię:");
        firstnamelabel.setBounds(10, 20, 80, 25);
        panel.add(firstnamelabel);

        firstnameText = new JTextField(20); // pole wpisywania
        firstnameText.setBounds(100, 20, 165, 25); // xy to odstęp od krawędzi
        panel.add(firstnameText);

        JLabel secondnamelabel = new JLabel("Nazwisko:");
        secondnamelabel.setBounds(10, 55, 80, 25);
        panel.add(secondnamelabel);

        secondnameText = new JTextField(20); // pole wpisywania
        secondnameText.setBounds(100, 55, 165, 25); // xy to odstęp od krawędzi
        panel.add(secondnameText);

        JLabel username = new JLabel("Login:");
        username.setBounds(10, 90, 80, 25);
        panel.add(username);


        usernametext = new JTextField(20); // pole wpisywania
        usernametext.setBounds(100, 90, 165, 25); // xy to odstęp od krawędzi
        panel.add(usernametext);

        JLabel email = new JLabel("E-mail:");
        email.setBounds(10, 125, 80, 25);
        panel.add(email);

        emailtext = new JTextField(20); // pole wpisywania
        emailtext.setBounds(100, 125, 165, 25); // xy to odstęp od krawędzi
        panel.add(emailtext);

        JLabel passwordlabel = new JLabel("Hasło:");
        passwordlabel.setBounds(10, 160, 80, 25);
        panel.add(passwordlabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 160, 165, 25);
        panel.add(passwordText);

        JLabel repasswordlabel = new JLabel("Powtórz hasło:");
        repasswordlabel.setBounds(10,195,80,25);
        panel.add(repasswordlabel);

        repasswordText = new JPasswordField(20);
        repasswordText.setBounds(100,195,165,25);
        panel.add(repasswordText);


        JButton button = new JButton("Zarejestruj");
        button.setBounds(100, 230, 80, 20);

        panel.add(button);

        registersuccess = new JLabel("");
        registersuccess.setBounds(10, 265, 200, 20);
        panel.add(registersuccess);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonActionPerformed(e);
            }
        });

    }

    private void buttonActionPerformed(ActionEvent e){
        String firstname = firstnameText.getText();
        String secondname = secondnameText.getText();
        String username = usernametext.getText();
        String email = emailtext.getText();
        String password = passwordText.getText();
        String repassword = repasswordText.getText();
        if (repassword.equals(password)){
            registersuccess.setText("możesz się teraz zalogować");



        }
        else
        {
            registersuccess.setText("spróbuj jeszcze raz");
        }

    }}