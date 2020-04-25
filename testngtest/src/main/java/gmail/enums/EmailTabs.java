package gmail.enums;

public enum EmailTabs {

    PRIMARY("PRIMARY"),
    SOCIAL("SOCIAL"),
    PROMOTIONS("PROMOTIONS");

    String section;

    EmailTabs(String section) {
        this.section = section;
    }

    public String section() {
        return this.section;
    }
}
