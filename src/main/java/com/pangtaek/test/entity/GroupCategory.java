package com.pangtaek.test.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "group_category_id ")
public class GroupCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int groupCategoryId;
    private String groupCategoryName;
}
