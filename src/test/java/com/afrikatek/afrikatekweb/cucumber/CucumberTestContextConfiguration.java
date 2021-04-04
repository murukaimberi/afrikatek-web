package com.afrikatek.afrikatekweb.cucumber;

import com.afrikatek.afrikatekweb.AfrikatekwebApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = AfrikatekwebApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
