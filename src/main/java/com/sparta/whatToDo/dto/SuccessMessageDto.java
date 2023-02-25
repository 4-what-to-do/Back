package com.sparta.whatToDo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SuccessMessageDto {
    private String msg;
    private int statusCode;
}
