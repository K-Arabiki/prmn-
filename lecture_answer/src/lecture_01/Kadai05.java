package lecture_01;

public class Kadai05 {
    public static void main(String[] args) {

        int[] score = {41,85,72,38,80};
        int max = max(score);
        int min = min(score);
        double average = average(score);

        //int max = score[0];
        //int min = score[0];

        for(int i =0; i < score.length; i++) {

            if(100 >= score[i] && score[i] >= 90) {
                System.out.println(i + 1 + "番 " + score[i] + "点" + " 秀");
            }else if(90 > score[i] && score[i] >= 80) {
                System.out.println(i + 1 + "番 " + score[i] + "点" + " 優");
            }else if(80 > score[i] && score[i] >= 70) {
                System.out.println(i + 1 + "番 " + score[i] + "点" + " 良");
            }else if(70 > score[i] && score[i] >= 60) {
                System.out.println(i + 1 + "番 " + score[i] + "点" + " 可");
            }else {
                System.out.println(i + 1 + "番 " + score[i] + "点" + " 不可");
            }
            //min = Math.min(min, score[i]);
            //max = Math.max(max, score[i]);

        }

        System.out.println("最高点:" + max + "点");
        System.out.println("最低点:" + min + "点");
        System.out.println("平均点:" + average + "点");

    }

    static int max(int[] score){
        int max = score[0];

        for (int i=1;i<5;i++){
            if (max < score[i]){
                max = score[i];
            }
        }
        return max;
    }

    static int min(int[] score){
        int min = score[0];

        for (int i=1;i<5;i++){
            if (min > score[i]){
                min = score[i];
            }
        }
        return min;
    }



    static double average(int[] score){
        int sum = 0;

        for (int i=0;i<5;i++){
            sum += score[i];
        }
        double average = sum/(double)score.length;

        return average;
    }

}
