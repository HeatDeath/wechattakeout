package com.heatdeath.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.heatdeath.vo.ProductCategory;

import java.util.List;

/**
 * Author:  heatdeath
 * Date:    2018/4/7
 * Desc:    ProductCategory dao
 */
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Integer> {
    /**
     * 通过类目id查找类目
     *
     * @param categoryTypeList 商品类别 数组
     * @return  商品类别
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
