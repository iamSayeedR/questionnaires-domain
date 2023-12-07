package com.basirhat.questionnaires.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

@Builder
public record AnswerRequest(
        @NotBlank(message = "Question type cannot be blank")
        String type,
        @NotBlank(message = "ClientId cannot be null or empty")
        String clientId,
        @NotNull
        @Size(min = 1, max = 10)
        List<Answer> answers) {}
