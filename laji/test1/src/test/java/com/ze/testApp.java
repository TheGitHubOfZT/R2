package com.ze;

import com.zt.App;
import com.zt.controller.MyController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={App.class})
public class testApp {
    @Autowired
    private MyController myController;
    @Test
    public void test1(){
        myController.A();
    }
}
