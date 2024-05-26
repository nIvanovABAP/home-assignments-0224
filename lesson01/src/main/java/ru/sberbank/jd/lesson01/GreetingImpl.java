package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

public class GreetingImpl implements Greeting {
    @Override
    public String getFirstName() {
        return "";
    }

    @Override
    public String getLastName() {
        return "";
    }

    @Override
    public int getBirthYear() {
        return 0;
    }

    @Override
    public Collection<String> getHobbies() {
        return List.of();
    }

    @Override
    public String getRepoUrl() {
        return "";
    }

    @Override
    public String getPhone() {
        return "";
    }

    @Override
    public Collection<String> getCourseExpectations() {
        return List.of();
    }
}
