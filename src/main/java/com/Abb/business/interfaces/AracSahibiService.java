package com.Abb.business.interfaces;

import com.Abb.entities.Arac;
import com.Abb.entities.dto.AracSahibiDto;
import com.Abb.entities.dto.AracSahibiDto;
import com.Abb.utilities.results.DataResult;
import com.Abb.utilities.results.Result;

import java.util.List;
import java.util.Map;

public interface AracSahibiService {
    DataResult<AracSahibiDto> insert(AracSahibiDto entity) throws Exception;

    DataResult<AracSahibiDto> update(AracSahibiDto entity) throws Exception;

    Result update(String command) throws Exception;

    DataResult<AracSahibiDto> find(Object id) throws Exception;

    DataResult<AracSahibiDto> find(String command) throws Exception;

    DataResult<Object[]> findObjectArray(String command) throws Exception;

    DataResult<Object> executeQuery(String command) throws Exception;

    DataResult<List<AracSahibiDto>> selectAll() throws Exception;

    DataResult<List<AracSahibiDto>> selectAll(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command) throws Exception;

    DataResult<List<Object[]>> selectAllByObject(String command, Map<String, Object> parameters) throws Exception;

    Result deleteByEntity(AracSahibiDto entity) throws Exception;

    Result deleteById(long id) throws Exception;

    Result delete(String command) throws Exception;
}
