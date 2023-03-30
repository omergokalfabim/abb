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

    Result update(String command) throws Exception;

    DataResult<TarifeResponse> findById(Long id) throws Exception;

    DataResult<TarifeResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<TarifeResponse>> selectAll() throws Exception;

    DataResult<List<TarifeResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Tarife entity) throws Exception;

    Result deleteById(Long id) throws Exception;

    Result delete(String command) throws Exception;
}
