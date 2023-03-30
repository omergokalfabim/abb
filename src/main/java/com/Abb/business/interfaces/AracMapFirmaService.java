package com.Abb.business.interfaces;

import com.Abb.business.requests.AracMapFirmaRequest;
import com.Abb.business.responses.AracMapFirmaResponse;
import com.Abb.entities.AracMapFirma;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracMapFirmaService {
    DataResult<AracMapFirmaRequest> insert(AracMapFirmaRequest entity) throws Exception;

    DataResult<AracMapFirmaRequest> update(AracMapFirmaRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<AracMapFirmaResponse> findById(Long id) throws Exception;

    DataResult<AracMapFirmaResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<AracMapFirmaResponse>> selectAll() throws Exception;

    DataResult<List<AracMapFirmaResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(AracMapFirma entity) throws Exception;

    Result deleteById(Long id) throws Exception;

    Result delete(String command) throws Exception;
}
