public class PetDriver
{
    public static void main(String[]args)
    {
        Pet colin = new Pet (10, 35, "Whilly", true);
        Pet reed = new Pet(10,23,"Reed", true);
        System.out.println(colin);
        Pet.example();
        System.out.println("Number of pets: " + Pet.numPets);
        
    }
}
