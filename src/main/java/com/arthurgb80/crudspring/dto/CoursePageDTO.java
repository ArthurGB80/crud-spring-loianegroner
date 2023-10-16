package com.arthurgb80.crudspring.dto;

import java.util.List;

public record CoursePageDTO(List<CourseDTO> courses, int page, int size, long totalElements, int totalPages) {

    
}
