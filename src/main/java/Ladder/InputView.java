package Ladder;

import java.util.Scanner;

public class InputView {
    static Scanner s = new Scanner(System.in);

    public static int inputPerson(){
        System.out.println("참여할 사람은 몇 명 인가요?");
        return s.nextInt();
    }

    public static int inputRadderHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return s.nextInt();
    }
}
