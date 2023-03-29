package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.SoforMapAracService;
import com.Abb.business.requests.SoforMapAracRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abb/soforlermaparaclar")
public class SoforMapAracController {
    SoforMapAracService _soforMapAracService;

    @Autowired
    public SoforMapAracController(SoforMapAracService _soforMapAracService) {
        this._soforMapAracService = _soforMapAracService;
    }

    @PostMapping
    public ResponseEntity<Object> insert(SoforMapAracRequest soforMapAracRequest) throws Exception {
        return ResponseEntity.ok(this._soforMapAracService.insert(soforMapAracRequest));
    }

    @GetMapping
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this._soforMapAracService.selectAll());
    }
}
