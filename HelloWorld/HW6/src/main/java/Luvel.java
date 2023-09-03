class Luvel {
    private int width;
    private int height;

    public Luvel(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class LevelTooBigException extends Exception{
    LevelTooBigException(){

    }
}

class LuvelLoader {
    public void load(Luvel level) throws LevelTooBigException {
        if(level.getHeight()*level.getWidth() >1000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}

class LuvelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LuvelLoader().load(new Luvel(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LuvelLoader().load(new Luvel(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}