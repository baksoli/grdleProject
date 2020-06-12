package com.example.demo.board.board.controller;

import com.example.demo.board.board.service.boardService;
import com.example.demo.board.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private boardService boardService;

    @RequestMapping("/board.do")
    public ModelAndView openBoardList() throws Exception{
        ModelAndView mv = new ModelAndView("/demoTest");

        List<BoardVo> list = boardService.selectBoardList();
        mv.addObject("list", list);

        return mv;
    }
}
