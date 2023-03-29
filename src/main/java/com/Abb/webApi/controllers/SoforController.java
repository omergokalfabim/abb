package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.SoforService;
import com.Abb.business.requests.CreateSoforRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("abb/sofor")
public class SoforController {
    SoforService soforService;

    @Autowired
    public SoforController(SoforService soforService) {
        this.soforService = soforService;
    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody CreateSoforRequest createSoforRequest) throws Exception {
        return ResponseEntity.ok(this.soforService.insert(createSoforRequest));
    }

    @GetMapping
    public ResponseEntity<Object> getall() throws Exception {
        return ResponseEntity.ok(this.soforService.selectAll());
    }

}
