package com.Abb.business.interfaces;

import com.Abb.business.requests.AracSahibiRequest;
import com.Abb.business.responses.AracSahibiResponse;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracSahibiService {
    DataResult<AracSahibiRequest> insert(AracSahibiRequest entity) throws Exception;

    DataResult<AracSahibiRequest> update(AracSahibiRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<AracSahibiResponse> findById(Long id) throws Exception;

    DataResult<AracSahibiResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<AracSahibiResponse>> selectAll() throws Exception;

    DataResult<List<AracSahibiResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(AracSahibiRequest entity) throws Exception;

    Result deleteById(Long id) throws Exception;

    Result delete(String command) throws Exception;
}
