package ss7_abstract_and_interface.luyen_tap_1;

public class Run {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Duck duck = new Duck();
        System.out.println(tiger.makeSound());
        System.out.println(duck.makeSound());
    }
}
