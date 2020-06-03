package m3.s19ex2;

public class Main {
    public static void main(String[] args) {
        //  Pet - abstract int housing()
        //  |  \
        // Dog Cat
        
        // ctor(int)
        
        // cane x 1 giorno -> 10
        // gatto           -> 6
        
        // Pet[] = new Dog, Cat, ...
        
        // bob = new Dog(3);
        // tom = new Cat(1);
        // bob.housing() -> 30
        
        // for each -> calcolare housing complessivo = 36
        
        Pet[] guests = { new Dog(3), new Cat(5), new Dog(1), new BigDog(4), new BigCat(10) };
        
        int total = 0;
        for(Pet guest: guests) {
        	System.out.println("Pet Type: "+guest.getClass().getSimpleName() + "\n Days: "+guest.days +"\n");
            total += guest.housing();
        }
        
        System.out.println("Total cost for Housing: "+total);
    }
}
