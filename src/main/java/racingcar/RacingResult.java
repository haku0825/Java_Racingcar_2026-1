package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    // 문제의 원인! 이 줄을 과감하게 삭제합니다.
    // RacingGame racingGame = new RacingGame(); 

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