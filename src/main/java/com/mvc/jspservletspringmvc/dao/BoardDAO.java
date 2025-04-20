package com.mvc.jspservletspringmvc.dao;

import com.mvc.jspservletspringmvc.dto.Board;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;

@Repository
public class BoardDAO {
    public BoardDAO() {
    }

    public static ArrayList<Board> boardList = new ArrayList<>();

    static {
        boardList.add(new Board(1, "Alice", "Welcome to the Board!", "Hello everyone, this is my first post. Excited to join!", java.sql.Date.valueOf(LocalDate.of(2025, 2, 10))));
        boardList.add(new Board(2, "Bob", "Question about Spring MVC", "Can someone explain how DispatcherServlet works?", java.sql.Date.valueOf(LocalDate.of(2025, 2, 11))));
        boardList.add(new Board(3, "Charlie", "JSP Tips", "Sharing some handy tips to optimize JSP development.", java.sql.Date.valueOf(LocalDate.of(2025, 2, 12))));
        boardList.add(new Board(4, "Diana", "Servlet Mapping Confusion", "I'm confused about servlet URL patterns. Help needed!", java.sql.Date.valueOf(LocalDate.of(2025, 2, 13))));
        boardList.add(new Board(5, "Eve", "Spring Boot vs Spring MVC", "Discussion: Which one should a beginner start with?", java.sql.Date.valueOf(LocalDate.of(2025, 2, 14))));
        boardList.add(new Board(6, "Frank", "Gradle Troubleshooting", "Facing dependency issues. Any checklist to debug?", java.sql.Date.valueOf(LocalDate.of(2025, 2, 15))));
        boardList.add(new Board(7, "Grace", "Session vs Request Scope", "Clarifying the differences with real-world examples.", java.sql.Date.valueOf(LocalDate.of(2025, 2, 16))));
        boardList.add(new Board(8, "Hank", "Tomcat Server Setup", "A simple guide to deploy war files on Tomcat.", java.sql.Date.valueOf(LocalDate.of(2025, 2, 17))));
        boardList.add(new Board(9, "Ivy", "Form Validation Example", "Best practices for validating user input in Spring MVC.", java.sql.Date.valueOf(LocalDate.of(2025, 2, 18))));
        boardList.add(new Board(10, "Jack", "Best Resources to Learn Spring", "Listing top books and courses for Spring beginners.", java.sql.Date.valueOf(LocalDate.of(2025, 2, 19))));
    }

    public ArrayList<Board> getBoardList() {
        return new ArrayList<>(boardList);
    }

    public Board getBoardByID(int id) {
        return boardList.stream()
                .filter(board -> board.getId() == id)
                .findFirst().orElse(null);
    }

    public boolean addBoard(Board board) {
        if (board != null) {
            boardList.add(board);
            return true;
        } else {
            return false;
        }
    }
}
