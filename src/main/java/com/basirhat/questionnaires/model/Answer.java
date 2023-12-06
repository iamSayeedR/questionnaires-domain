package com.basirhat.questionnaires.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

@Builder
public record Answer (
        @NotBlank(message = "Question type cannot be blank")
        String type,

        @NotNull
        @Size(min = 1, max = 10)
        List<AnswerOption> answer ) {}
