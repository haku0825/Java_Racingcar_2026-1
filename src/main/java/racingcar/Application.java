package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. 입출력 뷰 객체 생성
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        // 2. 게임 엔진에 뷰 객체 주입 및 실행 (null 파라미터 제거)
        RacingGame racingGame = new RacingGame(inputView, outputView);
        List<Car> carList = racingGame.start();

        // 3. 우승자 판별 및 결과 출력
        // (RacingResult 내부에서도 outputView를 사용하도록 수정하는 것을 권장함)
        RacingResult racingResult = new RacingResult();
        racingResult.result(carList); 
    }
}