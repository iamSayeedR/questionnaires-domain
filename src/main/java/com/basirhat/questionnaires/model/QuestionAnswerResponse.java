package com.basirhat.questionnaires.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;
@Builder
public record QuestionAnswerResponse(

        @NotNull
        List<QuestionAnswer> questionAnswers) {
}
