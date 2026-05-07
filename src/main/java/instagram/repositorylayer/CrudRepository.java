package instagram.repositorylayer;

import java.util.Optional;

public interface CrudRepository<T, ID> {

    // Save entity (insert or update)
    <S extends T> S save(S entity);

    // Save multiple entities
    <S extends T> Iterable<S> saveAll(Iterable<S> entities);

    // Find by ID
    Optional<T> findById(ID id);

    // Check if exists
    boolean existsById(ID id);

    // Get all records
    Iterable<T> findAll();

    // Get all by IDs
    Iterable<T> findAllById(Iterable<ID> ids);

    // Count total records
    long count();

    // Delete by ID
    void deleteById(ID id);

    // Delete entity
    void delete(T entity);

    // Delete multiple
    void deleteAllById(Iterable<? extends ID> ids);

    // Delete all
    void deleteAll(Iterable<? extends T> entities);

    void deleteAll();
}