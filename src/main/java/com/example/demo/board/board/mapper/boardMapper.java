package com.example.demo.board.board.mapper;

import com.example.demo.board.board.vo.BoardVo;

import java.util.List;

public interface boardMapper {
    List<BoardVo> seletBoardList() throws Exception;
}
