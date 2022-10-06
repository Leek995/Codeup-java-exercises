public class Dog {
    int size;
    String name;
//    void bark (){
//        if( size > 60){
//            System.out.println("Woof, Woof!");
//        }else if(size > 14){
//            System.out.println("Ruff! Ruff!");
//        }else {
//            System.out.println("Yip, Yip!");
//        }
//    }
    public void bark(){
        System.out.println(name + " says Ruff!");
    }
    public void eat(){

    }

    public void chaseCat(){}

    public static void main(String[] args){
//        Dog one = new Dog();
//        one.size = 70;
//        Dog two = new Dog();
//        two.size = 8;
//        Dog three = new Dog();
//        three.size = 35;
//        one.bark();
//        two.bark();
//        three.bark();
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Yabba";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        myDogs[0].name = "Pepper";
        myDogs[0].name = "Marge";
        System.out.println("last dog's name is ");
        System.out.println(myDogs[2].name);
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            ++x;
        }
    }

}
