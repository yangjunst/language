package holding;//: holding/SimpleIteration.java

import typeinfo.pets.*;

import java.util.*;

public class SimpleIteration {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
//        while (it.hasNext()) {
//            Pet p = it.next();
//            System.out.print(p.id() + ":" + p + " ");
//        }
//        System.out.println();
//        // A simpler approach, when possible:
//        for (Pet p : pets)
//            System.out.print(p.id() + ":" + p + " ");
//        System.out.println();
        // An Iterator can also remove elements:
        pets.stream().forEach(p -> System.out.print(p.id() + ":" + p + " "));
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        pets.stream().forEach(p -> System.out.print(p.id() + ":" + p + " "));
//        System.out.println();
//
//        System.out.println("=======");
//        while (it.hasNext()) {
//            Pet p = it.next();
//            System.out.print(p.id() + ":" + p + " ");
//        }
//        System.out.println();
//        System.out.println(pets);
}
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 8:Cymric 9:Rat 10:EgyptianMau 11:Hamster
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx 8:Cymric 9:Rat 10:EgyptianMau 11:Hamster
[Pug, Manx, Cymric, Rat, EgyptianMau, Hamster]
*///:~
