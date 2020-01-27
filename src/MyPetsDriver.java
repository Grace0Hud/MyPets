public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Dog rex = new Dog("Rex", "German Sheperd", 2, 160.2);
        System.out.println(rex);

        Lizard mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2.5);
        System.out.println(mochi);

        Bird donald = new Bird("Donald", 20, 6, "white", 30, "Duck" );
        int[] arrayOfInts = new int[5]; //example of instantiating an array
        Pets[] menagerie = new Pets[5]; //starting to create an array of pets

        menagerie[0] = rex;
        menagerie[1] = mochi;
        menagerie[2] = donald;

        for(int i = 0; i < menagerie.length; i++)
        {
            System.out.println(menagerie[i]);
        }//end of for
    }//end main method
}//end of driver
