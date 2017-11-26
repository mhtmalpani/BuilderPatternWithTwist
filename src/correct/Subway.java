package correct;

import correct.helper.*;

public class Subway {

    //Member Variables
    private String bread;
    private boolean toast;
    private boolean veg;
    private boolean nonVeg;
    private boolean onion;
    private boolean tomato;
    private boolean olives;
    private boolean chicken;
    private boolean mutton;
    private String cheese;


    //Private constructor to avoid direct instantiation of the Subway class
    private Subway(Builder builder) {
        this.bread = builder.bread;
        this.toast = builder.toast;
        this.veg = builder.veg;
        this.nonVeg = builder.nonVeg;
        this.onion = builder.onion;
        this.tomato = builder.tomato;
        this.olives = builder.olives;
        this.chicken = builder.chicken;
        this.mutton = builder.mutton;
        this.cheese = builder.cheese;
    }


    //Returns the first mandatory attribute: Bread
    static Bread builder() {
        return new Builder();
    }


    //Builder class
    //This implements all the Helper functions and defines in the same way as simple Builder pattern
    public static class Builder implements Bread, Toast, Type, Veg, NonVeg, Extra {

        //Member variables
        private String bread;
        private boolean toast;
        private boolean veg;
        private boolean nonVeg;
        private boolean onion;
        private boolean tomato;
        private boolean olives;
        private boolean chicken;
        private boolean mutton;
        private String cheese;

        //Constructor that sets default values to all attributes.
        Builder() {
            this.bread = null;
            this.toast = false;
            this.veg = false;
            this.nonVeg = false;
            this.onion = false;
            this.tomato = false;
            this.olives = false;
            this.chicken = false;
            this.mutton = false;
            this.cheese = null;
        }

        public Toast bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Type toast(boolean toast) {
            this.toast = toast;
            return this;
        }

        public Veg veg() {
            this.veg = true;
            return this;
        }

        public NonVeg nonVeg() {
            this.nonVeg = true;
            return this;
        }

        public Veg onion() {
            this.onion = true;
            return this;
        }

        public Veg tomato() {
            this.tomato = true;
            return this;
        }

        public Veg olives() {
            this.olives = true;
            return this;
        }

        //This is a simple function to break out of the Vegetables category.
        public Extra prepare() {
            return this;
        }

        public Veg chicken() {
            this.chicken = true;
            return this;
        }

        public Veg mutton() {
            this.mutton = true;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Subway build() {
            return new Subway(this);
        }

    }


    @Override
    public String toString() {
        return "correct.Subway{" +
                "bread='" + bread + '\'' +
                ", toast=" + toast +
                ", veg=" + veg +
                ", nonVeg=" + nonVeg +
                ", onion=" + onion +
                ", tomato=" + tomato +
                ", olives=" + olives +
                ", chicken=" + chicken +
                ", mutton=" + mutton +
                ", cheese='" + cheese + '\'' +
                '}';
    }
}
