package ladder;

import ladder.domain.LadderGame;
import ladder.view.InputView;
import ladder.view.ResultView;

public class LadderGameMain {
    public static void main(String[] args) {
        String[] persons = InputView.inputPerson();
        String[] results = InputView.inputResult(persons);
        int ladderH = InputView.inputRadderHeight();

        LadderGame gamePlay = new LadderGame();
        gamePlay.createRadder(persons.length, ladderH);
        ResultView.print(gamePlay, persons, ladderH, results);
        while (true){
            ResultView.resultName(InputView.resultNameView(persons, gamePlay, results));
        }
    }
}