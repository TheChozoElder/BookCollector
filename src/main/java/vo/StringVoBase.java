package vo;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class StringVoBase {
    private final String value;

    public StringVoBase(final String value) {
        this.value = value;
    }

    public StringVoBase(final int value) {
        this.value = Integer.toString(value);
    }
}
