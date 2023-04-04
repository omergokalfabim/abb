package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.HareketRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:29002")
@RequestMapping("/abb/hareket")
public class HareketController {
    HareketService hareketService;

    @Autowired
    public HareketController( HareketService hareketService) {
        this.hareketService = hareketService;
    }


    @PostMapping("/add")
    public ResponseEntity<Object> insert(@RequestBody HareketRequest hareketRequest) throws Exception {
        return ResponseEntity.ok(this.hareketService.insert(hareketRequest));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody HareketRequest hareketRequest)throws Exception{
        return ResponseEntity.ok(this.hareketService.deleteByEntity(hareketRequest));
    }
    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(this.hareketService.deleteById(id));
    }
    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody HareketRequest hareketRequest)throws Exception{
        return ResponseEntity.ok(this.hareketService.update(hareketRequest));
    }
    @GetMapping("/selectall")
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this.hareketService.selectAll());
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(this.hareketService.findById(id));
    }
}
