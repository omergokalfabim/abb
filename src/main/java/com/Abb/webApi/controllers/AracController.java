package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.AracService;
import com.Abb.business.requests.AracRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/arac")
public class AracController {
    AracService _aracService;

    @Autowired
    public AracController(AracService _aracService) {
        this._aracService = _aracService;
    }

    @PostMapping
    public ResponseEntity<Object> insert(@RequestBody AracRequest aracRequest)throws Exception{
        return ResponseEntity.ok(this._aracService.insert(aracRequest));
    }
    @PutMapping
    public ResponseEntity<Object> update(@RequestBody AracRequest aracRequest)throws Exception{
        return ResponseEntity.ok(this._aracService.update(aracRequest));
    }

    @GetMapping
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this._aracService.selectAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> find(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this._aracService.findById(id));
    }
    @DeleteMapping
    public ResponseEntity<Object> deleteByEntity(@RequestBody AracRequest aracRequest) throws Exception {
        return ResponseEntity.ok(this._aracService.deleteByEntity(aracRequest));
    }
}
