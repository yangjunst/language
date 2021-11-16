package holding;

import java.util.*;

import static net.mindview.util.Print.*;

class Rodent {
    public void hop() {
        print("Rodent hopping");
    }

    public void scurry() {
        print("Rodent scurrying");
    }

    public void reproduce() {
        print("Making more Rodents");
    }

    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    public void hop() {
        print("Mouse hopping");
    }

    public void scurry() {
        print("Mouse scurrying");
    }

    public void reproduce() {
        print("Making more Mice");
    }

    public String toString() {
        return "Mouse";
    }
}

class Hamster extends Rodent {
    public void hop() {
        print("Hamster hopping");
    }

    public void scurry() {
        print("Hamster scurrying");
    }

    public void reproduce() {
        print("Making more Hamsters");
    }

    public String toString() {
        return "Hamster";
    }

    public static void main(String[] args) {
        List<Rodent> rodents = Arrays.asList(
                new Rodent(), new Mouse(), new Hamster());
        Iterator<Rodent> iterator = rodents.iterator();
        iterator.next();
        iterator.remove();
        System.out.println(rodents);


    }
}

public class E10_RodentIterator {

    public static void main(String args[]) {
        ArrayList<Rodent> rodents = new ArrayList<Rodent>(
                Arrays.asList(
                        new Rodent(), new Mouse(), new Hamster()));
        Rodent r;
        for (Iterator<Rodent> it = rodents.iterator();
             it.hasNext(); ) {
            r = it.next();
            r.hop();
            r.scurry();
            r.reproduce();
            print(r);
        }
    }
}