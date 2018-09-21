package ladder;

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

    public void overlap(int i) {
        if (i > 0) {
            overlapCheck(i);
        }
    }

    public boolean createHLine() {
        Random isLine = new Random();
        if (isLine.nextBoolean()) {
            return true;
        }
        return false;
    }

    public void overlapCheck(int index) {
        boolean preValue = points.get(index - 1);
        boolean currentValue = points.get(index);

        if (preValue == true && currentValue == true) {
            Random random = new Random();
            boolean randomDelete = random.nextBoolean();
            currentValueDelete(index, randomDelete);
            preValueDelete(index, randomDelete);
        }
    }

    public void preValueDelete(int index, boolean randomDelete) {
        if(randomDelete == false){
            points.set(index - 1, false);
        }
    }

    public void currentValueDelete(int index, boolean randomDelete) {
        if (randomDelete) {
            points.set(index, false);
        }
    }

    public ArrayList getLine(){
        return points;
    }
}
