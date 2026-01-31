package com.sol.repository;

import java.util.List;

public interface ICrudRepository<T> {
    void agregar(T entidad);
    List<T> obtenerTodos();
    T buscarPorId(int id);
}
