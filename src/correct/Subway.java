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


    //Constructor
    Subway(Builder builder) {
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


    //Returns the first mandatory field: Bread
    static Bread builder() {
        return new Builder();
    }


    //Builder class
    public static class Builder implements Bread, Toast, Type, Veg, NonVeg, Extra {

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
