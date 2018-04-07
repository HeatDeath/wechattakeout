package com.heatdeath.service.impl;

import com.heatdeath.vo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Author:  heatdeath
 * Date:    2018/4/7
 * Desc:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired
    private ProductCategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertNotNull(productCategory);

    }

    @Test
    public void findAll() throws Exception {

        List<ProductCategory> productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> lists = Arrays.asList(1, 2, 2);
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(lists);
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("summer-hot", 1);
        Assert.assertNotNull(categoryService.save(productCategory));
    }

}