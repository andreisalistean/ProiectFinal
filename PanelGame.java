import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PanelGame {
    int i=0;
    private JPanel panel;
    private JButton[] butonAdd=new JButton[7];
    private JButton back;
    private JTextField text;
    private ArrayList<JTextField> cuv1=new ArrayList<JTextField>();
    private ArrayList<JTextField> cuv2=new ArrayList<JTextField>();
    private ArrayList<JTextField> cuv3=new ArrayList<JTextField>();
    private ArrayList<JTextField> cuv4=new ArrayList<JTextField>();
    private ArrayList<JTextField> cuv5=new ArrayList<JTextField>();
    private ArrayList<JTextField> cuv6=new ArrayList<JTextField>();

    private final int  x=30;
    private final int y=30;
    //350

    public PanelGame(){
        panel=new JPanel() ;
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        back = new JButton("Back");
        back.setBounds(10,330,70,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instannce = SourcePanel.getinstance();
                instannce.setPanel(1);
                //JPanel z=instannce.getPanelStart();
            }
        });
        panel.add(back);

        setText(cuv1,20);
        setText(cuv2,60);
        setText(cuv3,100);
        setText(cuv4,140);
        setText(cuv5,180);
        setText(cuv6,220);


    }

    public JPanel getPanel(){
        return this.panel;
    }

    private void setText(ArrayList<JTextField>text,int yHeight)
    {
        int xLeft=30;

        for(int i=0;i<6;i++)
        {
            text.add(new JTextField());
            JTextField a=text.get(i);
            a.setBounds(xLeft,yHeight,x,y);

            panel.add(a);
            xLeft+=x+20;
        }
    }

    public void refresh(){

    }
}
