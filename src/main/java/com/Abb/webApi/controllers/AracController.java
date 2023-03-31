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

    @PostMapping("/add")
    public ResponseEntity<Object> insert(@RequestBody AracRequest aracRequest)throws Exception{
        return ResponseEntity.ok(this._aracService.insert(aracRequest));
    }
    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody AracRequest aracRequest)throws Exception{
        return ResponseEntity.ok(this._aracService.update(aracRequest));
    }

    @GetMapping("/selectall")
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this._aracService.selectAll());
    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this._aracService.findById(id));
    }
    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteByEntity(@RequestBody AracRequest aracRequest) throws Exception {
        return ResponseEntity.ok(this._aracService.deleteByEntity(aracRequest));
    }
    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this._aracService.deleteById(id));
    }
}
