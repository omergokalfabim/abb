package com.Abb.business;

import com.Abb.business.interfaces.SoforMapAracService;
import com.Abb.business.requests.CreateSoforRequest;
import com.Abb.business.requests.SoforMapAracRequest;
import com.Abb.business.responses.GetAllSoforResponse;
import com.Abb.business.responses.SoforMapAracResponse;
import com.Abb.dataAccess.SoforMapAracRepository;
import com.Abb.entities.SoforMapArac;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SoforMapAracManager implements SoforMapAracService {
    SoforMapAracRepository _soforMapAracRepository;
    ModelMapperService modelMapperService;

    @Autowired
    public SoforMapAracManager(SoforMapAracRepository _soforMapAracRepository, ModelMapperService modelMapperService) {
        this._soforMapAracRepository = _soforMapAracRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public DataResult<SoforMapAracRequest> insert(SoforMapAracRequest entity) throws Exception {
        SoforMapArac soforMapArac =this.modelMapperService.forRequest().map(entity, SoforMapArac.class);
        soforMapArac.setKayitTarihi(new Timestamp(new Date().getTime()));
        this._soforMapAracRepository.save(soforMapArac);
        entity=this.modelMapperService.forRequest().map(soforMapArac, SoforMapAracRequest.class);
        return new SuccessDataResult<SoforMapAracRequest>(entity);
    }

    @Override
    public DataResult<CreateSoforRequest> update(CreateSoforRequest entity) throws Exception {
        return null;
    }

    @Override
    public Result update(String command) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllSoforResponse> find(Object id) throws Exception {
        return null;
    }

    @Override
    public DataResult<GetAllSoforResponse> find(String command) throws Exception {
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
    public DataResult<List<SoforMapAracResponse>> selectAll() throws Exception {
        List<SoforMapArac> soforMapAracs = this._soforMapAracRepository.findAll();
        List<SoforMapAracResponse> soforMapAracResponseList = soforMapAracs.stream().map(soforMapArac -> this.modelMapperService.forResponse().map(soforMapArac, SoforMapAracResponse.class)).collect(Collectors.toList());
        return new SuccessDataResult<List<SoforMapAracResponse>>(soforMapAracResponseList);
    }

    @Override
    public DataResult<List<GetAllSoforResponse>> selectAll(String command) throws Exception {
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
    public Result deleteByEntity(CreateSoforRequest entity) throws Exception {
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
