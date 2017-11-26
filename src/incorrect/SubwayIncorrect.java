package incorrect;

public class SubwayIncorrect {

    private String bread;
    private String toast;
    private String cheese;
    private String condiments;

    private SubwayIncorrect(Builder builder) {
        this.bread = bread;
        this.toast = toast;
        this.cheese = cheese;
        this.condiments = condiments;
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

    public String getCondiments() {
        return condiments;
    }

    static Builder builder() {
        return new Builder();
    }


    public static class Builder {

        private String bread;
        private String toast;
        private String cheese;
        private String condiments;

        Builder() {
            this.bread = null;
            this.toast = null;
            this.cheese = null;
            this.condiments = null;
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

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public SubwayIncorrect build() {
            return new SubwayIncorrect(this);
        }
    }
}
