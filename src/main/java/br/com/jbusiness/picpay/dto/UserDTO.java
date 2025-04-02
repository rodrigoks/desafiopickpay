package br.com.jbusiness.picpay.dto;

import java.math.BigDecimal;

import br.com.jbusiness.picpay.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {

}
