package ladder;

public class LadderGameMain {
    public static void main(String[] args) {
        String[] persons = InputView.inputPerson().split(",");
        InputView.checkPersonName(persons);
        int radderH = InputView.inputRadderHeight();

        LadderGame gamePlay = new LadderGame();
        gamePlay.createRadder(persons.length, radderH);
        ResultView.print(gamePlay, persons, radderH);
    }


}
