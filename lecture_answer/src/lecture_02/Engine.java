package lecture_02;

public class Engine {
    int rpm;

    public Engine(int rpm){
        this.rpm = rpm;
    }

    void start(){
        System.out.println("rpm = " + rpm + " で始動させました。");
    }
}
