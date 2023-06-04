package com.bookclub;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bookclub.web.AdminController;
import com.bookclub.web.HomeController;
import com.bookclub.web.WishlistController;
import com.bookclub.web.WishlistRestController;

@SpringBootTest
public class SmokeTest {

    @Autowired 
    private HomeController controller;
    
    @Autowired
    private WishlistController controller2;

    @Autowired
    private AdminController controller3;

    @Autowired
    private WishlistRestController controller4;

    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
        assertThat(controller2).isNotNull();
        assertThat(controller3).isNotNull();
        assertThat(controller4).isNotNull();
    }
    
}
