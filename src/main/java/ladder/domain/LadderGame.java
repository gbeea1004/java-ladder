package ladder.domain;

import java.util.ArrayList;

public class LadderGame {
    ArrayList<Line> ladderParts = new ArrayList();

    public void createRadder(int persons, int radderH) {
        for (int i = 0; i < radderH; i++) {
            ladderParts.add(new Line(persons));
        }
    }

    public boolean getLine(int x, int y) {
        return ladderParts.get(x).getLine().get(y);
    }

    public String checkResult(int pos, String[] results) {
        for (int i = 0; i < ladderParts.size(); i++) {
            if (pos == 0 && ladderParts.get(i).getLine().get(0)) {
                pos++;
//                System.out.println("pos 1단계 : " + pos);
                continue;
            }

            if (pos > 0 && pos < results.length - 1 && ladderParts.get(i).getLine().get(pos - 1)) {
                pos--;
//                System.out.println("pos 2단계 : " + pos);
                continue;
            }

            if (pos > 0 && pos < results.length - 1 && ladderParts.get(i).getLine().get(pos)) {
                pos++;
//                System.out.println("pos 3단계 : " + pos);
                continue;
            }

            if (pos == results.length -1 && ladderParts.get(i).getLine().get(pos - 1)){
                pos--;
//                System.out.println("pos 4단계 : " + pos);
            }
        }
//        System.out.println("********pos : " + pos);
        return results[pos];
    }
}
