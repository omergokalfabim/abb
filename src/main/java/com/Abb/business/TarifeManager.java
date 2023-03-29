package com.Abb.business;

import com.Abb.business.interfaces.TarifeService;
import com.Abb.business.requests.CreateFirmaRequest;
import com.Abb.business.requests.CreateTarifeRequest;
import com.Abb.business.responses.GetAllHareketResponse;
import com.Abb.business.responses.GetAllTarifeResponse;
import com.Abb.dataAccess.TarifeRepository;
import com.Abb.entities.Tarife;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TarifeManager implements TarifeService {
    TarifeRepository tarifeRepository;
    ModelMapperService modelMapperService;

    @Autowired
    public TarifeManager(TarifeRepository tarifeRepository, ModelMapperService modelMapperService) {
        this.tarifeRepository = tarifeRepository;
        this.modelMapperService = modelMapperService;
    }


    @Override
    public DataResult<CreateTarifeRequest> insert(CreateTarifeRequest entity) throws Exception {
        Tarife tarife= this.modelMapperService.forRequest().map(entity,Tarife.class);
        this.tarifeRepository.save(tarife);
        return new SuccessDataResult<CreateTarifeRequest>(entity);
    }

    @Override
    public DataResult<CreateTarifeRequest> update(CreateTarifeRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllTarifeResponse> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllTarifeResponse> find(String command) throws Exception {
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
    public DataResult<List<GetAllTarifeResponse>> selectAll() throws Exception {
        return null;
    }

    @Override
    public DataResult<List<GetAllTarifeResponse>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(Tarife entity) throws Exception {
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
