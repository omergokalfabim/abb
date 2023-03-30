package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.AracSahibiService;
import com.Abb.business.requests.AracSahibiRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/aracsahibi")
public class AracSahibiController {
    AracSahibiService _aracSahibiService;

    @Autowired
    public AracSahibiController(AracSahibiService _aracSahibiService) {
        this._aracSahibiService = _aracSahibiService;
    }

    @PostMapping()
    public ResponseEntity<Object> insert(@RequestBody AracSahibiRequest aracSahibiRequest) throws Exception {
        return ResponseEntity.ok(this._aracSahibiService.insert(aracSahibiRequest)) ;
    }

    @DeleteMapping
    public ResponseEntity<Object> deleteByEntity(@RequestBody AracSahibiRequest aracSahibiRequest)throws Exception{
        return ResponseEntity.ok(this._aracSahibiService.deleteByEntity(aracSahibiRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this._aracSahibiService.deleteById(id));
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody AracSahibiRequest aracSahibiRequest)throws Exception{
        return ResponseEntity.ok(this._aracSahibiService.update(aracSahibiRequest));
    }
    @GetMapping
    public ResponseEntity<Object> selectAll()throws Exception{
        return ResponseEntity.ok(this._aracSahibiService.selectAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> selectById(Long id)throws Exception{
        return ResponseEntity.ok(this._aracSahibiService.findById(id));
    }
}
