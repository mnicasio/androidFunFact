package solutions.application.funfacts;


import java.util.Random;

import static solutions.application.funfacts.FunFactsActivity.factNumbers;

class FactBook {
    //Fields or Member Variables - Properties about the object
    private final String[] facts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes 8 minutes and 20 seconds for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built." };


    // Methods - Actions the object can take


    String getFact() {

        //Randomly select a fact
            Random randomGenerator = new Random();
            int randomNumber = randomGenerator.nextInt(facts.length);
            factNumbers.add(randomNumber);
            return facts[randomNumber];

        }
    String getPreviousFact(){
        //select the previous fact
     int n = factNumbers.size();
        n -= 1;
        int x = factNumbers.get(n);
        return facts[x];
    }
}



