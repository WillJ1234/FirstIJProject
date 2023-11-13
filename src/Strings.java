public class Strings {
    String s = "Lubbock";

    /*A string is a group of characters. They are locatable via an index. The first character is located at spot 0.
    Strings are imutable and have no modifier or mutator methods. They area sort of class and are accesible by methods.



    //Lubbock
    //0123456
    Method | use
    -----------
    charAt(x) | the char at spot x.String
    length() | the amount of chars
    substring(x,y) a section of the original starting spot x and going up to but not including y.
    substring(x) | a section of the word from x to the end
    indexOf(str) | the location of str in the original string looking from spot 0
    indexOf(ch) | the location of ch in the original string looking from spot 0
    lastIndexOf(str)| looks towards the end towards the front
    equals(str) | boolean and returns true if they match false otherwise
    compareTo(str) | int difference between the first two
     */
    public static void main(String[] args){
        String s = "Lubbock";
        System.out.println(s.substring(1,4));
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        //there are outbound errors if you look for a location that doesn't exist
        System.out.println(s.substring(3));
        System.out.println(s.indexOf("k"));
        System.out.println(s.indexOf("b"));
        System.out.println(s.lastIndexOf("b"));
        System.out.println(s.equals("d"));
        System.out.println(s.compareTo("Cheese"));


    }
}
