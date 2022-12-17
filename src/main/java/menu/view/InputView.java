package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.view.utils.Validators;

import java.util.List;

public class InputView {

    // 코치 이름 범위 확인
    // 코치의 인원 수 확인
    public static List<String> readCoachName() {
        try {
            String input =  Console.readLine();
            List<String> inputToList = List.of(input.split(","));
            Validators.validateForInvalidRangeOfCoachName(inputToList);
            Validators.validateForInvalidRangeOfCoachCount(inputToList.size());
            return inputToList;
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return readCoachName();
        }
    }
}
