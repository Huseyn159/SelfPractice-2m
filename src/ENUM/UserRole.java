package ENUM;

public enum UserRole {
    ADMIN {
        @Override
        public boolean hasPermission(String action) {
            return true;
        }
    },
    MODERATOR {
        @Override
        public boolean hasPermission(String action) {
            return !action.equalsIgnoreCase("READ");

        }
    },
    USER {
        @Override
        public boolean hasPermission(String action) {
            return action.equalsIgnoreCase("READ");
        }
    };


    public abstract boolean hasPermission(String action);







}
