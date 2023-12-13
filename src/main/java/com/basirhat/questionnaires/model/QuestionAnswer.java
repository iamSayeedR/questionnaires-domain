package com.basirhat.questionnaires.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

@Builder
public record QuestionAnswer(

        @NotNull
        int questionId,
        @NotBlank(message = "answer can not be null or empty")
        List<String> answer) {

}
