package Carnivores;

public abstract class CatLike {
    private String name;
    private int averageAge;
    private int averageWeight;

    public CatLike(String name, int averageAge, int averageWeight) {
        this.name = name;
        this.averageAge = averageAge;
        this.averageWeight = averageWeight;
    }

    public String getName() {
        return name;
    }

    public int getAverageAge() {
        return averageAge;
    }

    public int getAverageWeight() {
        return averageWeight;
    }

    public abstract void voice();

    public abstract void description();

    public String aboutMe() {
        return String.format("My name is %s, my average age is %d, my weight is %d.", getName(),
                getAverageAge(), getAverageWeight());

    }

}
