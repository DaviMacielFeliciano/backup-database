package br.com.davi.aula.appminhaideiadb.controller;

import java.util.List;

public interface ICrud<T> {

    // Métodos para persistência de dados no Banco de Dados

    // Incluir
    public boolean incluir(T obj);

    // Alterar
    public boolean alterar(T obj);

    // Deletar
    public boolean deletar(T obj);

    // Listar
    public List<T> listar();
    // public List pois ele vai receber uma lista e o <T>
    // o <T> no caso é uma lista de objetos.
    // Ou seja irá receber uma lista de objetos!

    // CRUD - Create Retrieve Update Delete




}
