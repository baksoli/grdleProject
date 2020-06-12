package com.example.demo.board.board.service.impl;

import com.example.demo.board.board.mapper.boardMapper;
import com.example.demo.board.board.service.boardService;
import com.example.demo.board.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class boardServiceImpl implements boardService {

    @Autowired
    private boardMapper boardMapper;

    @Override
    public List<BoardVo> selectBoardList() throws Exception {
        return boardMapper.seletBoardList();
    }
}
