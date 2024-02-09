package basetask;

public class Bee {
    private String gender;
    private long weight;

    public Bee(String newGender, int newWeight) {
        this.gender = newGender;
        this.weight = newWeight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printBeeDetails() {
        System.out.println("Я легче лося в " + 500 / weight + " раз");
    }
}
