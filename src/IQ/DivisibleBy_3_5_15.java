package IQ;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {
        String divisibleBy3 = "Divisible by 3: ";
        String divisibleBy5 = "Divisible by 5: ";
        String divisibleBy15 = "Divisible by 15: ";
        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                divisibleBy15 += "" + i + ", ";
            }else if(i % 3 == 0){
                divisibleBy3 += "" + i + ", ";
            }else if(i % 5 == 0){
                divisibleBy5 += "" + i + ", ";
            }
        }
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy15);
    }
}
