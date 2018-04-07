package com.heatdeath.service.impl;

import com.heatdeath.dao.ProductCategoryDao;
import com.heatdeath.service.ProductCategoryService;
import com.heatdeath.vo.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:  heatdeath
 * Date:    2018/4/7
 * Desc:    ProductCategory service 实现类
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategorydao;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productCategorydao.findById(categoryId).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategorydao.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategorydao.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategorydao.save(productCategory);
    }
}
