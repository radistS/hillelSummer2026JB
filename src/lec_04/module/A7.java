package lec_04.module;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
Ціна з ПДВ --> Ціна без ПДВ
 */
public class A7 {
    static void main() {
        int priceVat = 120;
        double vat = 20;

        // int priseWithoutVat - ?

        double priseWithoutVat = priceVat - (priceVat * vat / 100);
        System.out.println(priseWithoutVat);

        System.out.println(priseWithoutVat + (priseWithoutVat * vat / 100));

        System.out.println(priceVat / (1 + (vat / 100)));


        BigDecimal b = new BigDecimal(123.345d);
        b = b.setScale(2, RoundingMode.HALF_DOWN);
        System.out.println(b);




    }
}
