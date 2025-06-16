package ru.netology.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {  // доход, расход, порог.
        int vacationMonth = 0;                                       // месяцев отпуска
        int bank = 0;                                                // количество денег
        for (int i = 0; i < 12; i++) {
            if (bank >= threshold) {                                 // отпуск
                bank = bank - expenses;
                bank = bank / 3;
                vacationMonth++;
            } else {
                bank = bank + income - expenses;                       // продолжаем работать
            }
        }
        return vacationMonth;
    }

}