package com.example.palindrome.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    // Verificar si una cadena es palíndromo
    public boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equals(reversedStr);
    }

    // Contar caracteres especiales
    public int countSpecialCharacters(String str) {
        return str.length() - str.replaceAll("[^a-zA-Z0-9]", "").length();
    }
}
