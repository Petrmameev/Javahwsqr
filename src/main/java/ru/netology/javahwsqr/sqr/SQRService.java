package ru.netology.javahwsqr.sqr;
public class SQRService {
    public int calcSqr(int borderlow, int borderHigh){
        int amountSquare = 0;

        for (int i = 10; i < 100; i++) {
            if (i*i >= borderlow && i*i <= borderHigh) {
                amountSquare = amountSquare + 1;
            }

        }
        return amountSquare;
    }
}
