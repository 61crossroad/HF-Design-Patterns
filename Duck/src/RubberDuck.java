public class RubberDuck extends Duck {
    @Override
    void quack() {
        System.out.println(this.getClass().getName() + "#quack(): Beep - Beep - ");
    }

    @Override
    void fly() {
        System.out.println(this.getClass().getName() + "#fly(): ...");
    }
}
