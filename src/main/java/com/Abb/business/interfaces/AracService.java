package com.Abb.business.interfaces;

import com.Abb.business.requests.CreateAracRequest;
import com.Abb.business.responses.GetAllAracResponse;
import com.Abb.entities.Arac;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracService {
    DataResult<CreateAracRequest> insert(CreateAracRequest entity) throws Exception;

    DataResult<CreateAracRequest> update(CreateAracRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<GetAllAracResponse> find(Object id) throws Exception;

    DataResult<GetAllAracResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<GetAllAracResponse>> selectAll() throws Exception;

    DataResult<List<GetAllAracResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Arac entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
