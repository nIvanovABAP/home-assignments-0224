package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Класс для получения данных об ученике.
 */
public class GreetingImpl implements Greeting {

    /**
     * Метод получения имени.
     *
     * @return возвращает имя автора программы
     */
    @Override
    public String getFirstName() {
        return "Никита";
    }

    /**
     * Метод получения фамилии.
     *
     * @return возвращает фамилию автора программы
     */
    @Override
    public String getLastName() {
        return "Иванов";
    }

    /**
     * Метод получения года рождения.
     *
     * @return возвращает год рождения автора программы в формате int
     */
    @Override
    public int getBirthYear() {
        return 1992;
    }

    /**
     * Метод получения хобби.
     *
     * @return возвращает список хобби автора программы
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of("футбол", "кино", "фондовый рынок");
    }

    /**
     * Метод получения Url.
     *
     * @return возвращает ссылку на репозиторий
     */
    @Override
    public String getRepoUrl() {
        return "git@github.com:nIvanovABAP/home-assignments-0224.git";
    }

    /**
     * Метод получения номера телефона.
     *
     * @return возвращает номер телефона в виде строки
     */
    @Override
    public String getPhone() {
        return "+7 (977) 829-48-76";
    }

    /**
     * Метод получения списка ожиданий от курса.
     *
     * @return возвращает список ожиданий от курса по Java
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("Изучить Git", "Изучить Spring", "Брать задачи по Java в рамках работы");
    }
}
