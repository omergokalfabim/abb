package com.Abb.business.services;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.HareketRequest;
import com.Abb.business.responses.HareketResponse;
import com.Abb.dataAccess.HareketRepository;

import com.Abb.entities.Hareket;

import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class HareketManager implements HareketService {
    HareketRepository _hareketRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public HareketManager(HareketRepository hareketRepository, ModelMapperService _modelMapperService) {
        this._hareketRepository = hareketRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<HareketRequest> insert(HareketRequest entity) throws Exception {
       Hareket hareket= this._modelMapperService.forRequest().map(entity, Hareket.class);

        Date thisDate= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd//MM//YYYY");
        SimpleDateFormat timeFormat= new SimpleDateFormat("HH:mm:ss");
        hareket.setSaat(timeFormat.format(thisDate).toString());
        hareket.setTarih(dateFormat.format(thisDate).toString());


        this._hareketRepository.save(hareket);
        return new SuccessDataResult<HareketRequest>("Success");
    }

    @Override
    public DataResult<List<HareketResponse>> selectAll(){
        List<Hareket> hareketList=this._hareketRepository.findAll();
        List<HareketResponse> hareketDtoList=hareketList.stream().map(hareket->this._modelMapperService.forResponse().map(hareket, HareketResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<HareketResponse>>(hareketDtoList,"Success");
    }
    @Override
    public DataResult<HareketRequest> update(HareketRequest entity) throws Exception {
        Hareket hareket= this._modelMapperService.forRequest().map(entity, Hareket.class);

        Date thisDate= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd//MM//YYYY");
        SimpleDateFormat timeFormat= new SimpleDateFormat("HH:mm:ss");
        hareket.setSaat(timeFormat.format(thisDate).toString());
        hareket.setTarih(dateFormat.format(thisDate).toString());


        this._hareketRepository.save(hareket);
        return new SuccessDataResult<HareketRequest>("Success");
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<HareketResponse> findById(Long id) throws Exception {
        Hareket hareket= this._hareketRepository.findById(id).orElseThrow();
        HareketResponse hareketResponse= this._modelMapperService.forResponse().map(hareket,HareketResponse.class);
        return new SuccessDataResult<>(hareketResponse);
    }

    @Override
    public DataResult<HareketResponse> find(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<Object[]> findObjectArray(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<Object> executeQuery(String command) throws Exception {
        return null;
    }


    @Override
    public DataResult<List<HareketResponse>> selectAll(String command) throws Exception {
        List<Hareket> hareketList=this._hareketRepository.findAll();
        List<HareketResponse> hareketResponseList=hareketList.stream().map(hareket -> this._modelMapperService.forResponse().map(hareket,HareketResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(hareketResponseList);
    }

    @Override
    public DataResult<List<Object[]>> selectAllByObject(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception {
        return null;
    }

    @Override
    public Result deleteByEntity(HareketRequest entity) throws Exception {
        Hareket hareket=this._modelMapperService.forRequest().map(entity,Hareket.class);
        this._hareketRepository.delete(hareket);
        return new SuccessResult("Success");
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._hareketRepository.deleteById(id);
        return new SuccessResult("Success");
    }

    @Override
    public Result delete(String command) throws Exception {
        return null;
    }
}
