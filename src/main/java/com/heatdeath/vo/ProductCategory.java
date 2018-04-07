package com.heatdeath.vo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Author:  heatdeath
 * Date:    2018/4/7
 * Desc:    ProductCategory 实体
 */
@Entity
@DynamicUpdate
@Data
@Table(name = "product_category")
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = 4884977351099236832L;
    /**
     * 类目id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /**
     * 类目名字.
     */
    private String categoryName;

    /**
     * 类目编号.
     */
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
