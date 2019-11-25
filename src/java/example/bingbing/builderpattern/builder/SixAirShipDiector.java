package example.bingbing.builderpattern.builder;

public class SixAirShipDiector implements AirShipDiector {
    private AirShipBuilder builder;

    public SixAirShipDiector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip DirctorAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
