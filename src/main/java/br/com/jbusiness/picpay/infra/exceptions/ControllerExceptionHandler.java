package br.com.jbusiness.picpay.infra.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.jbusiness.picpay.dto.ExceptionDTO;
import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ExceptionDTO> threatDuplicateEntrey(DataIntegrityViolationException exception) {
        ExceptionDTO exc = new ExceptionDTO("Usuario já cadastrado", "400");
        return ResponseEntity.badRequest().body(exc);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ExceptionDTO> threat404(EntityNotFoundException exception) {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDTO> threatGerenalExcecption(Exception exception) {
        ExceptionDTO exc = new ExceptionDTO(exception.getMessage(), "500");
        return ResponseEntity.internalServerError().body(exc);
    }

}
