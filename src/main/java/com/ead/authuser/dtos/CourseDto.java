package com.ead.authuser.dtos;

import com.ead.authuser.enums.CourseLevel;
import com.ead.authuser.enums.CourseStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class CourseDto {

    private String name;
    private String description;
    private String imageurl;
    private CourseStatus courseStatus;
    private CourseLevel courseLevel;
    private UUID userInstructor;
}
