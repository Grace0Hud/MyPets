public class MyPetsDriver
{
    public static void main(String [] args)
    {
        Pets pablo = new Dog("Pablo", "Chihuahua", 5, 25.0, true, "kibble");
        Pets tony = new Bird("Tony", 2, 10.0, "blue", 5.0, "parrot", false, "seeds");

        System.out.println(pablo);
        System.out.println(tony);
        System.out.println();
        System.out.println("Pablo monthly feeding: " + pablo.monthlyFeeding() + " times per month");
        System.out.println("Tony monthly feeding: " + tony.monthlyFeeding() +  " times per month");
        System.out.println("Grace Hudgens");
//        Dog rex = new Dog("Rex", "German Sheperd", 2, 160.2);
//        System.out.println(rex);
//
//        Pets mochi = new Lizard("Mochi", "Blue-Tongued Skink", 8, 2.5);
//        System.out.println(mochi);
//
//        Pets donald = new Bird("Donald", 20, 6, "white", 30, "Duck" );
        //System.out.println(rex.fetch()); //only works when rex is a dog - NOT when rex is a pet
      //  System.out.println(mochi.speak());
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
