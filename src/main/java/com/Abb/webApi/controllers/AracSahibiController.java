package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.AracSahibiService;
import com.Abb.entities.dto.AracSahibiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abb/aracsahibi")
public class AracSahibiController {
    AracSahibiService _aracSahibiService;

    @Autowired
    public AracSahibiController(AracSahibiService _aracSahibiService) {
        this._aracSahibiService = _aracSahibiService;
    }

    @PostMapping()
    public ResponseEntity<Object> insert(@RequestBody AracSahibiDto aracSahibiDto) throws Exception {
        return ResponseEntity.ok(this._aracSahibiService.insert(aracSahibiDto)) ;
    }
}
