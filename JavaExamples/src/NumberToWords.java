public class NumberToWords {
    public static void numberToWords (int num){
        int reminder=0;
        if(num<0){
            System.out.println("Invalid Value");
        }else{
            int reversed=reverse(num);
            int size=getDigitCount(num);
            System.out.println(size);

            for(int i=0, a=1;i<size;i++,a*=10) {
                reminder = reversed% 10;
                reversed = reversed / 10;

                switch (reminder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid digit");
                        break;
                }
            }
        }
    }

    public static int getDigitCount(int num){
        int size=0;
            if(num<0) {
                return -1;
            }else if (num==0) {
                return 1;
            }else{
                while(num>0) {
                    num=num/10;
                    size++;
                }
            }
            return size;
    }
    public static int reverse(int num){//123
        int isNegative=1;
        if(num<0){
            isNegative=-1;
        }
        int size=getDigitCount(isNegative*num),zeros=1,reminder=0,newNum=0;
        for(int i=0;i<size;i++){zeros*=10;}
        for(int i=0, a=1;i<size;i++,a*=10){
            reminder=num%10;
            num=num/10;
            zeros/=10;
            newNum+=reminder*zeros;

            System.out.println(newNum+" "+reminder);
        }

        return newNum;
    }

    public static void main(String[] args) {
        numberToWords(10);
        //System.out.println(reverse(-121));
        //System.out.println(getDigitCount(0));


    }
}