import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class SourcePanel {
    private static SourcePanel instance;

    private String word;
    //private File file;
    private Player  player;
    private JFrame frame;

    private JPanel PanelStart;//1
    private JPanel PanelGame;//4
    private JPanel PanelCredits;//3
    private JPanel PanelSetWord;//2


    private SourcePanel(){

    }

    public static SourcePanel getinstance(){
        if(instance==null)
            instance=new SourcePanel();
        return instance;
    }

    public void setFrame(JFrame frame){
        this.frame=frame;
    }

    public void setPanelGame(JPanel PanelGame){
        this.PanelGame=PanelGame;
    }

    public void setPanelCredits(JPanel PanelCredits){
        this.PanelCredits=PanelCredits;
    }

    public void setPanelStart(JPanel PanelStart){
        this.PanelStart=PanelStart;
    }

    public void setPanelSetWord(JPanel PanelSetWord){
        this.PanelSetWord=PanelSetWord;
    }
    public void setPlayer(Player player){
        this.player= player;
    }

    public JFrame getFrame(){
        return frame;
    }

    public JPanel getPanelStart(){
        return PanelStart;
    }

    public JPanel getPanelGame(){
        return PanelGame;
    }

    public JPanel getPanelCredits(){
        return PanelCredits;
    }


    public JPanel getPanelSetWord(){
        return  PanelSetWord;
    }

    public Player getPlayer(){
        return player;
    }

    public void setWord(String word){
        this.word = word;
    }

    public String getWord(){
        return word;
    }

    public void setPanel(int i){
        if(i==1)
        {
            PanelCredits.setVisible(false);
            PanelGame.setVisible(false);
            PanelSetWord.setVisible(false);

            frame.remove(PanelCredits);
            frame.remove(PanelSetWord);
            frame.remove(PanelGame);

            frame.add(PanelStart);
            PanelStart.setVisible(true);
        }
        else {
            if(i==2)
            {
                PanelStart.setVisible(false);
                PanelGame.setVisible(false);
                PanelCredits.setVisible(false);

                frame.remove(PanelStart);
                frame.remove(PanelCredits);
                frame.remove(PanelGame);

                frame.add(PanelSetWord);
                PanelSetWord.setVisible(true);
            }
            else{
                if(i==3)
                {
                    PanelStart.setVisible(false);
                    PanelGame.setVisible(false);
                    PanelSetWord.setVisible(false);

                    frame.remove(PanelStart);
                    frame.remove(PanelSetWord);
                    frame.remove(PanelGame);

                    frame.add(PanelCredits);
                    PanelCredits.setVisible(true);
                }
                else{
                    if(i==4)
                    {
                        PanelStart.setVisible(false);
                        PanelCredits.setVisible(false);
                        PanelSetWord.setVisible(false);

                        frame.remove(PanelStart);
                        frame.remove(PanelSetWord);
                        frame.remove(PanelCredits);

                        frame.add(PanelGame);
                        PanelGame.setVisible(true);
                    }
                }
            }
        }
    }
}
