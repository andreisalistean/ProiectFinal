import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart {

    private JPanel panel;

    private JTextField textUsername;
    private JLabel label;
    private JButton butonStart;
    private JButton butonSetWord;
    private JButton butyonCredits;
    private JList<Player> list ;
    private DefaultListModel<Player> model;

    public PanelStart(){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        label=new JLabel();
        label.setText("Introdu usernameul");
        label.setForeground(Color.BLACK);
        label.setBounds(10,15,130,20);
        panel.add(label);

        textUsername=new JTextField();
        textUsername.setBounds(10,45,190,20);
        panel.add(textUsername);

        butonStart=new JButton("START");
        butonStart.setBounds(100,75,100,20);
        panel.add(butonStart);

        butonSetWord=new JButton();
        //butonSetWord.setVisible(false);
        butonSetWord.setBounds(0,330,50,30);
        butonSetWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("dfb");
            }
        });

        butonSetWord.setOpaque(false);
        butonSetWord.setContentAreaFilled(false);
        butonSetWord.setBorderPainted(false);

        panel.add(butonSetWord);

    }

    public JPanel getPanel(){
        return panel;
    }
}
