package br.com.cti.First.Project.model;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
   }
   
