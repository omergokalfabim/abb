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

    DataResult<FirmaResponse> findById(Long id) throws Exception;

    DataResult<List<FirmaResponse>> selectAll() throws Exception;

    Result deleteByEntity(Firma entity) throws Exception;

    Result deleteById(Long id) throws Exception;

}
