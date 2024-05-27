package ru.sberbank.jd.lesson02;

/**
 * Реализация расчета НОД.
 */
public class NodImpl implements Nod {
    /**
     * Расчет наибольшего общего делителя.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {

        int nod = Math.min(Math.abs(first), Math.abs(second));

        if (first == 0) {
            return second;
        }

        if (second == 0) {
            return first;
        }

        while (nod > 1) {

            if (first % nod == 0 && second % nod == 0) {
                return nod;
            }

            nod--;
        }

        return 1;
    }
}
