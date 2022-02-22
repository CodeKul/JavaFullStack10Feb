package abstraction.abstractdemo;

public class Football extends AbsSports{

    @Override
    public void play() {
        System.out.println("Playing football");
    }

    @Override
    public void exercise() {
        System.out.println("For football exercise");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}
