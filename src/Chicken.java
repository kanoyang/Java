public class Chicken extends Animal implements Edible{
    public Chicken(){
        super("Chicken");
    }
    @Override
    public  void makeSound(){
        System.out.println("cluck");
    }

    @Override
    public String howToEat() {
        return "Boiled chicken";
    }
}
