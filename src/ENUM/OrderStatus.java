package ENUM;

public enum OrderStatus {

    CREATED {
        @Override
        public boolean canTransitTo(OrderStatus nextStatus) {
            return nextStatus == PAID || nextStatus == CANCELLED;
        }
    },
    PAID {
        @Override
        public boolean canTransitTo(OrderStatus nextStatus) {
            return nextStatus == SHIPPED || nextStatus == CANCELLED;

        }
    },
    SHIPPED{
        @Override
        public boolean canTransitTo(OrderStatus nextStatus) {
            return false;
        }
    },
    CANCELLED{
        @Override
        public boolean canTransitTo(OrderStatus nextStatus) {
            return false;
        }
    };

    public abstract boolean canTransitTo(OrderStatus nextStatus);





}
