public class Bird extends Pets
{
    private String species;
    private String color;
    private double wingspan; //inches

    public Bird(String name, int age, double weight, String color, double wingspan, String species)
    {
        super(name, age, weight);
        this.color = color;
        this.wingspan = wingspan;
        this.species = species;
    }//end of bird constructor
    public String speak()
    {
        return "Chirp";
    }//end of speak method
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
