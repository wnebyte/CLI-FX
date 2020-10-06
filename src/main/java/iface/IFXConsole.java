package iface;

import javafx.scene.layout.Pane;

import java.util.Collection;
import java.util.function.Consumer;

/**
 * <summary>Interface which declares abstract methods, which need to be implemented
 * by a console class.</summary>
 */
public interface IFXConsole extends IConsole {

    /**
     * <summary>Abstract method for printing stylised text to a console.</summary>
     * @param text a text to be printed.
     * @param styles a collection of styles to be applied to the text.
     */
    void println(String text, Collection<String> styles);


    /**
     * <summary>Abstract method for clearing the content of a console.</summary>
     * @param b a boolean value signaling if in addition to the content of the console,
     *          the underlying history list should also be cleared.
     */
    void clear(boolean b);

    /**
     * <summary>Abstract SET method for the consumer field belonging to an instance of the ConsolePane class.</summary>
     * @param onMessageReceivedHandler the consumer to be assigned to an instance of the ConsolePane class.
     */
    void setOnMessageReceivedHandler(Consumer<String> onMessageReceivedHandler);

    /**
     * <summary>Abstract GET method for the pane 'property' belonging to an instance of the ConsolePane class.</summary>
     * @return the pane 'property' belonging to an instance of the ConsolePane class.
     */
    Pane getPane();
}
