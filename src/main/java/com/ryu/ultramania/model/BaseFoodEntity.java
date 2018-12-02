package com.ryu.ultramania.model;


import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;

@Data
public class BaseFoodEntity {

    private String name;
    private String price;
    private Integer deliciousDegree;
    private ArrayList<PictureData> pictureDataArrayList;

    //basic or set
    private String type;


}
