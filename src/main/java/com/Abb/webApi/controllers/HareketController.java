package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.HareketService;
import com.Abb.entities.Hareket;
import com.Abb.entities.dto.HareketDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/hareket")
public class HareketController {
    HareketService hareketService;

    @Autowired
    public HareketController( HareketService hareketService) {
        this.hareketService = hareketService;
    }


    @PostMapping()
    public void insert(@RequestBody HareketDto hareketDto) throws Exception {
        this.hareketService.insert(hareketDto);
    }

    @GetMapping()
    public ResponseEntity<Object> selectAllDto() throws Exception {
        return ResponseEntity.ok(this.hareketService.selectAll());
    }
}
