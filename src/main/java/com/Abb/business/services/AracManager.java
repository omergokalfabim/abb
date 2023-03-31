package com.Abb.business.services;

import com.Abb.business.interfaces.AracService;
import com.Abb.business.requests.AracRequest;
import com.Abb.business.responses.AracResponse;
import com.Abb.dataAccess.AracRepository;
import com.Abb.entities.Arac;
import com.Abb.utilities.constant.Message;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AracManager implements AracService {

    AracRepository _aracRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public AracManager(AracRepository _aracRepository, ModelMapperService _modelMapperServie) {
        this._aracRepository = _aracRepository;
        this._modelMapperService = _modelMapperServie;
    }

    @Override
    public DataResult<AracRequest> insert(AracRequest entity) throws Exception {
        Arac arac= this._modelMapperService.forRequest().map(entity,Arac.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        arac.setKayitTarihi(timestamp);
        this._aracRepository.save(arac);
        return new SuccessDataResult<>(entity, Message.aracAdded);
    }

    @Override
    public DataResult<AracRequest> update(AracRequest entity) throws Exception {
        Arac arac= this._modelMapperService.forRequest().map(entity,Arac.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        arac.setKayitTarihi(timestamp);
        this._aracRepository.save(arac);
        return new SuccessDataResult<>(entity, Message.aracUpdated);
    }

    @Override
    public DataResult<AracResponse> findById(Long id) throws Exception {
        Arac arac= this._aracRepository.findById(id).orElseThrow();
        AracResponse aracResponse=this._modelMapperService.forResponse().map(arac,AracResponse.class);
        return new SuccessDataResult<>(aracResponse, Message.aracListed);
    }

    @Override
    public DataResult<List<AracResponse>> selectAll() throws Exception {
        List<Arac> aracList= this._aracRepository.findAll();
        List<AracResponse> aracResponseList=aracList.stream().map(arac -> this._modelMapperService.forResponse().map(arac,AracResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(aracResponseList,Message.araclarListed);
    }

    @Override
    public Result deleteByEntity(AracRequest entity) throws Exception {
        Arac arac=this._modelMapperService.forRequest().map(entity,Arac.class);
        this._aracRepository.delete(arac);
        return new SuccessResult(Message.aracDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._aracRepository.deleteById(id);
        return new SuccessResult(Message.aracDeleted);
    }

}
