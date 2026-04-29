package example.authapp.service;

import example.authapp.dto.UserDTO;
import example.authapp.entity.UserAuth;
import example.authapp.repository.UserRepository;
import example.authapp.request.LoginRequest;
import example.authapp.request.SignupRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    private  final ExecutorService executor = Executors.newFixedThreadPool(5);


    public UserDTO signup(SignupRequest request){

    UserAuth userAuth= UserAuth.builder()
            .username(request.getUsername())
            .email(request.getEmail())
            .password(request.getPassword())
            .build();

    userRepository.save(userAuth);

    return UserDTO.builder()
            .username(userAuth.getUsername())
            .email(userAuth.getEmail())
            .build();

   }

   public  String login(LoginRequest request) throws  Exception{

         CompletableFuture<Optional<UserAuth>> futureUserAuth=
                 CompletableFuture.supplyAsync(()->
                         userRepository.findByEmail(request.getEmail()),executor);

         Optional<UserAuth> userAuthOptional = futureUserAuth.get();

         return userAuthOptional
                 .stream()
                 .filter(u->u.getPassword().equals(request.getPassword()))
                 .map(u->"Login Successful for:"+u.getPassword())
                 .findFirst()
                 .orElse("Invalid Credentials");
   }

   public List<UserDTO> getAllUsers(){
         return userRepository.findAll()
                 .stream()
                 .map(userAuth -> UserDTO.builder()
                         .username(userAuth.getUsername())
                         .email(userAuth.getEmail())
                         .build())
                 .collect(Collectors.toList());
   }

}