package com.Abb.business;

import com.Abb.business.interfaces.SoforService;
import com.Abb.dataAccess.SoforRepository;
import com.Abb.entities.Sofor;
import com.Abb.entities.dto.SoforDto;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SoforManager implements SoforService {
    SoforRepository _soforRepository;
    ModelMapperService _modelMapperService;

    public SoforManager(SoforRepository _soforRepository, ModelMapperService _modelMapperService) {
        this._soforRepository = _soforRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<SoforDto> insert(SoforDto entity) throws Exception {
        Sofor sofor=this._modelMapperService.forRequest().map(entity,Sofor.class);
        this._soforRepository.save(sofor);
        return new SuccessDataResult<SoforDto>(entity);
    }

    @Override
    public DataResult<SoforDto> update(SoforDto entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<SoforDto> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<SoforDto> find(String command) throws Exception {
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
    public DataResult<List<SoforDto>> selectAll() throws Exception {
        return null;
    }

    @Override
    public DataResult<List<SoforDto>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(Sofor entity) throws Exception {
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
