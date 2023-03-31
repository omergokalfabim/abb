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

    DataResult<AracSahibiResponse> findById(Long id) throws Exception;


    DataResult<List<AracSahibiResponse>> selectAll() throws Exception;


    Result deleteByEntity(AracSahibiRequest entity) throws Exception;

    Result deleteById(Long id) throws Exception;

}
