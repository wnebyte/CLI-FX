package iface;

import javafx.scene.control.ContextMenu;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Interface declares abstract methods for interacting with a console that extends the
 * javafx.scene.layout.Pane class.
 */
public interface IFXConsole extends IConsole {

    /**
     * Method for printing stylised-text to the abstract console.
     * @param text a text to be printed.
     * @param styles a collection of styles to be applied to the text.
     */
    void println(String text, Collection<String> styles);

    /**
     * Method for clearing the text-content of the abstract console.
     * @param b boolean value signals if the abstract console's history-content should also be cleared.
     */
    void clear(boolean b);

    /**
     * Set method for the abstract console's string consumer.
     * @param onMessageReceivedHandler new string consumer.
     */
    void setOnMessageReceivedHandler(Consumer<String> onMessageReceivedHandler);

    /**
     * Get method for the abstract console's javafx.scene.layout.Pane base class.
     * @return the javafx.scene.layout.Pane base class.
     */
    Pane getPane();

    /**
     * Set method for the abstract console's wrap-text property.
     * @param value new boolean value.
     */
    void setWrapText(boolean value);

    /**
     * Set method for the abstract console's editable property.
     * @param value new boolean value.
     */
    void setEditable(boolean value);

    /**
     * Set method for the abstract console's v-scrollbar policy.
     * @param scrollBarPolicy the new v-scrollbar policy.
     */
    void setVbarPolicy(ScrollPane.ScrollBarPolicy scrollBarPolicy);

    /**
     * Get method for the abstract console's v-scrollbar policy.
     * @return the current v-scrollbar policy.
     */
    ScrollPane.ScrollBarPolicy getVbarPolicy();

    /**
     * Set method for the abstract console's context menu.
     * @param contextMenu the new context menu.
     */
    void setContextMenu(ContextMenu contextMenu);

    /**
     * Get method for the abstract console's context menu.
     * @return the current context menu.
     */
    ContextMenu getContextMenu();

}