package com.mvc.jspservletspringmvc.controller;

import com.mvc.jspservletspringmvc.dto.Board;
import com.mvc.jspservletspringmvc.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("/board")
public class BoardController {
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/list")
    public String getBoardList(Model model) {
        model.addAttribute("boards", boardService.getBoardList());
        return "board/list";
    }

    @GetMapping("/view")
    public String getBoardByID(@RequestParam("id") int id, Model model) {
        model.addAttribute("board", boardService.getBoardByID(id));
        return "board/view";
    }

    @PostMapping("/saveBoard")
    public String saveBoard(@RequestParam("id") int id,
                            @RequestParam("title") String title,
                            @RequestParam("author") String author,
                            @RequestParam("body") String body) {
        Date date = java.sql.Date.valueOf(LocalDate.now());
        Board board = new Board(id, author, title, body, date);
        boardService.addBoard(board);
        return "redirect:/board/list";
    }

    @GetMapping("/write")
    public String goWrite() {
        return "board/write";
    }

}
