package com.Abb.business.interfaces;

import com.Abb.business.requests.HareketRequest;
import com.Abb.business.responses.HareketResponse;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface HareketService {
    DataResult<HareketRequest> insert(HareketRequest entity) throws Exception;

    DataResult<HareketRequest> update(HareketRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<HareketResponse> findById(Long id) throws Exception;

    DataResult<HareketResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<HareketResponse>> selectAll() throws Exception;

    DataResult<List<HareketResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(HareketRequest entity) throws Exception;

    Result deleteById(Long id) throws Exception;

    Result delete(String command) throws Exception;
}
