package homework.day5.playground.essence.craft.hand;

public class Mug extends Container {
    protected double weight;
    String name;

    public Mug(double weight, int mass, double weight1, String name) {
        super(weight, mass);
        this.weight = weight1;
        this.name = name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
