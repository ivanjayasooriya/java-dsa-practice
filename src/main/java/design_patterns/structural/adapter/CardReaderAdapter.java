package design_patterns.structural.adapter;

// The Adapter bridges the gap between UsbClient and MemoryCard
public class CardReaderAdapter implements UsbClient {
    private final MemoryCard memoryCard;

    // The incompatible object is passed through the constructor
    public CardReaderAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsbCable() {
        System.out.println("Card Reader translating USB signal to Memory Card instructions...");
        memoryCard.insert();
        memoryCard.readData();
    }
}
