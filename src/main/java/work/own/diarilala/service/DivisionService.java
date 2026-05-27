package work.own.diarilala.service;

import org.springframework.stereotype.Service;

@Service
public class DivisionService {
    public int divide(int a, int b) {
        return a / b;
    }
}