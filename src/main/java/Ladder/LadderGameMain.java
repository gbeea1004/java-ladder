package Ladder;

public class LadderGameMain {
    public static void main(String[] args) {
        int persons = InputView.inputPerson();
        int radderH = InputView.inputRadderHeight();

        LadderGame gamePlay = new LadderGame();
        gamePlay.createRadder(persons, radderH);
        ResultView.print(gamePlay, persons);
    }
}
