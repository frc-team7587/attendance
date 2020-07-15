public class AccessModifiers {
// List of most restricted to least restricted:
    // private is the most restrictive
    // default
    // protected
    // public

    private int x;
    public int y;
    public static void main(String[] args) {

        
    }

    // This method can be accessed anywhere in the program so
    // long as you have an instance of this class to call it from
    public void doSomethingPublic() {

    }

    // This method can't be accessed anywhere other than inside of this class
    private void doSomethingPrivate() {

    }

    // This method can only be accessed inside this package,
    // and from subclasses from this class    
    protected void doSomethingProteted() {

    }

    // This method can only be accessed inside of this package
    void doSomething(){

    }
}