package com.lisk.spring.boot;

import com.lisk.spring.boot.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentPropertiesTest {

    @Autowired
    private Student student;

    @Test
    public void test() {
        System.out.println(student);
    }


}
