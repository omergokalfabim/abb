package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.CreateHareketRequest;
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
    public void insert(@RequestBody CreateHareketRequest createHareketRequest) throws Exception {
        this.hareketService.insert(createHareketRequest);
    }

    @GetMapping()
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this.hareketService.selectAll());
    }
}
