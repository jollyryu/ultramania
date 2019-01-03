package com.ryu.ultramania.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "service_user")
public class UserEntity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "user_id")
//    @NotNull(message = "아이디는 null 일 수 없습니다.")
    private String userId;

    @Column(name = "user_name")
//    @NotNull(message = "이름은 null 일 수 없습니다.")
    private String userName;

    @Column(name = "user_email")
//    @NotNull(message = "email은 null 일 수 없습니다.")
    private String userEmail;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_status")
    private String userStatus;

    @Column(name = "created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date createdAt;

    @Column(name = "updated_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date updateAt;

    @PrePersist
    public void beforeCreate() {
        createdAt = new Date();
    }

    public UserEntity() {
    }


    public UserEntity(String userId, String userName, String userEmail, String userStatus, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userStatus = userStatus;
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userStatus='" + userStatus + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
