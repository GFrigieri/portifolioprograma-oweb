package br.com.programacaoweb.crud.resources.exceptions;
import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import br.com.programacaoweb.crud.services.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> ResourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String erro = "Nada foi encontrado.";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError erroPadrao = new StandardError(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(erroPadrao);
    }

}
