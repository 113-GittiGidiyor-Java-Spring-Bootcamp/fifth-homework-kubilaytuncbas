package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ExceptionLoggerService;

@RestController
@RequestMapping("/api")
public class ExceptionLoggerController {

    private  final ExceptionLoggerService exceptionLoggerService;

    @Autowired
    public ExceptionLoggerController(ExceptionLoggerService exceptionLoggerService) {
        this.exceptionLoggerService = exceptionLoggerService;
    }

    @GetMapping("/getExceptionLog")
    public ResponseEntity<?> getExceptionLogs(@RequestParam String type,
                                              @RequestParam(required=false) String date){
        return new ResponseEntity<>(null);
    }
}
