package com.codeclan.example.Filingservice.controllers;

import com.codeclan.example.Filingservice.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/folders")
public class FolderController {
    @Autowired
    FolderRepository folderRepository;
}
