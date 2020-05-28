class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;
    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        Cat.counter++;
        if(Cat.counter>5){
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}