package Ladder;

import java.util.ArrayList;
import java.util.Random;

public class LadderGame {
    ArrayList<Character> list = new ArrayList();

    public char createHLine(){
        Random isLine = new Random();
        if(isLine.nextBoolean()){
            return ResultView.HLINE;
        }
        return ResultView.NULL;
    }

    public void createRadder(int persons, int radderH){
        for (int i = 0; i < radderH; i++) {
            listAdd(persons);
        }
    }

    private void listAdd(int persons) {
        for (int j = 0; j < persons; j++) {
            list.add(ResultView.VLINE);
            if (lineComplete(persons, j)) break;
            list.add(createHLine());
        }
    }

    private boolean lineComplete(int persons, int j) {
        if(j == (persons - 1)){
            return true;
        }
        return false;
    }
}
