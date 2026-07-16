interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 5;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {
        return code.startsWith("SAVE") && CouponValidator.isLengthValid(code);
    }

    public static void main(String[] args) {

        String coupons[] = {
                "SAVE10",
                "ABC",
                "SAVE50",
                "OFF20"
        };

        ShoppingCart obj = new ShoppingCart();

        for (String coupon : coupons) {

            if (obj.validateCoupon(coupon))
                System.out.println(coupon + " -> Valid");
            else
                System.out.println(coupon + " -> Invalid");
        }
    }
}