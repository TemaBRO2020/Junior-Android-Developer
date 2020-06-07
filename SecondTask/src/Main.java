public class Main {

    public static void main(String[] args) {
        int[] price = {5,100,20,66,16};
        int discount = 50;
        int offset = 1;
        int readLength = 3;

        Discount d = new Discount();
        d.decryptData(price, discount, offset, readLength);
    }
}