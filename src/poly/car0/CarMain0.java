package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        //추가: k3를 운전하던 운전자가 Model3로 차량을 변경해서 운전하는 코드이다.
        //여기서 새로운 차량을 추가한다면 또 다시 Driver 코드를 많이 변경해야 한다. 만약 운전할 수 있는 차량의 종류가 계속 늘어난다면 점점 더 변경해야 하는 코드가 많아질 것이다.
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null); //기존 k3Car의 참조를 제거한다.
        driver.setModel3Car(model3Car); //새로운 model3Car의 참조를 추가한다.
        driver.drive();
    }
}
