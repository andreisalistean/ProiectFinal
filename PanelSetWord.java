import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSetWord {
    private JPanel panel;
    private JTextField text;
    private JButton addWord;
    private JButton back;

    public PanelSetWord(){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        text=new JTextField();
        text.setBounds(90,30,200,30);
        panel.add(text);

        addWord=new JButton("ADD");
        addWord.setBounds(165,80,70,30);
        panel.add(addWord);

        back=new JButton("BACK");
        back.setBounds(280,330,100,20);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instance =SourcePanel.getinstance();
                instance.setPanel(1);
            }
        });
        panel.add(back);
    }

    public JPanel getPanel(){
        return this.panel;
    }

    public void refresh(){
        text.setText("");
    }

}
