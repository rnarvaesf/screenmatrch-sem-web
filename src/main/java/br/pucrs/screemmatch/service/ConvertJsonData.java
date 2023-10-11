package br.pucrs.screemmatch.service;

public interface ConvertJsonData {
    <T> T getData(String json, Class<T> classT);
}
