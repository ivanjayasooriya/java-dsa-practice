package design_patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        // 1. We have a MemoryCard (Adaptee)
        MemoryCard microSdCard = new MemoryCard();

        // 2. The computer expects a UsbClient. microSdCard won't fit directly.
        // So, we wrap it inside our CardReaderAdapter.
        UsbClient cardReader = new CardReaderAdapter(microSdCard);

        // 3. The client interacts with the Adapter seamlessly via the target interface
        System.out.println("--- Client plugging in the Card Reader ---");
        cardReader.connectWithUsbCable();
    }
}
