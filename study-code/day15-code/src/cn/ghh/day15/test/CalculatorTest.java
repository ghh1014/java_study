package cn.ghh.day15.test;

import cn.ghh.day15.demo01.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    /**
     * 初始化方法
     * 用于资源申请，所有测试方法执行之前都会先执行该方法
     */
    @BeforeEach
    public void init(){
        System.out.println("init...");
    }

    /**
     * 所有方法执行完后都会执行该方法
     */
    @AfterEach
    public void close(){
        System.out.println("close");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        Assertions.assertEquals(3,result);
    }

    /**
     * 测试sub方法
     */
    @Test
    public void testSub(){
        Calculator calculator = new Calculator();
        int result = calculator.sub(1, 2);
        Assertions.assertEquals(-1,result);
    }
}
