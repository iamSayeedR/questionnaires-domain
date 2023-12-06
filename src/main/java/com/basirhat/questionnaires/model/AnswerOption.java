package com.basirhat.questionnaires.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

@Builder
public record AnswerOption(

        @NotNull
        int questionId,
        @NotNull
        @Size(min = 1, max = 10)
        List<String> answers) {}
