public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Dog rex = new Dog("Rex", "German Sheperd", 2, 160.2);
        System.out.println(rex);

        Pets mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2.5);
        System.out.println(mochi);

        Pets donald = new Bird("Donald", 20, 6, "white", 30, "Duck" );
        //System.out.println(rex.fetch()); //only works when rex is a dog - NOT when rex is a pet
        System.out.println(mochi.speak());
//        Pets[] menagerie = new Pets[5]; //starting to create an array of pets
//
//        menagerie[0] = rex;
//        menagerie[1] = mochi;
//        menagerie[2] = donald;
//
//        for(int i = 0; i < menagerie.length; i++)
//        {
//            System.out.println(menagerie[i]);
//        }//end of for
    }//end main method
}//end of driver
