package com.pangtaek.test.controller;

import com.pangtaek.test.dto.GroupInfoDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GroupControllerTest {

    @Autowired
    private GroupController controller;

    @Test
    public void findGroupByGroupStatus() {
        Assertions.assertNotNull(controller);
    }


}