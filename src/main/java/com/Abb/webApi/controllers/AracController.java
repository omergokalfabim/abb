package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.AracService;
import com.Abb.business.requests.CreateAracRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abb/arac")
public class AracController {
    AracService _aracService;

    @Autowired
    public AracController(AracService _aracService) {
        this._aracService = _aracService;
    }

    @PostMapping
    public ResponseEntity<Object> insert(@RequestBody CreateAracRequest createAracRequest)throws Exception{
        return ResponseEntity.ok(this._aracService.insert(createAracRequest));
    }
}
