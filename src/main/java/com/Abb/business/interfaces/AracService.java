package com.Abb.business.interfaces;

import com.Abb.entities.Arac;
import com.Abb.entities.dto.AracDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracService {
    DataResult<AracDto> insert(AracDto entity) throws Exception;

    DataResult<AracDto> update(AracDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<AracDto> find(Object id) throws Exception;

    DataResult<AracDto> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<AracDto>> selectAll() throws Exception;

    DataResult<List<AracDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Arac entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
