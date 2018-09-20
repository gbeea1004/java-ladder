package Ladder;

public class ResultView {
    static final char HLINE = '-';
    static final char VLINE = '|';
    static final char NULL = ' ';

    public static void print(LadderGame game, int persons){
        for (int i = 0; i < game.list.size(); i++) {
            System.out.print(game.list.get(i));
            lineFeed(persons, i);
        }
    }

    private static void lineFeed(int persons, int i) {
        if((i + 1) % (persons * 2 - 1) == 0){
            System.out.println();
        }
    }
}
