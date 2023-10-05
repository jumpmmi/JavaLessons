package FirstPartOfLessons;

public class If {
    public static void main(String[] args) {
        int myInt = 15;
        if (myInt < 10) {
            System.out.println("да, верно");
        } else if (myInt > 20) {
            System.out.println("нет, не верно");
        } else {
            System.out.println("ни один из предыдущих случаев");
        }
    }
}

// Делаем из положительного числа отрицательное, если число сразу с минусом,то
// так и остается.

// public class Kata {
// public static int makeNegative(final int x) {

//      if(x>0){
// return -x;
// }   else if(x<0){
// return x;
// }
//     else {
// return 0;
// }


// public class Kata {                                           <<<<<<<<- самый легкий вариант через модуль. модуль х = -х
//   public static int makeNegative(final int x) {  
//     return -Math.abs(x);
//   }
// }