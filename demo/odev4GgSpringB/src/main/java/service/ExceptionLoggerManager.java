package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ExceptionLoggerDao;

@Service
@RequiredArgsConstructor
public class ExceptionLoggerManager implements  ExceptionLoggerService{

    private final ExceptionLoggerDao exceptionLoggerDao;
}
