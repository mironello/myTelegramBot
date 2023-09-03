public class SpaceShip {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("")){
            return;
        }
        if(name.isBlank()||name.length() <100){
            this.name = name;
        }
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker
        System.out.println("sdfsd");
        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored
    }
}
