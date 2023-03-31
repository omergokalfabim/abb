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

    DataResult<HareketResponse> findById(Long id) throws Exception;

    DataResult<List<HareketResponse>> selectAll() throws Exception;

    Result deleteByEntity(HareketRequest entity) throws Exception;

    Result deleteById(Long id) throws Exception;

}
