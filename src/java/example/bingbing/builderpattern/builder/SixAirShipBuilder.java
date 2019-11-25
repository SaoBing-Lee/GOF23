package example.bingbing.builderpattern.builder;

public class SixAirShipBuilder implements AirShipBuilder{
    @Override
    public Engine builderEngine() {
        System.out.println("建造发动机");
        return new Engine("冰冰发动机");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("建造逃逸塔");
        return new EscapeTower("冰冰逃逸塔");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("建造轨道仓");
        return new OrbitalModule("冰冰轨道仓");
    }
}
