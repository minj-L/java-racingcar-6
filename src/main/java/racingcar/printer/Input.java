package racingcar.printer;

import racingcar.message.Message;
import racingcar.util.splitString;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Input {
    // 자동차 입력받기
    public static List<String> getCars() throws IllegalArgumentException {
        System.out.println(Message.INPUT.getMessage());
        String cars = Console.readLine();
        List<String> carsList = new ArrayList<>();

        try {
            carsList = splitString.splitString(cars);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getCars();
        }

        return carsList;
    }
    // 게임횟수 입력받기
    public static int gameNumber() {
        System.out.println(Message.TRY.getMessage());
        String gameNumber = Console.readLine();

        return Integer.valueOf(gameNumber);
    }
}