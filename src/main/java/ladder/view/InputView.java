package ladder.view;

import ladder.domain.LadderGame;
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

    public static String[] checkPersonName(String[] persons) {
        for (int i = 0; i < persons.length; i++) {
            i = personModified(persons, i);
        }
        return persons;
    }

    public static String[] checkResult(String[] results, String[] persons){
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

    public static String resultNameView(String[] persons, LadderGame game, String[] results){
        System.out.println("결과를 보고 싶은 사람은?");
        String resultName = s.next();
        int index = -1;

        if(resultName.equals("all")){
            String result = "";
            for (int i = 0; i < persons.length; i++) {
                result += String.format(persons[i] + " : " + game.checkResult(i, results) + "%n");
            }
            return result;
        }

        for (int i = 0; i < persons.length; i++) {
            if(persons[i].equals(resultName)){
                index = i;
                break;
            }
        }
//        int index = Arrays.binarySearch(persons, resultName); // 두번째 인자의 값을 찾아 인덱스로 반환(이방법은 정렬이 되있어야 쓸수 있음)

        if(index < 0){ // 존재하지 않은 값인 경우 마이너스 반환
            System.out.println("찾으려는 사람을 정확하게 입력하세요.");
            return resultNameView(persons, game, results);
        }
        return game.checkResult(index, results);
    }
}
