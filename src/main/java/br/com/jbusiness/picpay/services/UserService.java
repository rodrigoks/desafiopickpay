package br.com.jbusiness.picpay.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jbusiness.picpay.domain.user.User;
import br.com.jbusiness.picpay.domain.user.UserType;
import br.com.jbusiness.picpay.dto.UserDTO;
import br.com.jbusiness.picpay.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT)
            throw new Exception("Store user is not authorized to carry out the transaction.");
        if(sender.getBalance().compareTo(amount) < 0)
            throw new Exception("Insufficient balance.");
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found."));
    }

    public void saveUser(User user) {
        this.repository.save(user);
    }

    public User createUser(UserDTO data) {
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

}
