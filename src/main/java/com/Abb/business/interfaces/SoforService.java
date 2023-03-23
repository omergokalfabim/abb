package com.Abb.business.interfaces;

import com.Abb.entities.Firma;
import com.Abb.entities.Sofor;
import com.Abb.entities.dto.FirmaDto;
import com.Abb.entities.dto.SoforDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface SoforService {
    DataResult<SoforDto> insert(SoforDto entity) throws Exception;

    DataResult<SoforDto> update(SoforDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<SoforDto> find(Object id) throws Exception;

    DataResult<SoforDto> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<SoforDto>> selectAll() throws Exception;

    DataResult<List<SoforDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Sofor entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
