
import java.util.stream.IntStream;




/**
 * Class to determine if a rod in a ring toss game has 3 different 
 * colors on it.
 * If a rod has all 3 colors on it then it is counted once.
 * Some rods may have no rings, some may have several.
 * 
 * @author Edwin Casady and Minh Vu
 */
public class RodsAndRings {

    /**
     * Counts the numder of rods that have all three color possibilities. 
     * (Think of this like a ring toss game where you get one point if a rod has all 3 colors on it)
     * 
     * The rings and the rod that they are on is determinied my a String argument such as: "B0B6G0R6R0R6G9"
     * The rings are simply noted by their color R or G or B for red, green, blue.
     * Rods are listed by the numbers 0 through 9. 
     * Some rods may have more than one of any possible color.
     * 
     * The length of the String argument will vary.
     * The number of rods is always 10 and indexed as 0 through 9.
     * 
     * @param String rings - formated String to indicate ring color and rod number pairs
     * @return int rods - the count of all rods that have all 3 color options of rings
     */
    private static int countRodsWith3Colors(String rings) {
        Rod[] rods = new Rod[10];
        IntStream.range(0, rods.length).forEach(i -> rods[i] = new Rod());
    
    
        for (int i = 0; i < rings.length(); ){
            char color = rings.charAt(i++);
            int rodNum = Character.getNumericValue(rings.charAt(i++));
            
            rods[rodNum].setRingColor(color);
        }
    
        int counter = 0; 
        for (Rod r : rods){
            if (r.getHas3Rings())
                counter++;
        }
        return counter;
    }

//-----------------TEST CLIENT------------------------//
//----------------DO NOT MODIFY-----------------------//
    public static void main(String[] args) {
        String test1 = "B0B6G0R6R0R6G9";
        String test2 = "B0R0G0R9R0B0G0";
        String test3 = "G4";
        String test4 = "B7B1G6G0R9B3R1R1R7R1R1B1G7R8B2B0R0G9B9";
        String test5 = "";

        //test1
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test1));
        System.out.println();

        //test2
        System.out.println("Expected count = 1");
        System.out.println("Tested results = " + countRodsWith3Colors(test2));
        System.out.println();

        //test3
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test3));
        System.out.println();

        //test4
        System.out.println("Expected count = 3");
        System.out.println("Tested results = " + countRodsWith3Colors(test4));
        System.out.println();

        //test
        System.out.println("Expected count = 0");
        System.out.println("Tested results = " + countRodsWith3Colors(test5));
        System.out.println();
    }
    
    


}
