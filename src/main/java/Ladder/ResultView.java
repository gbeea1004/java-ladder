package Ladder;

public class ResultView {
    public static void print(LadderGame game, int persons){
        for (int i = 0; i < game.list.size(); i++) {
            System.out.print(game.list.get(i));
            if((i + 1) % (persons * 2 - 1) == 0){
                System.out.println();
            }
        }
    }
}
