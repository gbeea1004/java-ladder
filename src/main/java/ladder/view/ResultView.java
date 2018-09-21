package ladder.view;

import ladder.domain.LadderGame;

public class ResultView {
    static final String HLINE = "-----";
    static final char VLINE = '|';
    static final String NULL = "     ";

    public static void print(LadderGame game, String[] persons, int ladderH){
        outputPersonNames(persons);
        for (int i = 0; i < ladderH; i++) {
            makeOneLine(game, persons.length, i);
        }
    }

    private static void outputPersonNames(String[] persons) {
        for (String person : persons) {
            System.out.printf("%5s ", person);
        }
        System.out.println();
    }

    private static void makeOneLine(LadderGame game, int persons, int i) {
        System.out.print(NULL);
        for (int j = 0; j < persons; j++) {
            System.out.print(VLINE);
            makeHLine(game, persons, i, j);
        }
        System.out.println();
    }

    private static void makeHLine(LadderGame game, int persons, int i, int j) {
        if(j < persons - 1){
            System.out.print(convertLine(game, i, j));
        }
    }

    private static String convertLine(LadderGame game, int i, int j) {
        if(game.getLine(i,j)){
            return HLINE;
        }
        return NULL;
    }
}
