import java.util.Scanner;

class SelectionContext {

    private PersonSelectionAlgorithm algorithm;

    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        // write your code here
        this.algorithm=algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        // write your code here
        return this.algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {
    public int step;
    public TakePersonsWithStepAlgorithm(int step) {
        // write your code here
        this.step=step;
    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        int len=0;
        for(int i=0;i<persons.length;i++){
            if(i%step==0){
                len++;
            }
        }
        Person[] res=new Person[len];
        if(persons.length==1||step==1){
            return persons;
        }else {
            int ind=0;
            for (int i = 0; i < persons.length; i++) {
                if(i%step==0){
                    res[ind]=persons[i];
                    ind++;
                }
            }
        }
        return res;
    }
}


class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
    public int count;
    public TakeLastPersonsAlgorithm(int count) {
        // write your code here
        this.count=count;



    }

    @Override
    public Person[] select(Person[] persons) {
        // write your code here
        if(persons.length==1||count==1){
            return persons;
        }else {
            Person[] res=new Person[count];
            int ind=0;
            for (int i = persons.length-count; i <persons.length; i++) {
                res[ind]=persons[i];
                ind++;
            }
            return res;
        }

    }
}

class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int count = Integer.parseInt(scanner.nextLine());
        final Person[] persons = new Person[count];

        for (int i = 0; i < count; i++) {
            persons[i] = new Person(scanner.nextLine());
        }

        final String[] configs = scanner.nextLine().split("\\s+");

        final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
        SelectionContext ctx = new SelectionContext();
        ctx.setAlgorithm(alg);

        final Person[] selected = ctx.selectPersons(persons);
        for (Person p : selected) {
            System.out.println(p.name);
        }
    }

    public static PersonSelectionAlgorithm create(String algType, int param) {
        switch (algType) {
            case "STEP": {
                return new TakePersonsWithStepAlgorithm(param);
            }
            case "LAST": {
                return new TakeLastPersonsAlgorithm(param);
            }
            default: {
                throw new IllegalArgumentException("Unknown algorithm type " + algType);
            }
        }
    }
}