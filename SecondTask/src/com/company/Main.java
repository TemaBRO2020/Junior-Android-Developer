package com.company;

class SecondTask {


        public static void main(String[] args) {
            int[] price = {5, 100, 20, 66, 16};
            int discount = 50;
            int offset = 1;
            int readLength = 3;

            Discount d = new Discount();
            d.decryptData(price, discount, offset, readLength);
        }

}

class Discount {

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