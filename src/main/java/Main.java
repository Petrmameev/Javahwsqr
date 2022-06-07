import ru.netology.javahwsqr.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        //int borderLow = 200;
        //int borderHigh = 300;

        SQRService service = new SQRService();
        System.out.println(service.calcSqr(200, 300));

    }
}
