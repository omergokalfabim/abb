package com.Abb.business;

import com.Abb.business.interfaces.SoforService;
import com.Abb.business.requests.CreateSoforRequest;
import com.Abb.business.responses.GetAllAracResponse;
import com.Abb.business.responses.GetAllSoforResponse;
import com.Abb.dataAccess.SoforRepository;
import com.Abb.entities.Sofor;
import com.Abb.utilities.BeanBuilder;
import com.Abb.utilities.mappers.ModelMapperService;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;
import com.Abb.utilities.results.SuccessDataResult;
import org.modelmapper.TypeMap;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class SoforManager implements SoforService {
    SoforRepository _soforRepository;
    ModelMapperService _modelMapperService;

    public SoforManager(SoforRepository _soforRepository, ModelMapperService _modelMapperService) {
        this._soforRepository = _soforRepository;
        this._modelMapperService = _modelMapperService;
    }

    @Override
    public DataResult<CreateSoforRequest> insert(CreateSoforRequest entity) throws Exception {
        Sofor sofor=this._modelMapperService.forRequest().map(entity,Sofor.class);
        Date thisDate=new Date();
        sofor.setKayitTarihi(thisDate);
        this._soforRepository.save(sofor);
        return new SuccessDataResult<CreateSoforRequest>(entity);
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
    public DataResult<List<GetAllSoforResponse>> selectAll() throws Exception {
       List<Sofor> sofors=this._soforRepository.findAll();
       List<GetAllSoforResponse> soforler=sofors.stream().map(sofor -> this._modelMapperService.forResponse().map(sofor,GetAllSoforResponse.class)).collect(Collectors.toList());
//       List<GetAllSoforResponse> soforler= BeanBuilder.buildList(sofors,
//                GetAllSoforResponse.propertyOrder, GetAllSoforResponse.class);
       return new SuccessDataResult<List<GetAllSoforResponse>>(soforler);
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
