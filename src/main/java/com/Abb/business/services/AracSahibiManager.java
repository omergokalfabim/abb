package com.Abb.business.services;

import com.Abb.business.interfaces.AracSahibiService;
import com.Abb.business.requests.AracSahibiRequest;
import com.Abb.business.responses.AracSahibiResponse;
import com.Abb.dataAccess.AracSahibiRepository;
import com.Abb.entities.AracSahibi;
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
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class AracSahibiManager implements AracSahibiService {
    AracSahibiRepository _aracSahibiRepository;
    ModelMapperService _modelMapperServie;

    @Autowired
    public AracSahibiManager(AracSahibiRepository _aracSahibiRepository, ModelMapperService _modelMapperServie) {
        this._aracSahibiRepository = _aracSahibiRepository;
        this._modelMapperServie = _modelMapperServie;
    }

    @Override
    public DataResult<AracSahibiRequest> insert(AracSahibiRequest entity) throws Exception {
        AracSahibi aracSahibi=this._modelMapperServie.forRequest().map(entity, com.Abb.entities.AracSahibi.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        aracSahibi.setKayitTarihi(timestamp);
        this._aracSahibiRepository.save(aracSahibi);
        return new SuccessDataResult<>(entity, Message.aracSahibiAdded);
    }

    @Override
    public DataResult<AracSahibiRequest> update(AracSahibiRequest entity) throws Exception {
        AracSahibi aracSahibi=this._modelMapperServie.forRequest().map(entity,AracSahibi.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        aracSahibi.setKayitTarihi(timestamp);
        this._aracSahibiRepository.save(aracSahibi);
        return new SuccessDataResult<>(entity,Message.aracSahibiUpdated);
    }
    @Override
    public DataResult<AracSahibiResponse> findById(Long id) throws Exception {
        AracSahibi aracSahibi=this._aracSahibiRepository.findById(id).orElseThrow();
        AracSahibiResponse aracSahibiResponse= this._modelMapperServie.forResponse().map(aracSahibi,AracSahibiResponse.class);
        return new SuccessDataResult<>(aracSahibiResponse,Message.aracSahibiListed);
    }

    @Override
    public DataResult<List<AracSahibiResponse>> selectAll() throws Exception {
        List<AracSahibi> aracSahibiList= this._aracSahibiRepository.findAll();
        List<AracSahibiResponse> aracSahibiResponseList=aracSahibiList.stream().map(aracSahibi -> this._modelMapperServie.forResponse().map(aracSahibi,AracSahibiResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(aracSahibiResponseList,Message.aracSahibileriListed);
    }
    @Override
    public Result deleteByEntity(AracSahibiRequest entity) throws Exception {
        AracSahibi aracSahibi= this._modelMapperServie.forRequest().map(entity,AracSahibi.class);
        this._aracSahibiRepository.delete(aracSahibi);
        return new SuccessResult(Message.aracSahibiDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._aracSahibiRepository.deleteById(id);
        return new SuccessResult(Message.aracSahibiDeleted);
    }
}
