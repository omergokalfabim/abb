package com.Abb.business.interfaces;

import com.Abb.business.requests.TarifeRequest;
import com.Abb.business.responses.TarifeResponse;
import com.Abb.entities.Tarife;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface TarifeService {
    DataResult<TarifeRequest> insert(TarifeRequest entity) throws Exception;

    DataResult<TarifeRequest> update(TarifeRequest entity) throws Exception;

    DataResult<TarifeResponse> findById(Long id) throws Exception;

    DataResult<List<TarifeResponse>> selectAll() throws Exception;

    Result deleteByEntity(Tarife entity) throws Exception;

    Result deleteById(Long id) throws Exception;

}
