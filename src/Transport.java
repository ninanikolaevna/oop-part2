public class Transport {
    private String modelName;
    private int wheelsCount;

    protected String getModelName() {
        return modelName;
    }

    protected int getWheelsCount() {
        return wheelsCount;
    }

    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    protected void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    protected void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    protected void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
