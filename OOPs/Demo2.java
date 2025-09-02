class  Car {
    String name;
    int speed;

    void displayInf(){
        System.out.println("Name: " + name + " Speed: " + speed);


    }
}


public class Demo2{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.name = "Pawan";
        c1.speed = 500;
        c1.displayInf();
    }

}