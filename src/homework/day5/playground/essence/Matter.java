package homework.day5.playground.essence;

public abstract class Matter {
    protected double weight;
    int mass;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Matter(double weight, int mass) {
        this.weight = weight;
        this.mass = mass;
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
