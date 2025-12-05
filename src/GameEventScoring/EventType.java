package GameEventScoring;

import java.util.function.IntSupplier;

public enum EventType {

    KILL(() -> 50),
    DIE(() -> -20),
    LEVEL_UP(() -> 100);

    private final IntSupplier scoreSupplier;

    EventType(IntSupplier scoreSupplier) {
        this.scoreSupplier = scoreSupplier;
    }

    public int getScore() {
        return scoreSupplier.getAsInt();
    }
}
