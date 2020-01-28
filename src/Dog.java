public class Dog extends Pets
{
    private String breed;

    public Dog(String name, String breed, int age, double weight)
    {
        super(name, age, weight);
        this.breed = breed;
    }//end dog constructor with call to super

    public String fetch()
    {
        if(Math.random() >= 0.5)
        {
            return "Fetch accomplished";
        }
        else
        {
            return "No fetching here";
        }
    }//end fetch method - exists in dog but not pet demos polymorphisim

    public String speak()
    {
        if(this.age < 2)
            return "yip";
        else
            return "bark";
    }//end of speak
    public String toString()
    {
        String output = "----DOG----";
        output += super.toString() + "\nBreed: " + breed;
        return output;
    }//end tostring with call to super
}//end class dog
