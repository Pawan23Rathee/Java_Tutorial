class P1{
    int add(int a,int b) {return a + b;}
    double add(double a,double b) {return a + b;}

}

class animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends animal{
    void sound(){
        System.out.println("Bark");

    }
}

public class Demo1{
    public static void main(String[] args) {
    P1 obj = new P1();
    System.out.println(obj.add(10,20));
    System.out.println(obj.add(10.5,20.5));
    
    animal a = new Dog();
    a.sound();
}
}