public class Work_1 {
    public static void main(String[] args) {
        byte namberOne = 127;
        short nambeTwo = 32767;
        int namberThree = 2147483647;
        long namberFour = 9223372036854775807L;
        float namberPoint = 12.23f;
        double namberPointTwo = 123.213;
        char word = '$';
        boolean bool = true;
        boolean boolTwo = false;
        System.out.println(" Ответ " + calculate(2,4,5,8));
        System.out.println(checkRange(1,8));
        positiveOrNegative(0);
        System.out.println(negative(-1));
        sayHello("Karl");
        whatTheYear(2020);
    }

    public static int calculate (int a,int b,int c, int d){
        return a*(b+(c/d));
    }

    public static boolean checkRange(int x, int y){
        int c =  x + y;
        if(c < 10 || c >20){
            return false;
        }else return true;

    }

    public static void positiveOrNegative  (int a) {
        if(a >= 0){
            System.out.println("Ваше число " + a + " положительное!" );
        } else System.out.println("Ваше число " + a + " отрицательное!");
    }

    public static boolean negative (int x){
        if (x < 0){
            return true;
        }
        return false;
    }
    public static void sayHello (String name){
        System.out.println("Hello, " + name+ "!");
    }
//    public static void whatTheYear(int a){
//        if (a % 4 != 0){
//            System.out.println("Не високосный");
//        }
//        else if (a% 100 ==0){
//            if (a% 400 ==0){
//                System.out.println("Високосный");
//            }else System.out.println(" Не високосный ");
//        } else System.out.println(" Високосный ");
//    }

    public static void whatTheYear(int a){
        if(a %4 !=0 || a% 100 == 0 && a % 400 != 0 ){
            System.out.println("Не високосный");
        } else System.out.println("Високсный");
    }




}
