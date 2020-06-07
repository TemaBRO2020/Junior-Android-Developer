public class Discount {

    public int[] decryptData(int[] price, int discount, int offset, int readLength) {
        System.out.print("[");
        for (int i = offset; i <= readLength; i++) {
            System.out.print((int)Math.floor(price[i]/ 100.0 * discount));
            if (i != readLength) {
                System.out.print(",");
            }
        }
        System.out.println("]");
        return price;
    }
}