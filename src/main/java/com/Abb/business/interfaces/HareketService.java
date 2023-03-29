package com.Abb.business.interfaces;

import com.Abb.business.requests.CreateHareketRequest;
import com.Abb.business.responses.GetAllHareketResponse;
import com.Abb.entities.Hareket;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface HareketService {
    DataResult<CreateHareketRequest> insert(CreateHareketRequest entity) throws Exception;

    DataResult<CreateHareketRequest> update(CreateHareketRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<GetAllHareketResponse> find(Object id) throws Exception;

    DataResult<GetAllHareketResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<GetAllHareketResponse>> selectAll() throws Exception;

    DataResult<List<GetAllHareketResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(CreateHareketRequest entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
