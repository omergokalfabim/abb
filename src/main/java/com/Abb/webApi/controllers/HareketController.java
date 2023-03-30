package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.HareketRequest;
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
    public ResponseEntity<Object> insert(@RequestBody HareketRequest hareketRequest) throws Exception {
        return ResponseEntity.ok(this.hareketService.insert(hareketRequest));
    }
    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody HareketRequest hareketRequest)throws Exception{
        return ResponseEntity.ok(this.hareketService.deleteByEntity(hareketRequest));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(this.hareketService.deleteById(id));
    }
    @PutMapping
    public ResponseEntity<Object> update(@RequestBody HareketRequest hareketRequest)throws Exception{
        return ResponseEntity.ok(this.hareketService.update(hareketRequest));
    }
    @GetMapping()
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this.hareketService.selectAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(this.hareketService.findById(id));
    }
}
