package improvised;

public class SubwayImprovised {

    private String bread;
    private String toast;
    private String cheese;
    private boolean onion;
    private boolean tomato;

    //Private constructor to avoid direct instantiation of the Subway class
    private SubwayImprovised(Builder builder) {
        this.bread = builder.bread;
        this.toast = builder.toast;
        this.cheese = builder.cheese;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
    }


    //Getter methods
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


    //Function to obtain the builder object
    static Builder builder(String bread, String toast) {
        return new Builder(bread, toast);
    }


    //Our actual Builder class
    //This is a nested class
    public static class Builder {

        private String bread;
        private String toast;
        private String cheese;
        private boolean onion;
        private boolean tomato;

        //Public constructor with two mandatory attributes
        //The rest of the attributes are assigned to default values
        Builder(String bread, String toast) {
            this.bread = bread;
            this.toast = toast;
            this.cheese = null;
            this.onion = false;
            this.tomato = false;
        }

        //Each method assigns the value to the attribute associated
        //And returns the instance of the same object
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


        //The build function to create our final Subway object
        //This is to be called when all the attributes we need in the object has been called by client
        public SubwayImprovised build() {
            return new SubwayImprovised(this);
        }
    }
}