public class Phone_Number {
    public static String createPhoneNumber(int[] numbers) {
        if(numbers.length != 10){
            throw new IllegalArgumentException("Must have 10 digits to process");
        }

        return String.format("(%d%d%d) %d%d%d%d - %d%d%d", 
        numbers[0], numbers[1],numbers[2],
        numbers[3], numbers[4], numbers[5],
         numbers[6], numbers[7], numbers[8], numbers[9]);
    }
    public static void main(String[] args) {
        int[] phone_number = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(phone_number));
        System.out.println(phoneNumber(phone_number));
    }

    public static String phone_Number(int[] n)
    {
        
        return String.format("(%d%d%d) - %d%d%d%d %d%d%d",
         n[0], n[1], n[2],
         n[3], n[4], n[5],
         n[6], n[7], n[8],
         n[9]);
    }

    public static String phoneNumber(int[] number)
    {
        char[] n = String.valueOf(number).toCharArray();
        return String.format("(%d%d%d) - %d%d%d%d %d%d%d",
         n[0], n[1], n[2],
         n[3], n[4], n[5],
         n[6], n[7], n[8],
         n[9], n[10]);
    }
}
