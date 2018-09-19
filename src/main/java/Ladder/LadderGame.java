package Ladder;

import java.util.ArrayList;
import java.util.Random;

public class LadderGame {
    ArrayList<String> list = new ArrayList();

    public String createLine(){
        Random isLine = new Random();
        if(isLine.nextBoolean())
            return "-";
        else
            return " ";
    }

    public void createRadder(int persons, int radderH){
        for (int i = 0; i < radderH; i++) {
            listAdd(persons);
        }
    }

    private void listAdd(int persons) {
        for (int j = 0; j < persons; j++) {
            list.add("|");
            if(j == (persons - 1)){
                break;
            }
            list.add(createLine());
        }
    }
}
