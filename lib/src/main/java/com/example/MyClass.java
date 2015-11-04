package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public String getJoke() {

        List<String> jokeList = new ArrayList<String>();
        jokeList.add("A ham sandwich walks into a bar and orders a beer. Bartender says, ‘Sorry we don’t serve food here.’");
        jokeList.add("Whenever the cashier at the grocery store asks my dad if he would like the milk in a bag he replies, ‘No, just leave it in the carton!’");
        jokeList.add("Whenever we drive past a graveyard my dad says, ‘Do you know why I can’t be buried there?’ And we all say, ‘Why not?’ And he says, ‘Because I’m not dead yet!’");
        jokeList.add("I had a dream that I was a muffler last night. I woke up exhausted!");
        jokeList.add("On all of my medical forms growing up my dad wrote ‘red’ for my blood type. To this day no one knows my actual blood type.");
        jokeList.add("A three-legged dog walks into a bar and says to the bartender, ‘I’m looking for the man who shot my paw.’");
        jokeList.add("What’s Forrest Gump’s password? 1forrest1");


        return jokeList.get((int) (Math.random() * jokeList.size()));

    }

}
