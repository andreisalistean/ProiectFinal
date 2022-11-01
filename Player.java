public class Player {
    private int nrTotalGames;
    private int wins;
    private String username;

    public Player(){
        nrTotalGames=0;
        wins=0;
        username="";
    }

    public Player(String username){
        nrTotalGames=0;
        wins=0;
        this.username=username;
    }

    public void addGame(){
        nrTotalGames++;
    }

    public void addWin(){
        wins++;
    }

    public String toString(){
        String msg=username+" "+wins+"/"+nrTotalGames;
        return msg;
    }
}
