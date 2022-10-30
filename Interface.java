import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

interface Interface {
    public boolean checkUsername(JTextField text);
    //verifica daca campul username are introdus un nume(!=null)
    public boolean checkWord(JTextField text);
    //verifica cuvanrul introdus in fisier, trebuie sa aiba 5 litere, doar litere mari si !=null
    public void addWord(String word);
    //adauga cuvantul in fisier
    public File getFile();
    //returneaza fisierul in care sunt stocate cuvintele
    public int checkGameWrd(ArrayList<JTextField> text);
    //returneza 1 daca s.a introdus un cuvant valid(5 litere)(un singur caractez in JTextField)
    //0 daca nu respecta cerintele de mai sus
    //2 daca s.a introdus cuvantul corect, cautat
}
