package com.Abb.business;

import com.Abb.business.interfaces.AracService;
import com.Abb.dataAccess.AracRepository;
import com.Abb.entities.Arac;
import com.Abb.entities.dto.AracDto;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import com.Abb.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AracManager implements AracService {

    AracRepository _aracRepository;
    ModelMapperService _modelMapperServie;

    @Autowired
    public AracManager(AracRepository _aracRepository, ModelMapperService _modelMapperServie) {
        this._aracRepository = _aracRepository;
        this._modelMapperServie = _modelMapperServie;
    }

    @Override
    public DataResult<AracDto> insert(AracDto entity) throws Exception {
        Arac arac= this._modelMapperServie.forRequest().map(entity,Arac.class);
        this._aracRepository.save(arac);
        return new SuccessDataResult<AracDto>(entity);
    }

    @Override
    public DataResult<AracDto> update(AracDto entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracDto> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracDto> find(String command) throws Exception {
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
    public DataResult<List<AracDto>> selectAll() throws Exception {
        return null;
    }

    @Override
    public DataResult<List<AracDto>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(Arac entity) throws Exception {
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
