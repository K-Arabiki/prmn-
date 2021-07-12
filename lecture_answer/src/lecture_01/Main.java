package lecture_01;

public class Main {
    public static void main(String[] args) {

        //課題1
        System.out.println("b2190080 Koki Araseki");

        //課題2
        String studentNunmber = "b2190080";
        System.out.println(studentNunmber + " Koki Araseki");

        //課題3
        int age = 10;

        if(age<20){
            System.out.println("I am " + age + " years old so I cannot drink liquor." );
        }else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

        //課題4
        int[] array = new int[100];
        int sum = 0;
        for (int i =0;i<100;i++){
            array[i]=i+1;
            if (array[i]%2 == 0){
                sum += array[i];
            }
        }
        System.out.println(sum);

        //課題5
        int[] score = {41,85,72,38,80};
        System.out.println();
        

    }

    int min(int[] score){
        int min = score[0];

        for (int i=1;i<5;i++){
            if (min > score[i]){
                min = score[i];
            }
        }
        return min;
    }

    int max(int[] score){
        int max = score[0];

        for (int i=1;i<5;i++){
            if (max < score[i]){
                max = score[i];
            }
        }
        return max;
    }

    double average(int[] score){
        int sum = 0;
        int i = 0;

        for (i=0;i<5;i++){
           sum += score[i];
        }
        double average = sum/i;

        return average;
    }

}
