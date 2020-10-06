package data;

import iface.IFXConsole;
import javafx.scene.layout.Pane;
import model.ConsolePane;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * <summary>Class is the 'default' implementation of the IConsole interface,
 * for java-fx applications.</summary>
 */
public class FXConsole implements IFXConsole {

    /**
     * <summary>The ConsolePane field.</summary>
     */
    private final static ConsolePane consolePane = new ConsolePane();

    /**
     * <summary>Default method for printing text to this class's ConsolePane.</summary>
     * @param text a text to be print.
     */
    @Override
    public void println(String text) {
        consolePane.println(text);
    }

    /**
     * <summary>Default method for printing error text to this class's ConsolePane.</summary>
     * @param text an error text to be print.
     */
    @Override
    public void printerr(String text) {
        consolePane.printerr(text);
    }

    /**
     * <summary>Method for clearing this class's ConsolePane.</summary>
     * @param b a boolean value signaling if in addition to the content of the console,
     *          the underlying history list should also be cleared.
     */
    @Override
    public void clear(boolean b) {
        consolePane.clear();
        if (b) consolePane.clearHistory();
    }

    /**
     * <summary>This method should not be used by fx-applications. It will always return null.</summary>
     * @return NULL.
     */
    @Override
    public String read() {
        return null;
    }

    /**
     * <summary>Method for printing stylised text to this class's ConsolePane.</summary>
     * @param text a text to be printed.
     * @param styles a collection of styles to be applied to the text.
     */
    @Override
    public void println(String text, Collection<String> styles) {
        consolePane.println(text, styles);
    }

    /**
     * <summary>SET method for this class's ConsolePane's consumer field.</summary>
     * @param onMessageReceivedHandler the consumer to be assigned to an instance of the ConsolePane class.
     */
    @Override
    public void setOnMessageReceivedHandler(Consumer<String> onMessageReceivedHandler) {
        consolePane.setOnMessageReceivedHandler(onMessageReceivedHandler);
    }

    /**
     * <summary>GET method for this class's ConsolePane's pane 'property'.</summary>
     * @return this class's ConsolePane's pane 'property'.
     */
    @Override
    public Pane getPane() {
        return consolePane;
    }

}
