package guru.springframework.chucknorrisjokes.controllers;

import guru.springframework.chucknorrisjokes.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Djordje on 10-May-23
 */
@Controller
public class ChuckNorrisJokesController {

    private final JokeServiceImpl jokeServiceImpl;

    public ChuckNorrisJokesController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokeServiceImpl.getJoke());

        return "index";
    }
}
