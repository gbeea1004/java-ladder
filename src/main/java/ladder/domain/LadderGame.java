package ladder.domain;

import java.util.ArrayList;

public class LadderGame {
    private ArrayList<Line> ladderParts = new ArrayList();

    public void createRadder(int persons, int radderH) {
        for (int i = 0; i < radderH; i++) {
            ladderParts.add(new Line(persons));
        }
    }

    public boolean getLinePiece(int x, int y) {
        return ladderParts.get(x).value(y);
    }

    public int getResultPos(int pos, String[] results) {
        for (int i = 0; i < ladderParts.size(); i++) {
            pos = posMove(pos, results, i);
        }
        return pos;
    }

    public int posMove(int pos, String[] results, int i) {
        if (pos == 0 && getLinePiece(i, 0)) {
            pos++;
            return pos;
        }

        if (pos > 0 && pos < results.length - 1 && getLinePiece(i, pos - 1)) {
            pos--;
            return pos;
        }

        if (pos > 0 && pos < results.length - 1 && getLinePiece(i, pos)) {
            pos++;
            return pos;
        }

        if (pos == results.length - 1 && getLinePiece(i, pos - 1)) {
            pos--;
        }
        return pos;
    }
}
