package com.houzhenguo.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class BeanTest {
    @Autowired
    private CompactDisc cd;
    @Test
    public void cdShouldNotBeNull(){
        System.out.println(cd);
    }
}
