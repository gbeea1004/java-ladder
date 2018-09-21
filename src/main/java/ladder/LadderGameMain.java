package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderGameMain {
    public static void main(String[] args) {
        String[] persons = InputView.inputPerson();
        int radderH = InputView.inputRadderHeight();

        LadderGame gamePlay = new LadderGame();
        gamePlay.createRadder(persons.length, radderH);
        ResultView.print(gamePlay, persons, radderH);
    }
}
