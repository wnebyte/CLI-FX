package model;

import iface.IFXConsole;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * Class implements the abstract methods of the com.github.wnebyte.CLI-FX.iface.IFXConsole class,
 * for interacting with a console that extends the javafx.scene.layout.Pane class.
 */
public class FXConsole implements IFXConsole {

    /**
     * This class's static com.github.wnebyte.ConsolePane.model.ConsolePane field.
     */
    private final static ConsolePane consolePane = new ConsolePane();

    /**
     * Method for printing stylised-text to the console.
     * @param text a text to be print.
     */
    @Override
    public void println(String text) {
        consolePane.println(text);
    }

    /**
     * Method for printing error-stylised-text to the console.
     * @param text an error-stylised-text to be print.
     */
    @Override
    public void printerr(String text) {
        consolePane.printerr(text);
    }

    /**
     * Method for clearing the text-content of the console.
     * @param b boolean value signals if the console's history-content should also be cleared.
     */
    @Override
    public void clear(boolean b) {
        consolePane.clear();
        if (b) consolePane.clearHistory();
    }

    /**
     * Method for reading the text-content from the console's last paragraph.
     * @return always NULL. Use the consumer to trigger events when new text has been appended
     * to the console.
     */
    @Override
    public String read() {
        return null;
    }

    /**
     * Method for printing stylised-text to the console.
     * @param text a text to be printed.
     * @param styles a collection of styles to be applied to the text.
     */
    @Override
    public void println(String text, Collection<String> styles) {
        consolePane.println(text, styles);
    }

    /**
     * Set method for the console's string consumer.
     * @param onMessageReceivedHandler new string consumer.
     */
    @Override
    public void setOnMessageReceivedHandler(Consumer<String> onMessageReceivedHandler) {
        consolePane.setOnMessageReceivedHandler(onMessageReceivedHandler);
    }

    /**
     * Get method for the console's javafx.scene.layout.Pane base class.
     * @return the base class.
     */
    @Override
    public Pane getPane() {
        return consolePane;
    }

    /**
     * Set method for the console's wrap-text property.
     * @param value new boolean value.
     */
    @Override
    public void setWrapText(boolean value) {
        consolePane.setWrapText(value);
    }

    /**
     * Set method for the console's editable property.
     * @param value new boolean value.
     */
    @Override
    public void setEditable(boolean value) {
        consolePane.setEditable(true);
    }

    /**
     * Set method for the console's v-scrollbar policy.
     * @param scrollBarPolicy the new v-scrollbar policy.
     */
    @Override
    public void setVbarPolicy(ScrollPane.ScrollBarPolicy scrollBarPolicy) {
        consolePane.setVbarPolicy(scrollBarPolicy);
    }

    /**
     * Get method for the console's v-scrollbar policy.
     * @return the current v-scrollbar policy.
     */
    @Override
    public ScrollPane.ScrollBarPolicy getVbarPolicy() {
        return consolePane.getVbarPolicy();
    }

    /**
     * Set method for the console's context menu.
     * @param contextMenu the new context menu.
     */
    @Override
    public void setContextMenu(ContextMenu contextMenu) {
        consolePane.setContextMenu(contextMenu);
    }

    /**
     * Get method for the console's context menu.
     * @return the current context menu.
     */
    @Override
    public ContextMenu getContextMenu() {
        return consolePane.getContextMenu();
    }

}
