package com.example.palindrome.controller;

import com.example.palindrome.dto.PalindromeRequest;
import com.example.palindrome.dto.PalindromeResponse;
import com.example.palindrome.service.PalindromeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PalindromeController {
    private final PalindromeService palindromeService;

    public PalindromeController(PalindromeService palindromeService) {
        this.palindromeService = palindromeService;
    }

    @PostMapping("/check-palindrome")
    public PalindromeResponse checkPalindrome(@RequestBody PalindromeRequest request) {
        String palindromo = request.getPalindromo();
        boolean isPalindromo = palindromeService.isPalindrome(palindromo);
        int lengthCadena = palindromo.length();
        int lengthCaracteresEspeciales = palindromeService.countSpecialCharacters(palindromo);

        return new PalindromeResponse(lengthCadena, isPalindromo, lengthCaracteresEspeciales);
    }
}
