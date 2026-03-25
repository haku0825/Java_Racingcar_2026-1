package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // 1. 게임 엔진 객체 생성
        RacingGame racingGame = new RacingGame();

        // 2. 게임 실행 및 최종 자동차 리스트 받아오기
        // RacingGame.java의 start 메서드는 List<Car>를 반환하도록 설계하셨습니다.
        List<Car> carList = racingGame.start(null);

        // 3. 우승자 판별 및 결과 출력
        RacingResult racingResult = new RacingResult();
        racingResult.result(carList);
    }
}