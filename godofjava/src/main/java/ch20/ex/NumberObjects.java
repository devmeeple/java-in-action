package ch20.ex;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects sample = new NumberObjects();

        sample.parseLong("r1024");
        sample.parseLong("1024");
        sample.printOtherBase(1024);
    }

    public long parseLong(String data) {
        long result = -1;
        try {
            result = Long.parseLong(data);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println(data + " is not a number");
        } catch (Exception e) {
        }
        return result;
    }

    public void printOtherBase(long value) {
        String binaryString = Long.toBinaryString(value);
        String hexString = Long.toHexString(value);
        String octalString = Long.toOctalString(value);

        System.out.println("Original:" + value);
        System.out.println("Binary  :" + binaryString);
        System.out.println("Hex     :" + hexString);
        System.out.println("Octal   :" + octalString);
    }
}
