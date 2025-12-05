package GameEventScoring;

public class GameEvent {

    private final String player;
    private final EventType type;

    public GameEvent(String player, EventType type) {
        this.player = player;
        this.type = type;
    }


    public String getPlayer() {
        return player;
    }

    public EventType getType() {
        return type;
    }
}
