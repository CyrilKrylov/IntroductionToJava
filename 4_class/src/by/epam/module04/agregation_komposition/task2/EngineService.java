package by.epam.module04.agregation_komposition.task2;

public class EngineService {

    private Engine engine;

    public EngineService(Engine engine) {
        this.engine = engine;
    }

    public void stopEngine() {
        this.engine.setEngineStarted(false);
    }

    public void startEngine() {
        this.engine.setEngineStarted(true);
    }

    public boolean isEngineStarted() {
        return this.engine.isEngineStarted();
    }
}
