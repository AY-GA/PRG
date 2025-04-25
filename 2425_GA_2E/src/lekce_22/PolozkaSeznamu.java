package lekce_22;

public class PolozkaSeznamu {
    int hodnota;
    PolozkaSeznamu dalsi;

    public PolozkaSeznamu(int hodnota, PolozkaSeznamu dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }
}
