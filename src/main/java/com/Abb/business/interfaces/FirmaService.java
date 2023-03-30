package com.Abb.business.interfaces;

import com.Abb.business.requests.FirmaRequest;
import com.Abb.business.responses.FirmaResponse;
import com.Abb.entities.Firma;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface FirmaService {

    DataResult<FirmaRequest> insert(FirmaRequest entity) throws Exception;

    DataResult<FirmaRequest> update(FirmaRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<FirmaResponse> find(Object id) throws Exception;

    DataResult<FirmaResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<FirmaResponse>> selectAll() throws Exception;

    DataResult<List<FirmaResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Firma entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
