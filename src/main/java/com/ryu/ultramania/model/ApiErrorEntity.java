package com.ryu.ultramania.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ApiErrorEntity {
    private String message;
    private int code;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Seoul")
    private Date timeStamp;

    @Override
    public String toString() {
        return "ApiErrorEntity{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
