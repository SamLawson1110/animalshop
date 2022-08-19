public class Dog extends Animal{
    private String name, barkNoise = "Woof";
    private double weight;

    public Dog(String name, double weight, String breed, String color){
        super(breed, color);
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, double weight, String barkNoise, String breed, String color){
        super(breed, color);
        this.name = name;
        this.weight = weight;
        this.barkNoise = barkNoise;
    }

    public String getName(){
        return name;
    }

    public String getBarkNoise(){
        return barkNoise;
    }

    public double getWeight(){
        return weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBarkNoise(String barkNoise){
        this.barkNoise = barkNoise;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
}
