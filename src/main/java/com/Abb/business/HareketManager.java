package com.Abb.business;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.CreateHareketRequest;
import com.Abb.business.responses.GetAllHareketResponse;
import com.Abb.dataAccess.HareketRepository;

import com.Abb.entities.Hareket;

import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
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
    public DataResult<CreateHareketRequest> insert(CreateHareketRequest entity) throws Exception {
       Hareket hareket= this._modelMapperService.forRequest().map(entity, Hareket.class);

        Date thisDate= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd//MM//YYYY");
        SimpleDateFormat timeFormat= new SimpleDateFormat("HH:mm:ss");
        hareket.setSaat(timeFormat.format(thisDate).toString());
        hareket.setTarih(dateFormat.format(thisDate).toString());


        this._hareketRepository.save(hareket);
        return new SuccessDataResult<CreateHareketRequest>("Success");
    }

    @Override
    public DataResult<List<GetAllHareketResponse>> selectAll(){
        List<Hareket> hareketList=this._hareketRepository.findAll();
        List<GetAllHareketResponse> hareketDtoList=hareketList.stream().map(hareket->this._modelMapperService.forResponse().map(hareket, GetAllHareketResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<GetAllHareketResponse>>(hareketDtoList,"Success");
    }
    @Override
    public DataResult<CreateHareketRequest> update(CreateHareketRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllHareketResponse> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllHareketResponse> find(String command) throws Exception {
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
    public DataResult<List<GetAllHareketResponse>> selectAll(String command) throws Exception {
        return null;
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
    public Result deleteByEntity(CreateHareketRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result deleteById(long id) throws Exception {
        return null;
    }

    @Override
    public Result delete(String command) throws Exception {
        return null;
    }
}
