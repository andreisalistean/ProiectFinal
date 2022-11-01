import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

interface Interface {
    public boolean checkUsername(JTextField text);
    //verifica daca campul username are introdus un nume(!=null)
    public boolean checkWord(JTextField text);
    //verifica cuvanrul introdus in fisier, trebuie sa aiba 5 litere, doar litere mari si !=null
    public void addWord(String word);
    //adauga cuvantul in fisier
    public String getFile();
    //returneaza fisierul in care sunt stocate cuvintele
    public Vector<Integer> checkGameWrd(ArrayList<JTextField> text);
    //1 - valid word
    //0 - invalid
}
