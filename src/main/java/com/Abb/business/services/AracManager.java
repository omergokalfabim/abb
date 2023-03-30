package com.Abb.business.services;

import com.Abb.business.interfaces.AracService;
import com.Abb.business.requests.AracRequest;
import com.Abb.business.responses.AracResponse;
import com.Abb.dataAccess.AracRepository;
import com.Abb.entities.Arac;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
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
        this._aracRepository.save(arac);
        return new SuccessDataResult<AracRequest>(entity);
    }

    @Override
    public DataResult<AracRequest> update(AracRequest entity) throws Exception {
        Arac arac= this._modelMapperService.forRequest().map(entity,Arac.class);
        this._aracRepository.save(arac);

        return new SuccessDataResult<AracRequest>(entity);
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracResponse> findById(Long id) throws Exception {
        Arac arac= this._aracRepository.findById(id).orElseThrow();
        AracResponse aracResponse=this._modelMapperService.forResponse().map(arac,AracResponse.class);
        return new SuccessDataResult<AracResponse>(aracResponse);
    }

    @Override
    public DataResult<AracResponse> find(String command) throws Exception {
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
    public DataResult<List<AracResponse>> selectAll() throws Exception {
        List<Arac> aracList= this._aracRepository.findAll();
        List<AracResponse> aracResponseList=aracList.stream().map(arac -> this._modelMapperService.forResponse().map(arac,AracResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<AracResponse>>(aracResponseList);
    }

    @Override
    public DataResult<List<AracResponse>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(AracRequest entity) throws Exception {
        Arac arac=this._modelMapperService.forRequest().map(entity,Arac.class);
        this._aracRepository.delete(arac);
        return new SuccessResult("Success");
    }

    @Override
    public Result deleteById(Long id) throws Exception {
        this._aracRepository.deleteById(id);
        return new SuccessResult("Success");
    }

    @Override
    public Result delete(String command) throws Exception {
        return null;
    }
}
