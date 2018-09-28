package ladder.domain;

import ladder.view.InputView;

public class ResultOutput {
    public static String resultCheck(String[] persons, LadderGame game, String[] results, String resultName){
        int index = -1;

        if(resultName.equals("all")){
            return allPersonResult(persons, game, results);
        }

        index = onePersonResult(persons, resultName, index);
//        int index = Arrays.binarySearch(persons, resultName); // 두번째 인자의 값을 찾아 인덱스로 반환(이방법은 정렬이 되있어야 쓸수 있음)
        if(index < 0){ // 존재하지 않은 값인 경우 마이너스 반환
            System.out.println("찾으려는 사람을 정확하게 입력하세요.");
            resultName = InputView.resultNameView();
            return resultCheck(persons, game, results, resultName);
        }
        return results[game.getResultPos(index, results)];
    }

    public static int onePersonResult(String[] persons, String resultName, int index) {
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].equals(resultName)){
                index = i;
                break;
            }
        }
        return index;
    }

    public static String allPersonResult(String[] persons, LadderGame game, String[] results) {
        String result = "";
        for (int i = 0; i < persons.length; i++) {
            result += String.format(persons[i] + " : " + results[game.getResultPos(i, results)] + "%n");
        }
        return result;
    }
}
