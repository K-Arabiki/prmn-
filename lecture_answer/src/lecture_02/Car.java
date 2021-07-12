package lecture_02;

public class Car {
    int fuel; //課題2
    Tire[] tire;
    Engine engine;

    public Car(){
        this.fuel = 0;
    }
    public Car(Tire[] tire,Engine engine){
        this.fuel = 0;
        this.tire = tire;
        this.engine = engine;
    }

    void run(){
        if(fuel <= 0){
            System.out.println("燃料が足りないため走れませんでした。");
        }else{
            fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }

}
