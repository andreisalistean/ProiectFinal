import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelCredits {
    private JPanel panel;
    private JLabel me;
    private JLabel beVali;//ceva imi zice ca nu o sa vezi asta
    private JLabel site;
    private JLabel git;
    private JButton buton;

    public PanelCredits(){
        panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        me=new JLabel("Salistean Andrei");
        me.setBounds(20,20,200,30);
        me.setForeground(Color.BLACK);
        panel.add(me);

        beVali=new JLabel("Moldovan Valentin");
        beVali.setBounds(20,70,200,30);
        beVali.setForeground(Color.BLACK);
        panel.add(beVali);

        site=new JLabel("https://www.nytimes.com/games/wordle/index.html");
        site.setBounds(20,120,350,30);
        site.setForeground(Color.BLACK);
        panel.add(site);

        git=new JLabel("https://github.com/andreisalistean/ProiectFinal");
        git.setBounds(20,170,350, 30);
        git.setForeground(Color.BLACK);
        panel.add(git);

        buton =new JButton("BACK");
        buton.setBounds(280,330,100,20);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instance=SourcePanel.getinstance();
                instance.setPanel(1);
            }
        });
        panel.add(buton);

    }

    public JPanel getPanel(){
        return panel;
    }


}
