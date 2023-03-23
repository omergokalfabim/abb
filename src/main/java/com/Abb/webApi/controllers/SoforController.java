package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.SoforService;
import com.Abb.entities.dto.SoforDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("abb/sofor")
public class SoforController {
    SoforService soforService;

    @Autowired
    public SoforController(SoforService soforService) {
        this.soforService = soforService;
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody SoforDto soforDto) throws Exception {
        return ResponseEntity.ok(this.soforService.insert(soforDto));
    }

}
