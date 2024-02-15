package homework.day5.playground.essence;

public abstract class Matter {
    protected double weight;
    protected int mass;


    public Matter(double weight, int mass) {
        this.weight = weight;
        this.mass = mass;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public double getWeight() {
        return weight;
    }

    public int getMass() {
        return mass;
    }
}
