package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.TarifeService;
import com.Abb.entities.Tarife;
import com.Abb.entities.dto.TarifeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abb/tarife")
public class TarifeController {
   TarifeService tarifeService;

    @Autowired
    public TarifeController(TarifeService tarifeService) {
        this.tarifeService = tarifeService;
    }
    @PostMapping()
    public void add(@RequestBody TarifeDto tarifeDto) throws Exception {
        this.tarifeService.insert(tarifeDto);
    }
}
