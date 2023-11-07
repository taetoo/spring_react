package com.react.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardDto<B> {

    private Long bno;
    private String title;
    private String writer;
    private String content;

    private Timestamp regdate;
    private Timestamp updatedate;

}
