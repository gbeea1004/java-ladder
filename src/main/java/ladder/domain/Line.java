package ladder.domain;

import java.util.ArrayList;
import java.util.Random;

public class Line {
    private ArrayList<Boolean> points = new ArrayList<>();

    public Line(int countOfPerson) {       //생성자는 초기화 담당을 하는 것으로 알고 있는데, 이렇게 해도되는지..?
        for (int i = 0; i < countOfPerson - 1; i++) {
            points.add(createHLine());
            overlap(i);
        }
    }

    public Line(boolean[] personsTest){
        for (int i = 0; i < personsTest.length -1; i++) {
            points.add(personsTest[i]);
            overlap(i);
        }
    }

    private void overlap(int i) {
        if (i > 0) {
            overlapCheck(i);
        }
    }

    private boolean createHLine() {
        return new Random().nextBoolean();
    }

    private void overlapCheck(int index) {
        boolean preValue = points.get(index - 1);
        boolean currentValue = points.get(index);

        if (preValue == true && currentValue == true) {
            points.set(createHLine() ? index : index - 1, false);
        }
    }

    public boolean value(int index){
        return points.get(index);
    }
}
