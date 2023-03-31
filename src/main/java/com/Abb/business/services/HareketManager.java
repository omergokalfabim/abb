package com.Abb.business.services;

import com.Abb.business.interfaces.HareketService;
import com.Abb.business.requests.HareketRequest;
import com.Abb.business.responses.HareketResponse;
import com.Abb.dataAccess.HareketRepository;

import com.Abb.entities.AracMapFirma;
import com.Abb.entities.Hareket;

import com.Abb.utilities.constant.Message;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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

        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        hareket.setKayitTarihi(timestamp);

        this._hareketRepository.save(hareket);
        return new SuccessDataResult<>(entity, Message.hareketAdded);
    }

    @Override
    public DataResult<List<HareketResponse>> selectAll(){
        List<Hareket> hareketList=this._hareketRepository.findAll();
        List<HareketResponse> hareketResponseList=hareketList.stream().map(hareket->this._modelMapperService.forResponse().map(hareket, HareketResponse.class)).toList();

        return new SuccessDataResult<>(hareketResponseList,Message.hareketlerListed);
    }
    @Override
    public DataResult<HareketRequest> update(HareketRequest entity) throws Exception {
        Hareket hareket= this._modelMapperService.forRequest().map(entity, Hareket.class);

        Date thisDate= new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("dd//MM//YYYY");
        SimpleDateFormat timeFormat= new SimpleDateFormat("HH:mm:ss");
        hareket.setSaat(timeFormat.format(thisDate).toString());
        hareket.setTarih(dateFormat.format(thisDate).toString());

        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        hareket.setKayitTarihi(timestamp);

        this._hareketRepository.save(hareket);
        return new SuccessDataResult<>(entity,Message.hareketUpdated);
    }

    @Override
    public DataResult<HareketResponse> findById(Long id) throws Exception {
        Hareket hareket= this._hareketRepository.findById(id).orElseThrow();
        HareketResponse hareketResponse= this._modelMapperService.forResponse().map(hareket,HareketResponse.class);
        return new SuccessDataResult<>(hareketResponse,Message.hareketListed);
    }
    @Override
    public Result deleteByEntity(HareketRequest entity) throws Exception {
        Hareket hareket=this._modelMapperService.forRequest().map(entity,Hareket.class);
        this._hareketRepository.delete(hareket);
        return new SuccessResult(Message.hareketDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._hareketRepository.deleteById(id);
        return new SuccessResult(Message.hareketDeleted);
    }
}
