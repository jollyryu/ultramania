package com.ryu.ultramania.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;


@Data
@Entity
@Table(name = "free_board")
public class FreeBoardEntity {
    @Id
    @Column(name = "board_id")
    private String boardId;

    @Column(name = "uname")
    private String userName;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "content")
    private String content;

    @Column(name = "viewcount")
    private int viewCount;

    @Column(name = "wdate")
    private Date wdate;

    @Override
    public String toString() {
        return "FreeBoardEntity{" +
                "boardId='" + boardId + '\'' +
                ", userName='" + userName + '\'' +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", content='" + content + '\'' +
                ", viewCount=" + viewCount +
                ", wdate=" + wdate +
                '}';
    }
}
