package Lib;

import java.util.ArrayList;

public class ShoppingCartCalculator {

    /**
     * เขียน Javadoc ที่นี่เพื่ออธิบายกฎการทำงานและกรณีพิเศษ:
     * Normal:
     * BOGO: ถ้า sku เป็น "BOGO" จะใช้โปรโมชันซื้อ 1 แถม 1
     * BULK: ถ้า sku เป็น "BULK" และจำนวนชิ้นตั้งแต่ 6 ขึ้นไป จะได้รับส่วนลด 10% จากราคารวมของสินค้านั้น
     * @param รายละเอียดสินค้าที่userจะซื้อ
     * @return Total
     */
     public static double calculateTotalPrice(ArrayList<CartItem> items) {
        double total = 0.0;
        CartItem cartItem = null;

        if (items == null) {
            return total;
        } else if (cartItem.sku().equals("NORMAL")) {
                    total += cartItem.quantity() * cartItem.price();
        } else if (cartItem.sku().equals("BOGO")) {
                    double bogoitem = Math.floor(cartItem.quantity() / 2) + (cartItem.quantity() % 2);
                    total += bogoitem * cartItem.price();
        }else if (cartItem.sku().equals("BULK")) {
                    if (cartItem.quantity() >= 6) {
                        total = cartItem.quantity() * cartItem.price()* 0.9;
                    }
 
        } 
  return total;
 }
}