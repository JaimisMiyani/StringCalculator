public class StringCalculator {
    public int Add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        } else {
            String[] nums = numbers.split(",|\n");
            return sumNumbers(nums);
        }
    }

    public int sumNumbers(String[] nums){
        int SUM = 0;
        for(String each : nums){
            SUM += Integer.parseInt(each);
        }
        return SUM;
    }
}
