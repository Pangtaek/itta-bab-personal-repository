package com.pangtaek.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
public class GroupCommentDTO {
    private int groupCommentId;
    private int groupId;
    private String commentContent;
    private Date createDate;
    private Date updateDate;
    private int memberId;

    public int getGroupCommentId() {
        return groupCommentId;
    }

    public void setGroupCommentId(int groupCommentId) {
        this.groupCommentId = groupCommentId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "GroupCommentDTO{" +
                "groupCommentId=" + groupCommentId +
                ", groupId=" + groupId +
                ", commentContent='" + commentContent + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", memberId=" + memberId +
                '}';
    }
}
