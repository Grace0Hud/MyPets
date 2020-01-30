public class Bird extends Pets
{
    private String species;
    private String color;
    private double wingspan; //inches

    public Bird(String name, int age, double weight, String color, double wingspan, String species, boolean hasOwner, String food)
    {
        super(name, age, weight, hasOwner, food);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }//end of bird constructor
    public String speak()
    {
        return "Chirp";
    }//end of speak method

    public int monthlyFeeding()
    {
        return 8;
    }//end method to determine the number of feedings
    public String toString()
    {
        String output = "\n---Bird---";
        output += super.toString();
        output += "\nColor: " + color;
        output += "\nWingspan: " + wingspan;
        output += "\nSpecies: " + species;
        return output;
    }//end of toString
}//end of class bird
