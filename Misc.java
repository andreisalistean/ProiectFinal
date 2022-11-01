import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Vector;
import java.nio.file.Files;
import java.nio.file.Path;

public class Misc implements Interface {
    SourcePanel panel = SourcePanel.getinstance();
    @Override
    public boolean checkUsername(JTextField text) {
        if(text!=null)
            return true;
        return false;
    }

    @Override
    public boolean checkWord(JTextField text) {
        String aux = text.getText();
        if(aux.length() != 5)
            return false;
        return aux.equals(String.valueOf(text));
    }

    @Override
    public void addWord(String word) {
        File file = new File("Words.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        PrintWriter pr = null;
        try {
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);
            pr.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                pr.close();
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getFile() {
        return "Words.txt";
    }

    @Override
    public Vector<Integer> checkGameWrd(ArrayList<JTextField> text) {
        Vector<Integer> sol = new Vector<>();
        String cuvant = panel.getWord();
        for(int i= 0; i < 6; i++){
            String aux = (String.valueOf(text.get(i).getText())).toUpperCase();
            if(aux.isEmpty()){
                return null;
            }
            else {
                char aux1 = aux.charAt(0);
                char aux2 = cuvant.charAt(i);
                if(cuvant.contains(aux) && aux1 != aux2 ){
                    i++;
                    sol.add(-i);
                    i--;
                }
                else if(aux1==aux2){
                    i++;
                    sol.add(i);
                    i--;
                }
            }
        }

        return sol;
    }



    public void getRandomWordFromFile() throws IOException {
        //panel.setWord("Caine");

        String allWords = Files.readString(Path.of("Words.txt"));
        String[] data = allWords.split("\n");
        int aux = (int) Math.floor(Math.random()*(data.length+1));
        panel.setWord(data[aux]);
        System.out.println(data[aux]);
    }
}
