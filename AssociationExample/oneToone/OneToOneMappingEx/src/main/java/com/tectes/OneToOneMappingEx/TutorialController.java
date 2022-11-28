package com.tectes.OneToOneMappingEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/startAPI")
public class TutorialController
{
    @Autowired
    TutorialRepository tutorialRepository;
    @Autowired
    TutorialDetailsRepository tutorialDetailsRepository;
    @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>>get
}
