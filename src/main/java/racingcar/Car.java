package racingcar;

public class Car {
    // public에서 private으로 변경하여 외부 조작 방지
    private String carName;
    private int count;

    public Car(String carName) {
        this.carName = carName;
        this.count = 0;
    }

    public void upCount(int number) {
        if (number >= 4) {
            this.count++;
        }
    }

    public String getCarName() { return carName; }
    public int getCount() { return count; }
}