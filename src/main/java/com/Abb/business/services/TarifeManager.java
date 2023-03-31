package com.Abb.business.services;

import com.Abb.business.interfaces.TarifeService;
import com.Abb.business.requests.TarifeRequest;
import com.Abb.business.responses.TarifeResponse;
import com.Abb.dataAccess.TarifeRepository;
import com.Abb.entities.Tarife;
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
public class TarifeManager implements TarifeService {
    TarifeRepository _tarifeRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public TarifeManager(TarifeRepository tarifeRepository, ModelMapperService modelMapperService) {
        this._tarifeRepository = tarifeRepository;
        this._modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<TarifeRequest> insert(TarifeRequest entity) throws Exception {
        Tarife tarife= this._modelMapperService.forRequest().map(entity,Tarife.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        tarife.setKayitTarihi(timestamp);
        this._tarifeRepository.save(tarife);
        return new SuccessDataResult<>(entity, Message.tarifeAdded);
    }

    @Override
    public DataResult<TarifeRequest> update(TarifeRequest entity) throws Exception {
        Tarife tarife= this._modelMapperService.forRequest().map(entity,Tarife.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        tarife.setKayitTarihi(timestamp);
        this._tarifeRepository.save(tarife);
        return new SuccessDataResult<>(entity,Message.tarifeUpdated);
    }

    @Override
    public DataResult<TarifeResponse> findById(Long id) throws Exception {
        Tarife tarife= this._tarifeRepository.findById(id).orElseThrow();
        TarifeResponse tarifeResponse=this._modelMapperService.forResponse().map(tarife,TarifeResponse.class);
        return new SuccessDataResult<>(tarifeResponse,Message.tarifeListed);
    }

    @Override
    public DataResult<List<TarifeResponse>> selectAll() throws Exception {
        List<Tarife> tarifeList=this._tarifeRepository.findAll();
        List<TarifeResponse> tarifeResponseList=tarifeList.stream().map(tarife -> this._modelMapperService.forResponse().map(tarife,TarifeResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<TarifeResponse>>(tarifeResponseList,Message.tarifelerListed);
    }

    @Override
    public Result deleteByEntity(Tarife entity) throws Exception {
        Tarife tarife=this._modelMapperService.forRequest().map(entity,Tarife.class);
        this._tarifeRepository.delete(entity);
        return new SuccessResult(Message.tarifeDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._tarifeRepository.deleteById(id);
        return new SuccessResult(Message.tarifeDeleted);
    }
}
