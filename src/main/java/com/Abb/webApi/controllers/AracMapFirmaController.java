package com.Abb.webApi.controllers;

import com.Abb.business.interfaces.AracMapFirmaService;
import com.Abb.business.requests.AracMapFirmaRequest;
import com.Abb.business.requests.AracSahibiRequest;
import com.Abb.entities.AracMapFirma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/abb/aracmapfirma")
public class AracMapFirmaController {
    AracMapFirmaService _aracMapFirmaService;

    @Autowired
    public AracMapFirmaController(AracMapFirmaService _aracMapFirmaService) {
        this._aracMapFirmaService = _aracMapFirmaService;
    }

    @PostMapping("/add")
    public ResponseEntity<Object> insert(@RequestBody AracMapFirmaRequest aracMapFirmaRequest) throws Exception {
        return ResponseEntity.ok(this._aracMapFirmaService.insert(aracMapFirmaRequest));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> deleteByEntity(@RequestBody AracMapFirma aracMapFirma)throws Exception{
        return ResponseEntity.ok(this._aracMapFirmaService.deleteByEntity(aracMapFirma));
    }
    @DeleteMapping("/deletebyid/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id)throws Exception{
        return ResponseEntity.ok(this._aracMapFirmaService.deleteById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody AracMapFirmaRequest aracMapFirmaRequest) throws Exception{
        return  ResponseEntity.ok(this._aracMapFirmaService.update(aracMapFirmaRequest));
    }
    @GetMapping("/selectall")
    public ResponseEntity<Object> selectAll() throws Exception {
        return ResponseEntity.ok(this._aracMapFirmaService.selectAll());
    }

    @GetMapping("/findbyid/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(this._aracMapFirmaService.findById(id));
    }
}
