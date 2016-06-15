/**
 * Created by Nigel on 6/14/16.
 */
public class Board {
    int space;
    boolean passGo;

    public Board(int space, boolean passGo){
        this.passGo = false;
    }

    public int didPassGo(){
        if (passGo == true){
            return 200;
        }
        else{
            return 0;
        }
    }

}
