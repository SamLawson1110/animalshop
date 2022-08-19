public class AnimalTester {
    public static void main(String[] args){
        Dog dog1 = new Dog("Beagle", 45.6, "Beagle", "white and brown");
        Dog dog2 = new Dog("Bailey", 80.2, "arf-arf","Boerboel", "brown");
        Fish fish1 = new Fish("cold", "Goldfish", "red");

        System.out.println("name: " + dog2.getName() + "\nbreed: " + dog2.getBreed() + "\nbark noise: " + dog2.getBarkNoise() + "\nweight: " + dog2.getWeight() + "\ncolor: " + dog2.getColor());
        System.out.println("\nbreed: " + fish1.getBreed() + "\nwater type: " + fish1.getWaterType() + "\ncolor: " + fish1.getColor());
    }
}
