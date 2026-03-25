package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RacingGame {

    InputView inputView = new InputView();

    public List<Car> start(List<Car> list) {

        List<Car> carList = inputView.createCars();
        int count = inputView.getCount();

        System.out.println("실행결과");

        for (int i = 0; i < count; i ++) {
            for (Car car : carList) {
                int randomNumber = Randoms.pickNumberInRange(0,9);
                car.upCount(randomNumber);
            }

            for (Car car : carList) {
                int carCount = car.getCount();
                String carName = car.getCarName();

                System.out.print(carName + " : ");

                for (int j = 0; j < carCount; j++) {
                    System.out.print("-");
                }

                System.out.println();
            }
            System.out.println();
        }
        return carList;
    }
}
