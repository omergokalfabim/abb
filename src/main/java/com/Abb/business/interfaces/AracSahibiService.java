package com.Abb.business.interfaces;

import com.Abb.business.requests.CreateAracSahibiRequest;
import com.Abb.business.responses.GetAllAracSahibiResponse;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracSahibiService {
    DataResult<CreateAracSahibiRequest> insert(CreateAracSahibiRequest entity) throws Exception;

    DataResult<CreateAracSahibiRequest> update(CreateAracSahibiRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<GetAllAracSahibiResponse> find(Object id) throws Exception;

    DataResult<GetAllAracSahibiResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<GetAllAracSahibiResponse>> selectAll() throws Exception;

    DataResult<List<GetAllAracSahibiResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(CreateAracSahibiRequest entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
