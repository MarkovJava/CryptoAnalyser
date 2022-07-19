package ru.javarush.cryptoanaliser.markov.application.model.commands;

import ru.javarush.cryptoanaliser.markov.application.util.Alphabet;

abstract class GeneralLogic {

    protected boolean isCorrectKey(int key) {
        return key <= 0 || key > 32;
    }

    protected int findCharacterInAlphabet(char symbol) {
        char[] alphabet = Alphabet.getRussianAlphabet();
        int result = -1;
        for (char c : alphabet) {
            if (c == symbol) {
                result = symbol;
                break;
            }
        }
        return result;
    }

}
