package com.Abb.business.interfaces;

import com.Abb.business.requests.CreateTarifeRequest;
import com.Abb.business.responses.GetAllTarifeResponse;
import com.Abb.entities.Tarife;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface TarifeService {
    DataResult<CreateTarifeRequest> insert(CreateTarifeRequest entity) throws Exception;

    DataResult<CreateTarifeRequest> update(CreateTarifeRequest entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<GetAllTarifeResponse> find(Object id) throws Exception;

    DataResult<GetAllTarifeResponse> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<GetAllTarifeResponse>> selectAll() throws Exception;

    DataResult<List<GetAllTarifeResponse>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Tarife entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
