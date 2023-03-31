package com.Abb.business.interfaces;

import com.Abb.business.requests.AracRequest;
import com.Abb.business.responses.AracResponse;
import com.Abb.entities.Arac;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracService {
    DataResult<AracRequest> insert(AracRequest entity) throws Exception;

    DataResult<AracRequest> update(AracRequest entity) throws Exception;

    DataResult<AracResponse> findById(Long id) throws Exception;

    DataResult<List<AracResponse>> selectAll() throws Exception;

    Result deleteByEntity(AracRequest entity) throws Exception;

    Result deleteById(Long id) throws Exception;

}
