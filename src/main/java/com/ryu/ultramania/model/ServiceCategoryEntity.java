package com.ryu.ultramania.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "service_category")
public class ServiceCategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "category_code")
    private String categoryCode;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_label")
    private String categoryLabel;

    @Column(name = "category_parent_code")
    private String categoryParentCode;

    @Column(name = "category_level")
    private long categoryLevel;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updateAt;


    @PrePersist
    public void beforeCreate() {
        createdAt = new Date();
    }

    public ServiceCategoryEntity() {
    }

    @Override
    public String toString() {
        return "category{" +
                "Id=" + Id +
                ", categoryCode='" + categoryCode + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", categoryLabel='" + categoryLabel + '\'' +
                ", categoryLevel='" + categoryLevel + '\'' +
                ", categoryParentCode='" + categoryParentCode + '\'' +
                '}';
    }
}
