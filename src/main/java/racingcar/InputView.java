package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public List<Car> createCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

        String nameInput = Console.readLine();
        String[] carNames = nameInput.split(",");

        List<String> existNames = new ArrayList<>(); //차 이름 중복 예외처리 하려고 만든 리스트

        List<Car> carList = new ArrayList<>();

        for (String name : carNames) {

            if (name.length() > 5) {
                throw new IllegalArgumentException("차 이름 5글자보다 클 수 없음");
            }

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

    public int getCount() {

        System.out.println("시도할 회수는 몇회인가요?");
        String countInput = Console.readLine();

        int tryCount;

        try {
            tryCount = Integer.parseInt(countInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야함");
        }

        if (tryCount <= 0) {
            throw new IllegalArgumentException("0보다 작은 수 안됨");
        }

        return tryCount;
    }
}