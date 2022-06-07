package ru.netology.javahwsqr.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javahwsqr.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
  //  @CsvSource({
//
  //  })
    @CsvFileSource(files = "src/test/resources/multipliers.csv")
    public void shouldCalcExact(int borderLow, int borderHigh){
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSqr(borderLow, borderHigh);

        Assertions.assertEquals(expected, actual);


    }

}
