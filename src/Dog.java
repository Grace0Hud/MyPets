public class Dog extends Pets
{
    private String breed;

    public Dog(String name, String breed, int age, double weight, boolean hasOwner, String food)
    {
        super(name, age, weight, hasOwner, food);
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

    public int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }
        return dailyFeedings * 30;
    }//end of method explaining how many feedings per month, for bugetary reasons
    public String toString()
    {
        String output = "----DOG----";
        output += super.toString() + "\nBreed: " + breed;
        return output;
    }//end tostring with call to super
}//end class dog
