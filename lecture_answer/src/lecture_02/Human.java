package lecture_02;

public class Human {

    //フィールド
    String name;
    int age;

    //コンストラクタ
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }


    //メソッド
    void print(){
        if(age <= 18){
            System.out.println("生徒:" + name + age + " 歳です。");
        }else if (age <= 22){
            System.out.println("学生:" + name + age + " 歳です。");
        }else {
            System.out.println(name + age + " 歳です。");
        }
    }

}
