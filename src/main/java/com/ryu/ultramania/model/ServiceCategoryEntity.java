package com.ryu.ultramania.model;

import javax.persistence.*;
import java.util.Date;

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

    private Date createdAt;

    @PrePersist
    public void beforeCreate(){
        createdAt = new Date();
    }

    public ServiceCategoryEntity(){

    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public long getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(long categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public String getCategoryParentCode() {
        return categoryParentCode;
    }

    public void setCategoryParentCode(String categoryParentCode) {
        this.categoryParentCode = categoryParentCode;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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
