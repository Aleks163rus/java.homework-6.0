package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Vacatio.csv")

    public void TestVacationCalculation(int income, int expenses, int threshold, int expected) {

        VacationService service = new VacationService();


        int quantity = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, quantity);
    }

//    @Test
//
//    public void Test1VacationCalculation() {
//
//        VacationService service = new VacationService();
//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//
//        int quantity = service.calculate(income, expenses, threshold);
//
//        int expected = 3;
//        Assertions.assertEquals(expected, quantity);
//    }
//
//    @Test
//
//    public void Test2VacationCalculation() {
//
//        VacationService service = new VacationService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//
//        int quantity = service.calculate(income, expenses, threshold);
//
//        int expected = 2;
//        Assertions.assertEquals(expected, quantity);
//    }

}
