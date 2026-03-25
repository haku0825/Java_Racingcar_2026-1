package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    RacingGame racingGame = new RacingGame();

    public void result(List<Car> carList) {
        ArrayList<String> winnerList = new ArrayList<>();
        int maxNum = 0;

        for (Car car : carList) {
            if (car.getCount() >= maxNum) {
                maxNum = car.getCount();
            }
        }

        for(Car car: carList) {
            if (car.getCount() == maxNum ) {
                winnerList.add(car.getCarName());
            }
        }

        String winnerNames = String.join(", ", winnerList);
        System.out.print("최종 우승자 : ");
        System.out.print(winnerNames);
    }
}
