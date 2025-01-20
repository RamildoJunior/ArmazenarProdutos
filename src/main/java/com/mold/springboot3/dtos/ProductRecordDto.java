package com.mold.springboot3.dtos;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRecordDto(@NotBlank String name, @NotBlank BigDecimal value) {
}
