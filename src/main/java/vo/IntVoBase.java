package vo;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class IntVoBase {
    int value;

    public IntVoBase(final String value) {
        this.value = Integer.parseInt(value);
    }

    public IntVoBase(final int value) {
        this.value = value;
    }
}
