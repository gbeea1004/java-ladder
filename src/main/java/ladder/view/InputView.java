package ladder.view;

import java.util.Scanner;

public class InputView {
    static final int PERSON_NAME_MAX = 5;
    static Scanner s = new Scanner(System.in);

    public static String[] inputPerson(){
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return checkPersonName(s.nextLine().split(","));
    }

    public static String[] inputResult(String[] persons){
        System.out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return checkResult(s.nextLine().split(","), persons);
    }

    public static int inputRadderHeight(){
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        return s.nextInt();
    }

    private static String[] checkPersonName(String[] persons) {
        for (int i = 0; i < persons.length; i++) {
            i = personModified(persons, i);
        }
        return persons;
    }

    private static String[] checkResult(String[] results, String[] persons){
        if(results.length > persons.length){
            System.out.println("실행 결과 값이 참여할 사람 수보다 많습니다. 사람 수에 맞게 다시 입력하세요.");
            results = inputResult(persons);
            checkResult(results, persons);
        }
        return results;
    }

    public static int personModified(String[] persons, int i) {
        if(persons[i].length() > PERSON_NAME_MAX){
            System.out.println("'" + persons[i] + "' 이름이 글자 범위를 초과했습니다. 바꾸실 이름을 입력해주세요.");
            persons[i] = persons[i].replaceFirst(persons[i], InputView.s.nextLine());
            i--;
        }
        return i;
    }

    public static String resultNameView(){
        System.out.println("결과를 보고 싶은 사람은?");
        return s.next();
    }
}
