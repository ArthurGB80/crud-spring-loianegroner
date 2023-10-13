package com.arthurgb80.crudspring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LessonDTO(
    Long id,
    @NotNull @NotBlank @Size(min = 5, max = 100) String name,
    @NotNull @NotBlank @Size(min=10, max = 10) String youtubeUrl)
    {
}
