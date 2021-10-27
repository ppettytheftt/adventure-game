package Characters;

import java.util.List;

public class NonPlayerCharacter {
    private String name;
    private List<String> possibleDialogue;
    private List<String> responsesToUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPossibleDialogue() {
        return possibleDialogue;
    }

    public void setPossibleDialogue(List<String> possibleDialogue) {
        this.possibleDialogue = possibleDialogue;
    }

    public List<String> getResponsesToUser() {
        return responsesToUser;
    }

    public void setResponsesToUser(List<String> responsesToUser) {
        this.responsesToUser = responsesToUser;
    }
}
