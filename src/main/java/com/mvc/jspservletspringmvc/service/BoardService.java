package com.mvc.jspservletspringmvc.service;

import com.mvc.jspservletspringmvc.dao.BoardDAO;
import com.mvc.jspservletspringmvc.dto.Board;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BoardService {
    private final BoardDAO boardDAO;

    public BoardService(BoardDAO boardDAO) {
        this.boardDAO = boardDAO;
    }

    public ArrayList<Board> getBoardList() {
        return boardDAO.getBoardList();
    }

    public Board getBoardByID(int id) {
        return boardDAO.getBoardByID(id);
    }

    public boolean addBoard(Board board) {
        return boardDAO.addBoard(board);
    }

}
