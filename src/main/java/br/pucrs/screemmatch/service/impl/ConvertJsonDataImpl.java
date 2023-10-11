package br.pucrs.screemmatch.service.impl;

import br.pucrs.screemmatch.service.ConvertJsonData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonDataImpl implements ConvertJsonData {
    private ObjectMapper mapper = new ObjectMapper();
    @Override
    public <T> T getData(String json, Class<T> classT) {
        try {
            return mapper.readValue(json, classT);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
