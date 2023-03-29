package com.Abb.business.interfaces;

import com.Abb.business.requests.CreateSoforRequest;
import com.Abb.business.requests.SoforMapAracRequest;
import com.Abb.business.responses.GetAllSoforResponse;
import com.Abb.business.responses.SoforMapAracResponse;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface SoforMapAracService {
    DataResult<SoforMapAracRequest> insert(SoforMapAracRequest entity) throws Exception;

    DataResult<CreateSoforRequest> update(CreateSoforRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<GetAllSoforResponse> find(Object id) throws Exception;

    DataResult<GetAllSoforResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<SoforMapAracResponse>> selectAll() throws Exception;

    DataResult<List<GetAllSoforResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(CreateSoforRequest entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
