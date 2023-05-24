public class Citizen {

    private final String name;
    private final String surname;
    private final Country country;

    public Citizen(String name, String surname, Country country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname + " from " + this.country;
    }
}
