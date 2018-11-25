package com.ryu.ultramania.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_email")
    private String memberEmail;

    @Column(name = "member_password")
    private String memberPassword;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updateAt;


    @PrePersist
    public void beforeCreate() {
        createdAt = new Date();
    }

    public MemberEntity() {
    }

    @Override
    public String toString() {
        return "memberEntity{" +
                "id='" + id + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
