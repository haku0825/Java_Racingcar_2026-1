package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public List<Car> createCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String input = Console.readLine();
        String[] carNames = input.split(",");

        List<String> existNames = new ArrayList<>(); //차 이름 중복 예외처리 하려고 만든 리스트

        List<Car> carList = new ArrayList<>();

        for (String name : carNames) {

            if (name.isEmpty() || name.contains(" ")) {
                throw new IllegalArgumentException("빈값, 공백 오류");
            }

            if (existNames.contains(name)) {
                throw new IllegalArgumentException("중복된 차 있음");
            }
            existNames.add(name);

            Car car = new Car(name);
            carList.add(car);
        }
        return carList;
    }
}
