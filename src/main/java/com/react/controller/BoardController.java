package com.react.controller;

import com.react.domain.Board;
import com.react.dto.BoardDto;
import com.react.repository.BoardRepository;
import lombok.RequiredArgsConstructor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequiredArgsConstructor
@RequestMapping("/boards/")
@Slf4j
public class BoardController {

    private final BoardRepository boardRepository;

    @GetMapping("/list")
    public ResponseEntity<?> list() {
        log.info("list() called...");
        List<Board> boards = boardRepository.findAll();
        return ResponseEntity.ok(boards);
    }
}
