package com.example.demo.board.board.service;

import com.example.demo.board.board.vo.BoardVo;
import java.util.List;

public interface boardService {

    List<BoardVo> selectBoardList() throws Exception;
}
