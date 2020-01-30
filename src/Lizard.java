public class Lizard extends Pets
{
    private String species;

    public Lizard(String name, String species, int age, double weight, boolean hasOwner, String food)
    {
        super(name, age, weight, hasOwner, food);
        this.species = species;
    }//end lizard constructor

    public String speak()
    {
        return "Hiss";
    }//end of speak

    public int monthlyFeeding()
    {
        return 4;
    }//end method to determine the number of feedings
    public String toString()
    {
        String output = "\n---Lizard---";
        output += super.toString();
        output +=     "\nSpecies: " + species;
        return output;
    }//end tostring
}//end lizard class
