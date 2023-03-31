package com.Abb.business.services;

import com.Abb.business.interfaces.FirmaService;
import com.Abb.business.requests.FirmaRequest;
import com.Abb.business.responses.FirmaResponse;
import com.Abb.dataAccess.FirmaRepository;
import com.Abb.entities.Firma;
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

@Service
public class FirmaManager implements FirmaService {
    FirmaRepository _firmaRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public FirmaManager(FirmaRepository _firmaRepository, ModelMapperService _modelMapperService) {
        this._firmaRepository = _firmaRepository;
        this._modelMapperService = _modelMapperService;
    }


    @Override
    public DataResult<FirmaRequest> insert(FirmaRequest entity) throws Exception {
        Firma firma= this._modelMapperService.forRequest().map(entity,Firma.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        firma.setKayitTarihi(timestamp);
        this._firmaRepository.save(firma);
        return new SuccessDataResult<>(entity, Message.firmaAdded);
    }

    @Override
    public DataResult<FirmaRequest> update(FirmaRequest entity) throws Exception {
        Firma firma= this._modelMapperService.forRequest().map(entity,Firma.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        firma.setKayitTarihi(timestamp);
        this._firmaRepository.save(firma);
        return new SuccessDataResult<FirmaRequest>(entity,Message.firmaUpdated);
    }

    @Override
    public DataResult<FirmaResponse> findById(Long id) throws Exception {
        Firma firma= this._firmaRepository.findById(id).orElseThrow();
        FirmaResponse firmaResponse= this._modelMapperService.forResponse().map(firma,FirmaResponse.class);
        return new SuccessDataResult<>(firmaResponse,Message.firmaListed);
    }

    @Override
    public DataResult<List<FirmaResponse>> selectAll() throws Exception {
        List<Firma> firmaList= this._firmaRepository.findAll();
        List<FirmaResponse> firmaResponseList=firmaList.stream().map(firma -> this._modelMapperService.forResponse().map(firma,FirmaResponse.class)).toList();
        return new SuccessDataResult<>(firmaResponseList, Message.firmalarListed);
    }
    @Override
    public Result deleteByEntity(Firma entity) throws Exception {
        Firma firma=this._modelMapperService.forRequest().map(entity,Firma.class);
        this._firmaRepository.delete(firma);
        return new SuccessResult(Message.firmaDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._firmaRepository.deleteById(id);
        return new SuccessResult(Message.firmaDeleted);
    }
}
