package ru.javarush.cryptoanaliser.markov.application;

import ru.javarush.cryptoanaliser.markov.application.controller.MainController;
import ru.javarush.cryptoanaliser.markov.application.controller.Controller;
import ru.javarush.cryptoanaliser.markov.application.model.FileSystem;
import ru.javarush.cryptoanaliser.markov.application.view.commandLine.CommandLine;

public class Application {

    /*
    0 - комманда
    1 - путь до исходного файла
    3 - ключ



     */
    public void execute(String[] args) {
        Controller controller = new MainController(new FileSystem(), new CommandLine(args));
        controller.execute();
    }

}
