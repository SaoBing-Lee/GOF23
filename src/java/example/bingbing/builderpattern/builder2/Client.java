package example.bingbing.builderpattern.builder2;

public class Client {
    public static void main(String[] args) {
        Diector diector = new SixDiector(new SixBurgerBuilder() );
        Item item = diector.diectorItem();
        System.out.println(item.getBurger().name);
    }
}
