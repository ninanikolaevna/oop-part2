public class Truck extends Transport implements TyreService {

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
