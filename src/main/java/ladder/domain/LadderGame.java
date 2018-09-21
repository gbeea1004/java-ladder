package ladder.domain;

import java.util.ArrayList;

public class LadderGame {
    ArrayList<Line> ladderParts = new ArrayList();

    public void createRadder(int persons, int radderH){
        for (int i = 0; i < radderH; i++) {
            ladderParts.add(new Line(persons));
        }
    }

    public boolean getLine(int x, int y) {
        return (boolean) ladderParts.get(x).getLine().get(y);
    }
}
