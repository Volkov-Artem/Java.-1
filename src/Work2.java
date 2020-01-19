public class Work2 {
    public static void main(String[] args) {
        int [] universalArray = {2,1,4,5,6,10,5,2,1,4,14,5,3,8};
        System.out.println("задание №1");
        invertArray();
        System.out.println("задание №2");
        fillArray();
        System.out.println("задание №3");
        multiplyArray();
        System.out.println("задание №4");
        twoDimensionalArray();
        System.out.println("Задание № 5");
        minMaxArray();
        System.out.println("Задание № 6");
        System.out.println(sumLeftRight(universalArray));
        System.out.println("Задание № 7");
        offsetArray(universalArray,3);

    }
        public static void invertArray(){
            int [] numberOne = {0,1,1,0,0,1};
            for (int i =0; i < numberOne.length;i++ ){
                if (numberOne [i] == 0){
                    numberOne [i] = 1;
                }else numberOne [i] = 0;
                System.out.println(numberOne [i]);
            }
        }
        public static void fillArray(){
            int [] numberTwo = new int [8];
            for (int i = 0, j = 0;  i < numberTwo.length;i++ ,j +=3){
                numberTwo [i] = j;
                System.out.println(numberTwo[i]);
            }
        }
        public static void multiplyArray() {
        int [] numberThree = {1,5,3,2,11,4,5,2,4,8,9,1};
            for (int i = 0; i < numberThree.length ; i++) {
              if (numberThree[i]< 6) numberThree [i] *= 2;
                System.out.println(numberThree [i]);
            }
    }

        public static void twoDimensionalArray() {
        int [][] numberFour = new int [9][9];
            for (int i = 0; i < 9 ; i++) {
                for (int j = 0 , jInk = 8; j < 9 ; j++, jInk--) {
                    if (i == j || i == jInk) numberFour[i][j] = 1;
                    System.out.print(numberFour[i][j] + " ");

                }
                System.out.println("\r");
            }
        }
        public static void minMaxArray(){
        int [] numberFive = {2,5,7,4,1,3,7,9};
        int max = numberFive [0];
        int min = numberFive [0];
            for (int i = 0; i < numberFive.length; i++) {
                if (numberFive[i] > max) {
                    max = numberFive [i];
                }
                if (numberFive[i]< min) {
                    min = numberFive [i];
                }
            }
            System.out.println(" Минимальный элемент массива " + min);
            System.out.println(" Максимальный элемент массива " + max);
        }

        public static boolean sumLeftRight(int [] arrSum){
            for (int i = 0; i < arrSum.length ; i++) {
                int left = 0;
                int right =0;
                for (int j = 0; j < i ; j++) {
                    left += arrSum[j];
                }
                for (int j = i; j < arrSum.length; j++) {
                    right += arrSum[j];
                }
                if (left == right)return true;
            }
            return false;
        }

        public static void offsetArray(int [] offset ,  int n) {
            for (int i = 0; i < offset.length; i++) {
                System.out.print(offset[i] + " ");
            }
            System.out.println(" начальный вид массива ");
            if (n > 0) {
                for (int x = 0,score = 1; x < n; x++,score++) {
                    int buf = offset[offset.length - 1];
                    System.arraycopy(offset, 0, offset, 1, offset.length - 1);
                    for (int i = 0; i < offset.length; i++) {
                        offset[0] = buf;
                        System.out.print(offset[i] + " ");
                    }
                    System.out.println(" сдвиг на " + score);
                }
            }
            if (n < 0) {
                for (int x = 0,score = -1; x > n; x--,score--) {
                    int buf = offset[0];
                    System.arraycopy(offset, 1, offset, 0, offset.length - 1);
                    for (int i = 0; i < offset.length; i++) {
                        offset[offset.length -1] = buf;
                        System.out.print(offset[i] + " ");
                    }

                    System.out.println(" сдвиг на " + score);
                }
            }

        }
}

