package com.pangtaek.test.mapper;

import com.pangtaek.test.dto.GroupCommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupCommentMapper {
    List<GroupCommentDTO> findGroupCommentsByGroupId(Integer groupId);
}
