package Base;

import org.apache.poi.ss.formula.functions.T;

import com.google.inject.Provider;
import javax.inject.Inject;

public class TransferToPage {

    @Inject
    private Provider<T> pageToMove;

    public T moveToPage() {
        return pageToMove.get();

    }
}
