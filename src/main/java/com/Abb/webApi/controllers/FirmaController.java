package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.FirmaService;
import com.Abb.business.requests.FirmaRequest;
import com.Abb.entities.Firma;
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

    @PostMapping("/add")
    public ResponseEntity<Object> add(@RequestBody FirmaRequest firmaRequest) throws Exception{
        return ResponseEntity.ok(this.firmaService.insert(firmaRequest));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Firma firma) throws Exception {
        return ResponseEntity.ok(this.firmaService.deleteByEntity(firma));
    }
    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this.firmaService.deleteById(id));
    }

    @GetMapping("/selectall")
    public ResponseEntity<Object> selectAll() throws Exception{
        return ResponseEntity.ok(this.firmaService.selectAll());
    }

    @GetMapping("/selectbyid/{id}")
    public ResponseEntity<Object> selectById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(this.firmaService.findById(id));
    }

    @PutMapping("update")
    public ResponseEntity<Object> update(@RequestBody FirmaRequest firmaRequest) throws Exception{
        return ResponseEntity.ok(this.firmaService.update(firmaRequest));
    }
}
