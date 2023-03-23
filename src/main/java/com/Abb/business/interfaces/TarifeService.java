package com.Abb.business.interfaces;

import com.Abb.entities.Tarife;
import com.Abb.entities.dto.TarifeDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface TarifeService {
    DataResult<TarifeDto> insert(TarifeDto entity) throws Exception;

    DataResult<TarifeDto> update(TarifeDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<TarifeDto> find(Object id) throws Exception;

    DataResult<TarifeDto> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<TarifeDto>> selectAll() throws Exception;

    DataResult<List<TarifeDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Tarife entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
