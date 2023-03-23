package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.FirmaService;
import com.Abb.entities.Firma;
import com.Abb.entities.dto.FirmaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/firma")
public class FirmaController {
    FirmaService firmaService;

    @Autowired
    public FirmaController(FirmaService firmaService) {
        this.firmaService = firmaService;
    }

    @PostMapping()
    public ResponseEntity<Object> add(@RequestBody FirmaDto firmaDto) throws Exception{
        return ResponseEntity.ok(this.firmaService.insert(firmaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable long id)throws Exception{
        return ResponseEntity.ok(this.firmaService.deleteById(id));
    }

    @GetMapping()
    public ResponseEntity<Object> selectAll() throws Exception{
        return ResponseEntity.ok(this.firmaService.selectAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> selectById(@PathVariable long id) throws Exception{
        return ResponseEntity.ok(this.firmaService.find(id));
    }

    @PutMapping()
    public ResponseEntity<Object> update(@RequestBody FirmaDto FirmaDto) throws Exception{
        return ResponseEntity.ok(this.firmaService.update(FirmaDto));
    }

}
