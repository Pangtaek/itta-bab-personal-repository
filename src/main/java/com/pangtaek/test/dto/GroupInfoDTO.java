package com.pangtaek.test.dto;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class GroupInfoDTO {
    private int groupId;
    private int memberCounting;
    private int groupStatus;
    private Date createDate;
    private Date endTime;
    private String groupPost;
    private int memberId;
    private int groupCategoryId;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getMemberCounting() {
        return memberCounting;
    }

    public void setMemberCounting(int groupCounting) {
        this.memberCounting = groupCounting;
    }

    public int getGroupStatus() {
        return groupStatus;
    }

    public void setGroupStatus(int groupStatus) {
        this.groupStatus = groupStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEndDate() {
        return endTime;
    }

    public void setEndDate(Date endTime) {
        this.endTime = endTime;
    }

    public String getGroupPost() {
        return groupPost;
    }

    public void setGroupPost(String groupPost) {
        this.groupPost = groupPost;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(int groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    @Override
    public String toString() {
        return "GroupInfoDTO{" +
                "groupId=" + groupId +
                ", groupCounting=" + memberCounting +
                ", groupStatus=" + groupStatus +
                ", createDate=" + createDate +
                ", endTime=" + endTime +
                ", groupPost='" + groupPost + '\'' +
                ", memberId=" + memberId +
                ", groupCategoryId=" + groupCategoryId +
                '}';
    }
}
