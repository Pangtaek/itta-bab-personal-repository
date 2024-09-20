package com.pangtaek.test.mapper;

import com.pangtaek.test.dto.GroupInfoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupInfoMapper {
    /* 전체 모임 조회*/
    List<GroupInfoDTO> findGroupByGroupStatus();

    /* 특정 모임 조회 */
    GroupInfoDTO findGroupByGroupId(Integer groupId);
}
