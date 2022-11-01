import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       JFrame frame=new JFrame("Wordle");
       frame.setLocationRelativeTo(null);
       frame.setSize(400,400);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



       SourcePanel panel=SourcePanel.getinstance();
       panel.setPanelStart(new PanelStart().getPanel());
       panel.setPanelCredits(new PanelCredits().getPanel());
       panel.setPanelSetWord(new PanelSetWord().getPanel());
       panel.setPanelGame(new PanelGame().getPanel());
       panel.setFrame(frame);

       panel.setPanel(1);

        frame.setVisible(true);
    }
}