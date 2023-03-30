package com.Abb.business.services;

import com.Abb.business.interfaces.FirmaService;
import com.Abb.business.requests.FirmaRequest;
import com.Abb.business.responses.FirmaResponse;
import com.Abb.dataAccess.FirmaRepository;
import com.Abb.entities.Firma;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        this._firmaRepository.save(firma);
        return new SuccessDataResult<FirmaRequest>(entity);
    }

    @Override
    public DataResult<FirmaRequest> update(FirmaRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<FirmaResponse> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<FirmaResponse> find(String command) throws Exception {
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
    public DataResult<List<FirmaResponse>> selectAll() throws Exception {
        return null;
    }

    @Override
    public DataResult<List<FirmaResponse>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(Firma entity) throws Exception {
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
