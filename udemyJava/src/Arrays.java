public class Arrays {
    public static void main(String[] args) {
        int x; // creating that one box in memory that stores one int value
        int [] myArray; // declaring an array that will store ints
        //myArray = new int[50000]; // initializing our array to be capable to be 50000 ints
        myArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        /*x = 5;

        myArray[0] = x;
        myArray[1] = 25;
        myArray[2] = 125;
        myArray[3] = 625;
        myArray[4] = 0; */

        /*for(int counter = 0; counter < 50000; counter++) {
            myArray[counter] = counter;
        }*/
    
        // iterating over an array
        // for (int i = 0; i < myArray.length; i++) {
        //     System.out.println(myArray[i]);
        //}

        for (int number : myArray) {
            System.out.println(number);
        }
    }
}