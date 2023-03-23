package com.Abb.business.interfaces;

import com.Abb.entities.Hareket;
import com.Abb.entities.dto.HareketDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface HareketService {
    DataResult<HareketDto> insert(HareketDto entity) throws Exception;

    DataResult<HareketDto> update(HareketDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<Hareket> find(Object id) throws Exception;

    DataResult<Hareket> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<HareketDto>> selectAll() throws Exception;

    DataResult<List<HareketDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(HareketDto entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
