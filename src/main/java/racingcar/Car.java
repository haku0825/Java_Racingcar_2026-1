package racingcar;

public class Car {

    public String carName;
    public int count;

    public Car() {}

    public Car(String carName) {    // 매개변수를 가진 생성자
        this.carName = carName;
        this.count = 0;
    }

    public void upCount(int number) {
        if (number >= 4) {
            this.count ++;
        }ㅎ
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
