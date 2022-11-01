import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class PanelGame {
    SourcePanel sourcePanel = SourcePanel.getinstance();

    int i=0;
    private JPanel panel;
    private JButton[] butonAdd=new JButton[7];
    private JButton back;
    private JLabel raspuns;
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

        raspuns=new JLabel("");
        raspuns.setBounds(10,290,300,30);
        panel.add(raspuns);

        for(int i=0; i < 6; i++) {
            butonAdd[i] = new JButton("Add");
            butonAdd[i].setBounds(330, i*40+20, 50, 30);
            panel.add(butonAdd[i]);
        }
        back = new JButton("Back");
        back.setBounds(10,330,70,30);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SourcePanel instannce = SourcePanel.getinstance();
                instannce.setPanel(1);
                refreshGamePanelBack();
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

        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv1.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv1.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e1) {
                    if (cuv1.get(finalI).getText().length() >= 1) // limit to 1 character
                        e1.consume();
                }
            });
        }
        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv2.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv2.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e2) {
                    if (cuv2.get(finalI).getText().length() >= 1) // limit to 1 character
                        e2.consume();
                }
            });
        }
        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv3.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv3.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e3) {
                    if (cuv3.get(finalI).getText().length() >= 1) // limit to 1 character
                        e3.consume();
                }
            });
        }
        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv4.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv4.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e4) {
                    if (cuv4.get(finalI).getText().length() >= 1) // limit to 1 character
                        e4.consume();
                }
            });
        }
        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv5.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv5.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e5) {
                    if (cuv5.get(finalI).getText().length() >= 1) // limit to 1 character
                        e5.consume();
                }
            });
        }
        for(int i=0; i<=5; i++) {
            int finalI = i;
            cuv6.get(i).setHorizontalAlignment(JTextField.CENTER);
            cuv6.get(i).addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e6) {
                    if (cuv6.get(finalI).getText().length() >= 1) // limit to 1 character
                        e6.consume();
                }
            });
        }

        Misc misc = new Misc();
        try{
        misc.getRandomWordFromFile();
        }
        catch(IOException ioe){
            System.out.println("error");
        }
        butonAdd[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<Integer> position = misc.checkGameWrd(cuv1);
                int contor=0;
                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv1.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        cuv1.get(position.get(i) - 1).setBackground(Color.green);
                        contor++;
                    }

                }
                    for(int j = 0; j <=5; j++){
                        cuv1.get(j).setEditable(false);
                    }
                checkContor(contor);
            }
        });

        butonAdd[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<Integer> position = misc.checkGameWrd(cuv2);
                int contor=0;
                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv2.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        cuv2.get(position.get(i) - 1).setBackground(Color.green);
                        contor++;
                    }
                }
                    for(int j = 0; j <= 5; j++) {
                        cuv2.get(j).setEditable(false);
                    }
                checkContor(contor);
                }

            });

        butonAdd[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<Integer> position = misc.checkGameWrd(cuv3);
                int contor=0;
                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv3.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        cuv3.get(position.get(i) - 1).setBackground(Color.green);
                        contor++;
                    }
                }
                for(int j = 0; j <= 5; j++) {
                    cuv3.get(j).setEditable(false);
                }
                checkContor(contor);

            }
            });

        butonAdd[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<Integer> position = misc.checkGameWrd(cuv4);
                int contor=0;
                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv4.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        cuv4.get(position.get(i) - 1).setBackground(Color.green);
                        contor++;
                    }
                }
                for(int j = 0; j <= 5; j++) {
                    cuv4.get(j).setEditable(false);
                }
                checkContor(contor);

            }
        });

        butonAdd[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int contor=0;
                    Vector<Integer> position = misc.checkGameWrd(cuv5);

                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv5.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        cuv5.get(position.get(i) - 1).setBackground(Color.green);
                        contor++;
                    }
                }
                for(int j = 0; j <= 5; j++) {
                    cuv5.get(j).setEditable(false);
                }
                checkContor(contor);

            }
        });

        butonAdd[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Vector<Integer> position = misc.checkGameWrd(cuv6);
                int contor=0;
                for(int i = 0; i< position.size(); i++){
                    if(position.get(i) < 0){
                        cuv6.get(-position.get(i) - 1).setBackground(Color.yellow);
                    }
                    else if(position.get(i)>0){
                        contor++;
                        cuv6.get(position.get(i) - 1).setBackground(Color.green);
                    }
                }

                for(int i=0;i<6;i++)
                {
                    cuv6.get(i).setEditable(false);
                }
                if(contor==6)
                    checkContor(contor);
                else {
                    SourcePanel instance =SourcePanel.getinstance();
                    instance.getPlayer().addGame();
                    setLabelWin();
                    refreshGamePanel();
                }
            }
        });



    }

    private void checkContor(int i){
        if(i==6){
            SourcePanel instance =SourcePanel.getinstance();
            instance.getPlayer().addGame();
            instance.getPlayer().addWin();
            setLabelWin();
            refreshGamePanel();
        }
    }

    private void setLabelWin(){
        SourcePanel instance=SourcePanel.getinstance();

        raspuns.setText(instance.getWord());
        raspuns.setForeground(Color.white);
    }
    public JPanel getPanel(){
        return this.panel;
    }



    private void setText(ArrayList<JTextField> text,int yHeight)
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

    public void refreshGamePanel(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }
        catch(Exception e){
            System.out.println("eroare");
        }
        for(int i=0;i<6;i++)
        {
            cuv6.get(i).setText("");
            cuv6.get(i).setBackground(Color.white);
            cuv6.get(i).setEditable(true);

            cuv1.get(i).setText("");
            cuv1.get(i).setBackground(Color.white);
            cuv1.get(i).setEditable(true);

            cuv2.get(i).setText("");
            cuv2.get(i).setBackground(Color.white);
            cuv2.get(i).setEditable(true);

            cuv3.get(i).setText("");
            cuv3.get(i).setBackground(Color.white);
            cuv3.get(i).setEditable(true);

            cuv4.get(i).setText("");
            cuv4.get(i).setBackground(Color.white);
            cuv4.get(i).setEditable(true);

            cuv5.get(i).setText("");
            cuv5.get(i).setBackground(Color.white);
            cuv5.get(i).setEditable(true);


        }
        try{
            new Misc().getRandomWordFromFile();
        }
        catch (Exception e){

        }

        //raspuns.setText("");
    }

    public void refreshGamePanelBack(){

        for(int i=0;i<6;i++)
        {
            cuv6.get(i).setText("");
            cuv6.get(i).setBackground(Color.white);
            cuv6.get(i).setEditable(true);

            cuv1.get(i).setText("");
            cuv1.get(i).setBackground(Color.white);
            cuv1.get(i).setEditable(true);

            cuv2.get(i).setText("");
            cuv2.get(i).setBackground(Color.white);
            cuv2.get(i).setEditable(true);

            cuv3.get(i).setText("");
            cuv3.get(i).setBackground(Color.white);
            cuv3.get(i).setEditable(true);

            cuv4.get(i).setText("");
            cuv4.get(i).setBackground(Color.white);
            cuv4.get(i).setEditable(true);

            cuv5.get(i).setText("");
            cuv5.get(i).setBackground(Color.white);
            cuv5.get(i).setEditable(true);


        }
        //raspuns.setText("");
    }
}
