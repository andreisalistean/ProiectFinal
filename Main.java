import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       JFrame frame=new JFrame("Wordle");
       frame.setLocationRelativeTo(null);
       frame.setSize(500,400);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       PanelStart panel=new PanelStart();
       frame.add(panel.getPanel());

        frame.setVisible(true);
    }
}