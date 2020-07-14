package com.mimall.mall;

import com.mimall.mall.dao.CategoryMapper;
import com.mimall.mall.pojo.Category;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void contextLoads() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

}
