public class Main {
    public static void main(String[] args) {
// Задание 1
        //     int s = 1;
        //      while (s<=10){
        //          System.out.print(s +" ");
        //          s = s + 1;}

        //      System.out.print("\n");

        //      for(int i=10; i>0; i-- ){
        //         System.out.print(i + " ");

        // Задание 2
       // int q = 1;
       // for(;q< 31;q =q +7) {
        //    System.out.println("Сегодня пятница, " + q + "-е число.Необходимо подготовить отчет.");
       // }

    //Задание 3
        int year = 2022;
        int yearStart = 0;
        int yearBefore = year - 200;
        int afterYears = year + 100;
        for (;yearStart <= afterYears; yearStart+=79)
            if(yearStart % 79 == 0 && yearStart>yearBefore){
            System.out.println(yearStart);}





    }



}





