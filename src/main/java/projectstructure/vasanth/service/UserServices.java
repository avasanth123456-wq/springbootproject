package vasanth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import projectstructure.vasanth.entity.UserVasanth;
import projectstructure.vasanth.repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    private ExecutorService executor = Executors.newFixedThreadPool(3);

    public UserVasanth createUser(UserVasanth user){
        executor.submit(()->{
            System.out.println("Saving user in thread:" +Thread.currentThread().getName());
           userRepository.save(user);

        });
        return  user;

    }
    public List<UserVasanth> getAllUsers(){
        return userRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(UserVasanth::getName))
                .collect(Collectors.toList());
    }
    public List<UserVasanth>getHighSalary(double salary){
        return userRepository.findAll()
                .stream()
                .filter(u-> u.getSalary() > salary)
                .collect(Collectors.toList());
    }

    public Map<String ,List<UserVasanth>>groupByDepartment(){
        return userRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(UserVasanth::getDepartment));
    }
    public void printParallel(){
        userRepository.findAll()
                .stream()
                .forEach(u->System.out.println(Thread.currentThread().getName()+"->"+u.getName()));
    }
    public void deleteUser(long id){
        userRepository.delete(id);
    }
}
