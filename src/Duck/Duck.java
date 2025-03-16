package Duck;

public class Duck {
    private String name;
    private double weight;

    public Duck(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void swim() {
        System.out.println("I'm swimming");
    }

    public void display() {
        System.out.printf("I'm %s\n", name);
    }
}
