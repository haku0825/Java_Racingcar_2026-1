package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class RacingGame {
    private final InputView inputView;
    private final OutputView outputView;

    // 생성자를 통한 의존성 주입
    public RacingGame(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    // 불필요한 List<Car> 매개변수 제거
    public List<Car> start() {
        List<Car> carList = inputView.createCars();
        int count = inputView.getCount();

        outputView.printRunResultHeader();

        for (int i = 0; i < count; i++) {
            for (Car car : carList) {
                int randomNumber = Randoms.pickNumberInRange(0, 9);
                car.upCount(randomNumber);
                outputView.printCarPosition(car); // 출력 위임
            }
            outputView.printEmptyLine();
        }
        return carList;
    }
}