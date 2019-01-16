package org.andestech.learning.rfb18.g2;

public class SimpleVars {

    public static void main(String[] args)
    {
        byte b01, b02 = 120, моиДанные=12;
        b01=123;

        System.out.println(b01);
        System.out.println(b02);
        System.out.println(Integer.toBinaryString(b01));

        //ops

        byte bt01 = 0b01011;
        byte bt02 = 0b10010;

        // xor encode & decode
        byte res = (byte) ( ~((bt01 ^ bt02) ^ bt02));


        
        System.out.println("result: " + Integer.toBinaryString(res));

        //------------------------------

        short sh01= 456, sh02 = (1<<15) - 1;
        short sh03 = -(1<<15);
        System.out.println("sh01=" + sh01);
        System.out.println("sh02=" + sh02);
        System.out.println("sh03=" + sh03);
        System.out.println("Max Short: " + Short.MAX_VALUE +
                        "Min Short: " + Short.MIN_VALUE
                );

//------------------------------
        int i01 = (1<<31) - 1, i02 = -(1<<31);
        System.out.println(i01 + ", " + i02);
        System.out.println("Max Int: " + Integer.MAX_VALUE +
                "Min Int " + Integer.MIN_VALUE
        );

//--------------------------------

        long L01 = 3_222_134_444_888L;

// floats --------------------

         float f1 = 123456789.12345f;
         float f2 = 0.11f+0.31f - 0.42f;
        System.out.println(f2);

// double

         double d01 = 0.1234567890123456789;
         System.out.println(d01);

// char
     char ch01 = 'A', ch02= 2, ch03=64356;

        System.out.println((char)(ch01+1));
        System.out.println((char)(23648));

//  boolean

    boolean bool1=true, bool2 = false, bool3 = 2>-1;




    }
}
