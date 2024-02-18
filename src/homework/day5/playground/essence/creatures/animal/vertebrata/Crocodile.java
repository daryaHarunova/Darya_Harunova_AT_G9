package homework.day5.playground.essence.creatures.animal.vertebrata;

import homework.day5.playground.essence.creatures.Crawlable;

public class Crocodile extends Vertebrata implements Crawlable {
    public Crocodile(int mass, String name) {
        super(mass, name);
    }

    public void crawl(String direction, int distance) {
        System.out.println(String.format("I am %s, my " + name + " is M and I am crawling to D for F units", getClass().getSimpleName(), name, direction, distance));
        System.out.println("wr-wr-wrr-r..");
    }
}
