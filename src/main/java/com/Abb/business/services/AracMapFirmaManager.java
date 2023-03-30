package com.Abb.business.services;

import com.Abb.business.interfaces.AracMapFirmaService;
import com.Abb.business.requests.AracMapFirmaRequest;
import com.Abb.business.responses.AracMapFirmaResponse;
import com.Abb.business.responses.AracResponse;
import com.Abb.dataAccess.AracMapFirmaRepository;
import com.Abb.entities.AracMapFirma;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
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

        return new SuccessDataResult<AracMapFirmaRequest>(entity);
    }

    @Override
    public DataResult<AracMapFirmaRequest> update(AracMapFirmaRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracMapFirmaResponse> findById(Long id) throws Exception {
        AracMapFirma aracMapFirma= this._aracMapFirmaRepository.findById(id).orElseThrow();
        AracMapFirmaResponse aracMapFirmaResponse=this._modelMapperService.forResponse().map(aracMapFirma,AracMapFirmaResponse.class);
        return new SuccessDataResult<>(aracMapFirmaResponse);

    }

    @Override
    public DataResult<AracMapFirmaResponse> find(String command) throws Exception {
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
    public DataResult<List<AracMapFirmaResponse>> selectAll() throws Exception {

        List<AracMapFirma> aracMapFirmaList= this._aracMapFirmaRepository.findAll();
        //List<AracMapFirmaResponse> aracMapFirmaResponseList=aracMapFirmaList.stream().map(aracMapFirma -> this._modelMapperService.forResponse().map(aracMapFirma, AracMapFirmaResponse.class)).collect(Collectors.toList());
        List<AracMapFirmaResponse> aracMapFirmaResponseList= new ArrayList<>();
        for (AracMapFirma aracMapFirma:aracMapFirmaList){
            aracMapFirmaResponseList.get(0).setAracMapFirmaId(aracMapFirma.getAracMapFirmaId());

        }
        return new SuccessDataResult<List<AracMapFirmaResponse>>(aracMapFirmaResponseList);
    }

    @Override
    public DataResult<List<AracMapFirmaResponse>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(AracMapFirma entity) throws Exception {
       AracMapFirma aracMapFirma=this._modelMapperService.forRequest().map(entity,AracMapFirma.class);
       this._aracMapFirmaRepository.delete(aracMapFirma);
       return new SuccessResult("Success");
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._aracMapFirmaRepository.deleteById(id);
        return new SuccessResult("Success");
    }

    @Override
    public Result delete(String command) throws Exception {
        return null;
    }
}
