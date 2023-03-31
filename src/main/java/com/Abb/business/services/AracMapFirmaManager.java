package com.Abb.business.services;

import com.Abb.business.interfaces.AracMapFirmaService;
import com.Abb.business.requests.AracMapFirmaRequest;
import com.Abb.business.responses.AracMapFirmaResponse;
import com.Abb.dataAccess.AracMapFirmaRepository;
import com.Abb.entities.AracMapFirma;
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
public class AracMapFirmaManager implements AracMapFirmaService {
    AracMapFirmaRepository _aracMapFirmaRepository;
    ModelMapperService _modelMapperService;

    @Autowired
    public AracMapFirmaManager(AracMapFirmaRepository _aracMapFirmaRepository, ModelMapperService _modelMapperService) {
        this._aracMapFirmaRepository = _aracMapFirmaRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<AracMapFirmaRequest> insert(AracMapFirmaRequest entity) throws Exception {
        AracMapFirma aracMapFirma=this._modelMapperService.forRequest().map(entity,AracMapFirma.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        aracMapFirma.setKayitTarihi(timestamp);
        this._aracMapFirmaRepository.save(aracMapFirma);

        return new SuccessDataResult<>(entity, Message.aracMapFirmaAdded);
    }

    @Override
    public DataResult<AracMapFirmaRequest> update(AracMapFirmaRequest entity) throws Exception {
        AracMapFirma aracMapFirma=this._modelMapperService.forRequest().map(entity,AracMapFirma.class);
        Date date= new Date();
        Timestamp timestamp= new Timestamp(date.getTime());
        aracMapFirma.setKayitTarihi(timestamp);
        this._aracMapFirmaRepository.save(aracMapFirma);

        return new SuccessDataResult<>(entity,Message.aracMapFirmaUpdated);
    }


    @Override
    public DataResult<AracMapFirmaResponse> findById(Long id) throws Exception {
        AracMapFirma aracMapFirma= this._aracMapFirmaRepository.findById(id).orElseThrow();
        AracMapFirmaResponse aracMapFirmaResponse=this._modelMapperService.forResponse().map(aracMapFirma,AracMapFirmaResponse.class);
        return new SuccessDataResult<>(aracMapFirmaResponse,Message.aracMapFirmaListed);

    }

    @Override
    public DataResult<List<AracMapFirmaResponse>> selectAll() throws Exception {

        List<AracMapFirma> aracMapFirmaList= this._aracMapFirmaRepository.findAll();
        List<AracMapFirmaResponse> aracMapFirmaResponseList=aracMapFirmaList.stream().map(aracMapFirma -> this._modelMapperService.forResponse().map(aracMapFirma, AracMapFirmaResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<>(aracMapFirmaResponseList,Message.aracMapFirmasListed);
    }

    @Override
    public Result deleteByEntity(AracMapFirma entity) throws Exception {
       AracMapFirma aracMapFirma=this._modelMapperService.forRequest().map(entity,AracMapFirma.class);
       this._aracMapFirmaRepository.delete(aracMapFirma);
       return new SuccessResult(Message.aracMapFirmaDeleted);
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._aracMapFirmaRepository.deleteById(id);
        return new SuccessResult(Message.aracMapFirmaDeleted);
    }

}
