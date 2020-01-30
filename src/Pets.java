import java.text.DecimalFormat; //to format the weight in pounds
public abstract class Pets
{
    protected String name;
    protected int age;
    protected double weight; //in kg
    protected String food;
    protected boolean hasOwner;
    DecimalFormat fmt = new DecimalFormat("#.#"); //create formating object
    public Pets(String name, int age, double weight, boolean hasOwner, String food)
    {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.hasOwner = hasOwner;
       this.food = food;
    }//end of pets constructor

    public String getName()
    {
        return name;
    }//end of get name
    public int getAge()
    {
        return age;
    }//end of get age
    public void setName(String name)
    {
        this.name = name;
    }//end set name

    abstract public String speak(); //to be overriden in each child class - can't be used when object is a PET
    abstract public int monthlyFeeding(); //to be overriden
    public double kgToPounds()
    {
        return weight * 2.205;
    }//end conversion method


    public String toString()
    {
        String output = "\nName: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg" + "(" + fmt.format(kgToPounds()) + " lbs)";
        output += "\nFood: " + food;
        return output;
    }//end to string
}//end class pets
