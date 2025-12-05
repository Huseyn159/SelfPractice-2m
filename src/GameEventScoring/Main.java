package GameEventScoring;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<GameEvent> gameEvents = List.of(
                new GameEvent("Ehmed",EventType.KILL),
                new GameEvent("Ehmed",EventType.KILL),
                new GameEvent("Ehmed",EventType.LEVEL_UP),

                new GameEvent("Alex", EventType.KILL),
                new GameEvent("Alex", EventType.LEVEL_UP),
                new GameEvent("Alex", EventType.DIE),

                new GameEvent("Bob", EventType.KILL),
                new GameEvent("Bob", EventType.KILL),
                new GameEvent("Bob", EventType.DIE),

                new GameEvent("Chris", EventType.LEVEL_UP),
                new GameEvent("Chris", EventType.KILL),
                new GameEvent("Chris", EventType.LEVEL_UP),

                new GameEvent("Diana", EventType.DIE)

        );



        int totalScore= gameEvents.stream()
                .mapToInt(n->n.getType().getScore())
                .sum();


    }

}
