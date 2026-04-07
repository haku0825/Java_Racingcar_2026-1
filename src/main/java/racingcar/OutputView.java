package racingcar;

import java.util.List;

public class OutputView {
    
    public void printRunResultHeader() {
        System.out.println("\n실행 결과");
    }

    public void printCarPosition(Car car) {
        System.out.print(car.getCarName() + " : ");
        for (int i = 0; i < car.getCount(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void printEmptyLine() {
        System.out.println();
    }

    public void printWinners(List<String> winnerNames) {
        System.out.print("최종 우승자 : " + String.join(", ", winnerNames));
    }
}