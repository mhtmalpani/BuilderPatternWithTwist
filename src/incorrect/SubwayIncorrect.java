package incorrect;

public class SubwayIncorrect {

    private String bread;
    private String toast;
    private String cheese;
    private boolean onion;
    private boolean tomato;

    private SubwayIncorrect(Builder builder) {
        this.bread = builder.bread;
        this.toast = builder.toast;
        this.cheese = builder.cheese;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
    }

    public String getBread() {
        return bread;
    }

    public String getToast() {
        return toast;
    }

    public String getCheese() {
        return cheese;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isTomato() {
        return tomato;
    }

    static Builder builder() {
        return new Builder();
    }


    public static class Builder {

        private String bread;
        private String toast;
        private String cheese;
        private boolean onion;
        private boolean tomato;

        Builder() {
            this.bread = null;
            this.toast = null;
            this.cheese = null;
            this.onion = false;
            this.tomato = false;
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder toast(String toast) {
            this.toast = toast;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder onion() {
            this.onion = true;
            return this;
        }

        public Builder tomato() {
            this.tomato = true;
            return this;
        }


        public SubwayIncorrect build() {
            return new SubwayIncorrect(this);
        }
    }
}
