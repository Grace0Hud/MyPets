public class Lizard extends Pets
{
    private String species;

    public Lizard(String name, String species, int age, double weight)
    {
        super(name, age, weight);
        this.species = species;
    }//end lizard constructor

    public String speak()
    {
        return "Hiss";
    }//end of speak
    public String toString()
    {
        String output = "\n---Lizard---";
        output += super.toString();
        output +=     "\nSpecies: " + species;
        return output;
    }//end tostring
}//end lizard class
