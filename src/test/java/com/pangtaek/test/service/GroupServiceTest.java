package com.pangtaek.test.service;

import com.pangtaek.test.dto.GroupInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GroupServiceTest {

    @Autowired
    private GroupService service;

    @Test
    public void findGroupByGroupStatus() {
        Assertions.assertDoesNotThrow(
                () -> {
                    List<GroupInfoDTO> list = service.findGroupByGroupStatus();
                    list.forEach(System.out::println);
                }
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {12})
    public void findGroupByGroupId(Integer groupId) {
        GroupInfoDTO foundGroup = service.findGroupByGroupId(groupId);
        Assertions.assertNotNull(foundGroup);
    }
}