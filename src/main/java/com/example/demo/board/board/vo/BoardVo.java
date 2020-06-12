package com.example.demo.board.board.vo;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class BoardVo {
    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId;
    private LocalDateTime createDatetime;
    private String updateId;
    private LocalDateTime updateDatetime;
}
