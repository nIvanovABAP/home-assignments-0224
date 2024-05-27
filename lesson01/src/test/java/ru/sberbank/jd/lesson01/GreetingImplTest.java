package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

public class GreetingImplTest {

    GreetingImpl greeting = new GreetingImpl();

    @Test
    public void testLastName() {
        String lastName = greeting.getLastName();
        Assert.assertEquals("Иванов", lastName);
    }

    @Test
    public void testFirstName(){
        String firstName = greeting.getFirstName();
        Assert.assertEquals("Никита", firstName);
    }

    @Test
    public void testBirthYear(){
        int birthYear = greeting.getBirthYear();
        Assert.assertEquals(1992, birthYear);
    }

    @Test
    public void testHobbies(){
        Collection<String> hobbies = greeting.getHobbies();
        Assert.assertEquals(List.of("футбол", "кино", "фондовый рынок"), hobbies);
    }

    @Test
    public void testRepoUrl(){
        String repoUrl = greeting.getRepoUrl();
        Assert.assertEquals("git@github.com:nIvanovABAP/home-assignments-0224.git", repoUrl);
    }

    @Test
    public void testPhone(){
        String phone = greeting.getPhone();
        Assert.assertEquals("+7 (977) 829-48-76", phone);
    }

    @Test
    public void testExpectations(){
        Collection<String> courseExpectations = greeting.getCourseExpectations();
        Assert.assertEquals(List.of("Изучить Git", "Изучить Spring", "Брать задачи по Java в рамках работы"),
                  courseExpectations );
    }
}
