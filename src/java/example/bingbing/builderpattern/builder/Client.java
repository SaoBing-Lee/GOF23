package example.bingbing.builderpattern.builder;

public class Client {
    public static void main(String[] args) {
        AirShipDiector airShipDiector = new SixAirShipDiector(new SixAirShipBuilder());
        AirShip airShip = airShipDiector.DirctorAirShip();
        System.out.println(airShip.getEngine().getName());
    }
}
