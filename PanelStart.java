import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStart {

    int contor=0;
    private JPanel panel;

    private JTextField textUsername;
    private JLabel label;
    private JButton butonStart;
    private JButton butonSetWord;
    private JButton butonCredits;
    private JList<Player> list ;
    private DefaultListModel<Player> model;

    public PanelStart(){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        list=new JList<Player>();
        model=new DefaultListModel<Player>();
        list.setModel(model);
        list.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                SourcePanel instance = SourcePanel.getinstance();
                instance.setPlayer(list.getSelectedValue());
                instance.setPanel(4);
                refresh();
            }
        });
        list.setBounds(200,15 ,180,300);
        panel.add(list);

        label=new JLabel();
        label.setText("Introdu username-ul");
        label.setForeground(Color.BLACK);
        label.setBounds(10,15,130,20);
        panel.add(label);

        textUsername=new JTextField();
        textUsername.setBounds(10,45,180,20);
        panel.add(textUsername);

        butonStart=new JButton("START");
        butonStart.setBounds(100,75,90,20);
        butonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if(checkText(textUsername))

                model.addElement(new Player(textUsername.getText()));
                SourcePanel instance =SourcePanel.getinstance();

                instance.setPlayer(model.getElementAt(contor));
                contor++;
                refresh();
                instance.setPanel(4);
            }
        });
        panel.add(butonStart);

        butonSetWord=new JButton();
        //butonSetWord.setVisible(false);
        butonSetWord.setBounds(0,330,50,30);
        butonSetWord.setOpaque(false);
        butonSetWord.setContentAreaFilled(false);
        butonSetWord.setBorderPainted(false);
        butonSetWord.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instance=SourcePanel.getinstance();
                instance.setPanel(2);
            }
        });
        panel.add(butonSetWord);

        butonCredits=new JButton("CREDITS");
        butonCredits.setBounds(280,330,100,20);
        butonCredits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instance=SourcePanel.getinstance();
                instance.setPanel(3);
            }
        });

        panel.add(butonCredits);

    }

    public JPanel getPanel(){
        return panel;
    }

    public void refresh(){
        textUsername.setText("");
    }
}
