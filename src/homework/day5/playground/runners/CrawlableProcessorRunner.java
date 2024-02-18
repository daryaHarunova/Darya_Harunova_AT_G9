package homework.day5.playground.runners;

import homework.day5.playground.essence.Flyable;
import homework.day5.playground.essence.craft.air.Aircraft;
import homework.day5.playground.essence.craft.air.Copter;
import homework.day5.playground.essence.craft.air.Plane;
import homework.day5.playground.essence.craft.air.Rocket;
import homework.day5.playground.essence.creatures.Crawlable;
import homework.day5.playground.essence.creatures.animal.insect.Beetle;
import homework.day5.playground.essence.creatures.animal.insect.Fly;
import homework.day5.playground.essence.creatures.animal.insect.Insect;
import homework.day5.playground.essence.creatures.animal.insect.Mosquito;
import homework.day5.playground.essence.creatures.animal.vertebrata.Crocodile;
import homework.day5.playground.essence.creatures.animal.vertebrata.Vertebrata;
import homework.day5.playground.processors.CrawlableProcessor;
import homework.day5.playground.processors.FlyableProcessor;

public class CrawlableProcessorRunner {
    public static void main(String[] args) {
        CrawlableProcessor processor = new CrawlableProcessor();
        Crawlable crawlableCrocodile = new Crocodile(1723, "Neel Crawlable");
        Crawlable crawlableBeetle = new Beetle(43, "Christmas Crawlable");
        Vertebrata vertebrataCrocodile = new Crocodile(1723, "Neel Vertebrata");
        Insect insectBeetle = new Beetle(43, "Christmas Insect");
        Crocodile aCrocodile = new Crocodile(1723, "Neel Crocodile");
        Beetle aBeetle = new Beetle(43, "Christmas Beetle");
        Crawlable anonymousCrawlable = new Crawlable() {
            String name = "Anonymous";

            @Override
            public void crawl(String direction, int distance) {
                System.out.printf("I am %s, my name is %s and I am crawling to %s for %d units%n",
                        this.getClass().getSimpleName(), name, direction, distance);
            }
        };

        processor.runCrawlable(crawlableCrocodile);
        processor.runCrawlable(crawlableBeetle);
//         processor.runCrawlable(vertebrataCrocodile);
//         processor.runCrawlable(insectBeetle);
        processor.runCrawlable(aCrocodile);
        processor.runCrawlable(aBeetle);
        processor.runCrawlable(anonymousCrawlable);

        processor.runCrawlable(crawlableCrocodile, "никуда");
        processor.runCrawlable(aCrocodile, "налево");

        processor.runCrawlable(aBeetle, "назад", 37);

//        processor.runCrawlable(anonymousCrawlable, "вниз", 37); уточнить
    }
}
