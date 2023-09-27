package br.com.alura.manuvideo.service;

public interface iConverteDados {
    <T> T obterDados (String json, Class<T>  classe);
}
