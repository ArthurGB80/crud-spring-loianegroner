package com.arthurgb80.crudspring.enums.converters;

import java.util.Optional;
import java.util.stream.Stream;

import com.arthurgb80.crudspring.enums.Category;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class CategoryConverter implements AttributeConverter<Category, String> {

@Override
public String convertToDatabaseColumn(Category category) {
    return Optional.ofNullable(category)
            .map(Category::getValue)
            .orElse(null);
}

@Override
public Category convertToEntityAttribute(String value) {
    if (value == null) {
        return null;
    }
    return Stream.of(Category.values())
            .filter(c -> c.getValue().equals(value))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException());
}

}
