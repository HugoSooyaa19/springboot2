package com.example.palindrome.dto;

public class PalindromeResponse {
    private int lengthCadena;
    private boolean isPalindromo;
    private int lengthCaracteresEspeciales;

    public PalindromeResponse(int lengthCadena, boolean isPalindromo, int lengthCaracteresEspeciales) {
        this.lengthCadena = lengthCadena;
        this.isPalindromo = isPalindromo;
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }

    // Getters y setters
    public int getLengthCadena() {
        return lengthCadena;
    }

    public void setLengthCadena(int lengthCadena) {
        this.lengthCadena = lengthCadena;
    }

    public boolean isPalindromo() {
        return isPalindromo;
    }

    public void setPalindromo(boolean palindromo) {
        isPalindromo = palindromo;
    }

    public int getLengthCaracteresEspeciales() {
        return lengthCaracteresEspeciales;
    }

    public void setLengthCaracteresEspeciales(int lengthCaracteresEspeciales) {
        this.lengthCaracteresEspeciales = lengthCaracteresEspeciales;
    }
}
