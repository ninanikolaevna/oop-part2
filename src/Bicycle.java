public class Bicycle extends Transport implements TyreService, EngineService {
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
}
