package com.Abb.business.interfaces;

import com.Abb.dataAccess.FirmaRepository;
import com.Abb.entities.Firma;
import com.Abb.entities.dto.FirmaDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface FirmaService {

    DataResult<FirmaDto> insert(FirmaDto entity) throws Exception;

    DataResult<FirmaDto> update(FirmaDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<FirmaDto> find(Object id) throws Exception;

    DataResult<FirmaDto> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<FirmaDto>> selectAll() throws Exception;

    DataResult<List<FirmaDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(Firma entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
