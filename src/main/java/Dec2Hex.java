class Dec2Hex {

    public static int arg1;

    public static void main(String args[]) {
    }

    public static int recieveInputAndConvertToInteger(String[] input) {
        if (input.length > 0) {
            try {
                arg1 = Integer.parseInt(input[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + input[0] + " must be an integer.");
                System.exit(1);
            }
        }
        System.out.println("Triggering build");
        covertIntegerToHex(arg1);
        return arg1;
    }

    private static void covertIntegerToHex(int arg1) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }
        System.out.println("Hexadecimal representation is : " + hexadecimal);
    }
}