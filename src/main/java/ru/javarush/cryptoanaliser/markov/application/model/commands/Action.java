package ru.javarush.cryptoanaliser.markov.application.model.commands;

import ru.javarush.cryptoanaliser.markov.application.model.entity.Result;

import java.util.List;

public interface Action {

     Result execute(int key, List<Character> text);




}
