package com.heatdeath.service;

import com.heatdeath.vo.ProductCategory;

import java.util.List;

/**
 * Author:  heatdeath
 * Date:    2018/4/7
 * Desc:    ProductCategory service 接口
 */
public interface ProductCategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
