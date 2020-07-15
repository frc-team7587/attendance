public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, boolean, char  = value types

        int x = 5;
        addOneTo(x); //passing a value type, so we pass a copy of the value of x, which is 5

        System.out.println(x);

        Person john;
        john = new Person("John");  //we are creating a new person object, and assigning john to refer to it
        john.setAge(20);
        celebratebirthday(john);           // we're passing that reference to a method so the method
        System.out.println(john.getAge()); // can use that reference to manipulate that object
    }


    private static void celebratebirthday(Person john) {
        john.setAge(john.getAge() + 1);
    
    }

    //manipulate a copy of the value passed
    static void addOneTo(int number) {
        number = number + 1;
    }

    

}