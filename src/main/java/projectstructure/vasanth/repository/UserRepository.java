package vasanth.repository;

import org.springframework.stereotype.Repository;
import projectstructure.vasanth.entity.UserVasanth;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UserRepository {

    private Map<Long, UserVasanth> db = new ConcurrentHashMap<>();
    private AtomicLong idGenerator = new AtomicLong(1);

    public List<UserVasanth> findAll() {
        return new ArrayList<>(db.values());
    }

    public UserVasanth save(UserVasanth user) {
        // Auto-generate ID if not set
        if (user.getId() == 0) {
            user.setId(idGenerator.getAndIncrement());
        }
        db.put(user.getId(), user);
        return user;
    }

    public Optional<UserVasanth> findById(long id) {
        return Optional.ofNullable(db.get(id));
    }

    public void delete(long id) {
        db.remove(id);
    }
}