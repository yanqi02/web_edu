package com.upc.demo;

import com.upc.demo.bean.tshow;
import com.upc.demo.mapper.UserMapper;
import com.upc.demo.mapper.showMapper;
import org.junit.jupiter.api.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
class DemoApplicationTests {
@Autowired
private showMapper showMapper;
    @Test
    void contextLoads() {
for(tshow tt:showMapper.sList())
{
    System.out.println(tt.getUsername());
}
        System.out.println( showMapper.sList());
    }

}
