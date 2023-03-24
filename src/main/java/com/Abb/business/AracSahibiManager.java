package com.Abb.business;

import com.Abb.business.interfaces.AracSahibiService;
import com.Abb.dataAccess.AracSahibiRepository;
import com.Abb.entities.AracSahibi;
import com.Abb.entities.dto.AracSahibiDto;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
    public DataResult<AracSahibiDto> insert(AracSahibiDto entity) throws Exception {
        AracSahibi aracSahibi=this._modelMapperServie.forRequest().map(entity, com.Abb.entities.AracSahibi.class);
        this._aracSahibiRepository.save(aracSahibi);
        return new SuccessDataResult<AracSahibiDto>(entity);
    }

    @Override
    public DataResult<AracSahibiDto> update(AracSahibiDto entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracSahibiDto> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<AracSahibiDto> find(String command) throws Exception {
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
    public DataResult<List<AracSahibiDto>> selectAll() throws Exception {
        return null;
    }

    @Override
    public DataResult<List<AracSahibiDto>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(AracSahibiDto entity) throws Exception {
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
