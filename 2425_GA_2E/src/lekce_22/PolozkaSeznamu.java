package lekce_22;

public class PolozkaSeznamu {
    public int hodnota;
    public PolozkaSeznamu dalsi;

    public PolozkaSeznamu(int hodnota, PolozkaSeznamu dalsi) {
        this.hodnota = hodnota;
        this.dalsi = dalsi;
    }
}
