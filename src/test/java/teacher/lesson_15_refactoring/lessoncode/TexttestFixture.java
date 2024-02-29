package teacher.lesson_15_refactoring.lessoncode;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 5, 10), //
                new Item("Aged Brie", 2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                // this conjured item does not work properly yet
                new Item("Conjured", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 15;
//        if (args.length > 0) {
//            days = Integer.parseInt(args[0]) + 1;
//        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.printf("%-45s %-15s %-15s \n", "name", "sellIn", "quality");
            for (Item item : items) {
                System.out.printf("%-45s | %-15s | %-15s \n", item.name, item.sellIn, item.quality);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}