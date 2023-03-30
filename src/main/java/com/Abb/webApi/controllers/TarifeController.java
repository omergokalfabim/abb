package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.TarifeService;
import com.Abb.business.requests.TarifeRequest;
import com.Abb.entities.Tarife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/tarife")
public class TarifeController {
   TarifeService _tarifeService;

    @Autowired
    public TarifeController(TarifeService tarifeService) {
        this._tarifeService = tarifeService;
    }
    @PostMapping()
    public ResponseEntity<Object> add(@RequestBody TarifeRequest tarifeRequest) throws Exception {
         return ResponseEntity.ok(this._tarifeService.insert(tarifeRequest));
    }
    @DeleteMapping
    public ResponseEntity<Object> delete(@RequestBody Tarife tarife)throws Exception{
        return ResponseEntity.ok(this._tarifeService.deleteByEntity(tarife));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) throws  Exception{
        return ResponseEntity.ok(this._tarifeService.deleteById(id));
    }

    @PutMapping
    public ResponseEntity<Object> update(@RequestBody TarifeRequest tarifeRequest)throws Exception{
        return ResponseEntity.ok(this._tarifeService.update(tarifeRequest));
    }

    @GetMapping
    public ResponseEntity<Object> selectAll() throws Exception{
        return ResponseEntity.ok(this._tarifeService.selectAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(this._tarifeService.findById(id));
    }
}
