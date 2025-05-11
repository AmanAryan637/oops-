abstract class Animal{
abstract void walk();
abstract void eat();
abstract void type();

}
class horse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("eats grass leaves etc");
    }

    public void type(){
        System.out.println("herbivores(vegetarian)");
    }
}
class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }

    public void eat() {
        System.out.println("eats grass leaves ,grains ,insects etc");
    }

    public void type(){
        System.out.println("omniivores(both)");
    }
}


class bear extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("eats grains as well meat  etc");
    }
    public void type(){
        System.out.println("omnivores(both)");
    }
}


class kangaroo extends Animal{
    public void walk(){
        System.out.println("walks on 2 as well as 4 legs");
    }

    public void eat() {
        System.out.println("eats grass leaves etc");
    }

    public void type(){
        System.out.println("herbivores(vegetarian)");
    }
}

class tiger extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("eats  meat  etc");
    }
    public void type(){
        System.out.println("carnivores(non vegeterian)");
    }
}



public class abst_ract {
    public static void main(String[] args) {

        /// fetching data normally
//        horse badal= new horse();
//        badal.walk();
//        chicken murgi =new chicken();
//        murgi.type();
//        bear bhalu = new bear();
//        bhalu.eat();
//         kangaroo ausies =new kangaroo();
//         ausies.eat();
//         ausies.type();
//         ausies.walk();
//         tiger sheeru = new tiger();
//         sheeru.walk();
//         sheeru.type();
//

          /// fetching data by l0op
        Animal[] animals = { new horse(), new chicken(), new bear(), new kangaroo(), new tiger() };

        for (Animal a : animals) {
            a.walk();
            a.eat();
            a.type();
            System.out.println("----------------");
        }

    }
}
