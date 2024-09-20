package com.pangtaek.test.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "group_info")
public class GroupInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupId;
    private int memberCounting;
    private int groupStatus;
    private Date createDate;
    private Date endTime;
    private String groupPost;
    private int memberId;
    private int groupCategoryId;
    private boolean isBlinded;

    public void modifyGroupCounting(int memberCounting) {
        this.memberCounting = memberCounting;
    }

    public void modifyEndDate(Date endTime) {
        this.endTime = endTime;
    }

    public void modifyGroupCategoryId(int groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public void modifyGroupPost(String groupPost) {
        this.groupPost = groupPost;
    }
}
