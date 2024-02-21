package teacher.lesson_15_refactoring.lessoncode;

import java.util.Map;
import java.util.function.Consumer;

//Predicat accepts value returns boolean // boolean test(A value)
//Function accepts value returns value   // B apply(A value)
//Supplier accepts NONE   returns value  // A get()
//Consumer accepts value returns NONE    // void accept(A value)

class GildedRose {
    Item[] items;
    Map<String, Consumer<Item>> updaters;

    public GildedRose(Item[] items) {
        this.items = items;
        this.updaters = Map.of(
                "Aged Brie", GildedRose::agedBrieQualityUpdate,
                "Backstage passes to a TAFKAL80ETC concert", GildedRose::backstagePassQualityUpdate,
                "Conjured", GildedRose::conjuredQualityUpdate
        );
    }

    public void updateQuality() {
        for (Item item : items) {
            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
                continue;
            }

            item.update();

            item.sellIn--;

            if (item.sellIn < 0) {
                item.update();
            }
        }
    }

//    public void updateQuality() {
//        for (Item item : items) {
//            if ("Sulfuras, Hand of Ragnaros".equals(item.name)) {
//                continue;
//            }
//
//            updaters.getOrDefault(item.name, GildedRose::defaultQualityUpdate).accept(item);
//
//            item.sellIn--;
//            if (item.sellIn < 0) {
//                updaters.getOrDefault(item.name, GildedRose::defaultQualityUpdate).accept(item);
//            }
//        }
//    }

    private static void conjuredQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality -= 2;
        }
    }


    private static void backstagePassQualityUpdate(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
    }

    private static void agedBrieQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private static void defaultQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
