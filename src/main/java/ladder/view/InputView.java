package ladder.view;

import java.util.Scanner;

public class InputView {
    static final int PERSON_NAME_MAX = 5;
    static Scanner s = new Scanner(System.in);

    public static String[] inputPerson(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return checkPersonName(s.nextLine().split(","));
    }

    public static int inputRadderHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return s.nextInt();
    }

    public static String[] checkPersonName(String[] persons) {
        for (int i = 0; i < persons.length; i++) {
            i = personModified(persons, i);
        }
        return persons;
    }

    public static int personModified(String[] persons, int i) {
        if(persons[i].length() > PERSON_NAME_MAX){
            System.out.println("'" + persons[i] + "' 이름이 글자 범위를 초과했습니다. 바꾸실 이름을 입력해주세요.");
            persons[i] = persons[i].replaceFirst(persons[i], InputView.s.nextLine());
            i--;
        }
        return i;
    }
}
